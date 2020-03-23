/*
 * OverviewController.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package controller;

import dal.DetailDAO;
import dal.OverViewDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.Cake;

/**
 * OverviewController class.<br>
 * 
 * <pre>
 * Class này là 1 servlet thực hiện lấy các request và dữ liệu cần thiết
 *                                              để đẩy lên overview.jsp để xử lý
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・processRequest()
 * 
 *
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
@WebServlet(name = "OverviewController", urlPatterns = {"/overview"})
public class OverviewController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. <br/>
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            boolean noProduct = false;
            String text = (String) request.getParameter("CurrentPage");
            if(new DetailDAO().checkInt(text)==false){
                response.sendRedirect("error");
            }
            int currentPage = Integer.parseInt(text);
            
            if (currentPage > 0) {
                OverViewDAO data = new OverViewDAO();
                int totalPage = data.getTotalPages();
                List<Cake> arrCake = data.getCakeListByCurrPage(currentPage);
                if(arrCake.isEmpty()){
                   response.sendRedirect("error");
                }
                
                request.setAttribute("maxPage", totalPage);
                request.setAttribute("currentPage", currentPage);
                request.setAttribute("noProduct", noProduct);
                request.setAttribute("arrCake", arrCake);
                request.setAttribute("check", "overview");
                
                request.getRequestDispatcher("./client/overview.jsp").forward(request, response);
            } else {
                response.sendRedirect("error");
            }
        } catch (Exception ex) {
            Logger.getLogger(OverViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
