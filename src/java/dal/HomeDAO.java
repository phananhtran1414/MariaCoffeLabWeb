/*
 * HomeDAO.java
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
import utility.Cake;
import utility.InforHome;

/**
 * HomeDAO class.<br>
 * 
 * <pre>
 * Class chứa các method nhằm mục đích lấy dữ liệu cần từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・getInforHomePage()
 * ・getListCake()
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class HomeDAO {
    /**Store DBContext object*/
    DBContext db = new DBContext();
    
    
    /**
     * Xử lí lấy dữ liệu InforHome trong CSDL.<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ CSDL ra để trả về dữ liệu của đối tượng InforHome.
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy ra hết các dữ liệu thuộc InforHome
     *   2.Dùng PrepareStatement để truyền tham số và thực hiện câu truy vấn.
     *   3. Kết quả của quá trình trên được lưu vào 1 ResultSet.
     *      3.1 Nếu kết quả ResultSet trả về record, tạo đối tượng InforHome mới, 
     *       set các giá trị và return đối tượng đầu tiên tìm được
     *      3.2 Nếu không có record nào trong ResultSet thì return về null.
     *   4.Đóng kết nối database
     * ♦ Xử lí Exception
     *  ・Nếu không lấy được dữ liệu thì Exception sẽ được bắn ra
     * </pre>
     * 
     * @throws SQLException 
     * @return InforHome object 
     */
    public InforHome getInforHomePage() throws SQLException{
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        InforHome bl = null;
        try {
            String sQuery = "SELECT * FROM HomePage";
            con = db.getConnection();
            
            pstmt = con.prepareStatement(sQuery);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String title = rs.getString("Title");
                String context = rs.getString("context");
                String picture = db.getImagePath() + rs.getString("picture");
                String sign1 = rs.getString("sign1");
                String sign2 = rs.getString("sign2");
                String sortContent = rs.getString("sortContent");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                bl = new InforHome(title, context, picture, sign1, sign2, sortContent, address, phone);
            }
            return bl;
        } catch (Exception e) {
            db.closeConnection(rs, pstmt, con);
            
        }
        return null;
        
    }
    
    /**
     * Xử lí lấy top2 list Cake<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ database ra để trả về top2 list Cake
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy top 2 Cake trong CSDL
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
     * @throws Exception
     * @return ArrayList Cake
     * 
     */
    public List<Cake> getListCake() throws Exception {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        Cake ca = null;
        List<Cake> arr = new ArrayList<>();
        try {
            String sQuery = "SELECT TOP 2 * FROM Cake";
            con = db.getConnection();
            
            ps = con.prepareStatement(sQuery);
            rs = ps.executeQuery();

            while (rs.next()) {
                String picture = db.getImagePath() + rs.getString("picture");
                int id = rs.getInt("id");
                String title = rs.getString("Title");
                float price = rs.getFloat("price");
                String sortContent = rs.getString("sortContent");
                String content = rs.getString("Content");

                ca = new Cake(id, title, price, sortContent, content, picture);
                arr.add(ca);
            }

        } catch (Exception e) {
            db.closeConnection(rs, ps, con);
            throw e;
        }
        return arr;
    }
    
    
    
    
}
