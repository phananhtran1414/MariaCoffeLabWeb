/*
 * DetailDAO.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utility.Cake;

/**
 * DetailDAO class.<br>
 * 
 * <pre>
 * Class chứa các method nhằm mục đích lấy dữ liệu cần từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・getCakebyID()
 * ・checkInt()
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class DetailDAO {
    /**Store DBContext object*/
    DBContext db = new DBContext();

    
    /**
     * Xử lí lấy 1 đối tượng Cake thông qua Id.<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ database ra để trả về 1 Cake hoàn chỉnh.
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy ra Record có Id bằng với Id ghi trong tham số truyền vào.
     *   2.Dùng PrepareStatement để truyền tham số và thực hiện câu truy vấn.
     *   3. Kết quả của quá trình trên được lưu vào 1 ResultSet.
     *      3.1 Nếu kết quả ResultSet trả về ít nhất 1 Record, tạo 1 đối tượng Cake mới, 
     *          set các giá trị cho đối tượng đó sau đó return về chính đối tượng đó.
     *      3.2 Nếu không có record nào trong ResultSet thì return về null.
     *   4.Đóng kết nối database
     * ♦ Xử lí Exception
     *  ・Nếu không lấy được dữ liệu thì Exception sẽ được bắn ra
     * </pre>
     * 
     * @param ID
     * @throws Exception 
     * @return Cake object 
     */
    public Cake getCakebyID(int ID) throws Exception {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        Cake ca = null;
        try {
            String sQuery = "SELECT * FROM Cake WHERE id = ?";

            con = db.getConnection();
            ps = con.prepareStatement(sQuery);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                String picture = db.getImagePath() + rs.getString("picture");
                int id = rs.getInt("id");
                String title = rs.getString("Title");
                float price = rs.getFloat("price");
                String sortContent = rs.getString("sortContent");
                String content = rs.getString("Content");
                ca = new Cake(id, title, price, sortContent, content, picture);
            }
            return ca;
            
        } catch (Exception e) {
            db.closeConnection(rs, ps, con);
        }
        return null;
    }
    
    /**
     * Check valid integer.<br>
     * 
     * <pre>
     * Method sẽ kiểm tra tham số truyền vào có phải là số nguyên không
     * 
     * ♦ Trình tự xử lí.
     *   
     *   1.parse biến tham số truyền vào
     *   2.Nếu parse thành công thì trả về true, và ngược lại
     *        
     * </pre>
     * 
     * @param tmp
     * @return boolean 
     */
    public boolean checkInt(String tmp){
        int a;
        try{
            a = Integer.parseInt(tmp);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
        
    }
}
