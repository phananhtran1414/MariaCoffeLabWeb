/*
 * FindCafeDAO.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utility.FindCafe;

/**
 * FindCafeDAO class.<br>
 * 
 * <pre>
 * Class chứa các method nhằm mục đích lấy dữ liệu cần từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・getInfoFindPage()
 * 
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class FindCafeDAO {
    /**Store DBContext object*/
    DBContext db = new DBContext();
    
    /**
     * Xử lí lấy dữ liệu FindCafe trong CSDL.<br>
     * 
     * <pre>
     * Method sẽ lấy dữ liệu từ database ra để trả về dữ liệu của đối tượng FindCafe.
     * Trường hợp lấy dữ liệu thất bại thì thực hiện ném exception.
     * 
     * ♦ Trình tự xử lí.
     *   1.Viết câu query để lấy ra hết các dữ liệu thuộc FindCafe
     *   2.Dùng PrepareStatement để truyền tham số và thực hiện câu truy vấn.
     *   3. Kết quả của quá trình trên được lưu vào 1 ResultSet.
     *      3.1 Nếu kết quả ResultSet trả về record, tạo 1 đối tượng FindCafe mới, 
     *       set các giá trị và return đối tượng đầu tiên tìm được
     *      3.2 Nếu không có record nào trong ResultSet thì return về null.
     *   4.Đóng kết nối database
     * ♦ Xử lí Exception
     *  ・Nếu không lấy được dữ liệu thì Exception sẽ được bắn ra
     * 
     * </pre>
     * 
     * @throws Exception
     * @return FindCafe object
     */
    public FindCafe getInfoFindPage() throws Exception {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        FindCafe bl = null;
        try {
            String sQuery = "SELECT * FROM FindCafe";
            con = db.getConnection();
    
            ps = con.prepareStatement(sQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                String map = db.getImagePath() + rs.getString("pictureMap");
                String address = rs.getString("addres");
                int tel = rs.getInt("tel");
                String email = rs.getString("email");
                String close = rs.getString("closed");
                String op1 = rs.getString("opened1");
                String op2 = rs.getString("opened2");
                bl = new FindCafe(address, tel, email, close, op1, op2, map);
            }
            
        } catch (Exception e) {
            db.closeConnection(rs, ps, con);
            throw e;
        }
        return bl;
    }
}
