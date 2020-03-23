/*
 * OverViewDAO.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.Cake;

/**
 * OverViewDAO class.<br>
 * 
 * <pre>
 * Class chứa các method nhằm mục đích lấy dữ liệu cần từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・getTotalPages()
 * ・getCakeListByCurrPage()
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class OverViewDAO {
    /**Store DBContext object*/
    DBContext db = new DBContext();
    
    /**
     * Xử lí lấy tổng số trang<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ database ra để trả về totalPage sau khi đã phân trang
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy total record trong CSDL
     *   2.Dùng PrepareStatement để truyền tham số và thực hiện câu truy vấn.
     *   3. Kết quả của quá trình trên được lưu vào 1 ResultSet.
     *      3.1 Nếu kết quả ResultSet trả về Record, tạo 1 biến int nhận giá trị đó
     *          , sau đó gọi nó chia cho pageSize mà mình đã phân từ trước,
     *          kết quả nhận được sẽ được (totalPage) sẽ đc trả về.      
     *      3.2 Nếu không có record nào trong ResultSet thì return -1
     *   4.Đóng kết nối database 
     * ♦ Xử lí Exception
     *  ・Nếu không lấy được dữ liệu thì Exception sẽ được bắn ra
     * </pre>
     * 
     * @throws SQLException
     * @throws ClassNotFoundException
     * @return totalPage 
     * 
     */
    public int getTotalPages() throws Exception{
        int totalPage = 0;
        int totalRecord = 0;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
         
        try {
            String query = "Select count(*) as TotalRecord from Cake";
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                totalRecord = rs.getInt("TotalRecord");  
            }
            
            if(totalRecord % db.getPageSize() == 0){
                totalPage = totalRecord / db.getPageSize();
            }else{
                totalPage = (totalRecord / db.getPageSize()) + 1;
            }
            return totalPage;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OverViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  finally{
            db.closeConnection(rs, ps, con);
        }
        
        return -1;
    }
    
    /**
     * Xử lí lấy 1 list Cake của 1 trang thông qua index trang hiện tại.<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ database ra để trả về list Cake của trang hiện tại.
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy ra Record có index
     *          bằng với index currentPage ghi trong tham số truyền vào.
     *   2.Dùng PrepareStatement để truyền tham số và thực hiện câu truy vấn.
     *   3. Kết quả của quá trình trên được lưu vào 1 ResultSet.
     *      3.1 Nếu kết quả ResultSet trả về ít nhất 1 Record, tạo tạo 1 list
     *          chứa các record đó, sau đó return list vừa tạo
     *      3.2 Nếu không có record nào trong ResultSet thì return về list rỗng.
     *   4.Đóng kết nối database 
     * ♦ Xử lí Exception
     *  ・Nếu không lấy được dữ liệu thì Exception sẽ được bắn ra
     * </pre>
     * 
     * @param currentPage
     * @throws Exception 
     * @return ArrayList Cake
     */
    public List<Cake> getCakeListByCurrPage(int currentPage)throws Exception{
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        int start = (currentPage - 1) * db.getPageSize() + 1;
        int end = start + (db.getPageSize() - 1);
        
        List<Cake> list = new ArrayList<>();;
        try {
            
            String query = "Select * from ("
                    + " Select *, ROW_NUMBER() OVER (Order by id) AS Num from Cake "
                    + ") as C "
                    + " where C.Num >= ? and C.Num <= ?";
            
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, start);
            ps.setInt(2, end);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                String picture = db.getImagePath() + rs.getString("picture");
                int id = rs.getInt("id");
                String title = rs.getString("Title");
                float price = rs.getFloat("price");
                String sortContent = rs.getString("sortContent");
                String content = rs.getString("Content");
                Cake c = new Cake(id, title, price, sortContent, content, picture);
                list.add(c);
            }
            
            return list;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OverViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            db.closeConnection(rs, ps, con);
        }
        return list;
        
    }
    
    
    
    
}
