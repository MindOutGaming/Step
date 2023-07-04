/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package bhavesh.com.step.controller;

import bhavesh.com.step.service.processStudentservice;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class processStudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          try{
            
               String process = request.getParameter("process");
           if(process.equals("viewstudent")||process.equals("editstudent")||process.equals("deletestudent")){
           ResultSet rs = processStudentservice.getallstudent();
           request.setAttribute("result", rs);
           request.setAttribute("process", process);
           RequestDispatcher view = request.getRequestDispatcher("studentajax.jsp");
           view.forward(request, response);
            }
          else if(process.equals("addstudent")){
               request.setAttribute("process", process);
           RequestDispatcher view = request.getRequestDispatcher("studentajax.jsp");
           view.forward(request, response);
            }
         else if (process.equals("insertStudents")) {
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String email = request.getParameter("email");
                String state = request.getParameter("state");
                String city = request.getParameter("city");

                int result = processStudentservice.insertstudent(name, address, email, state, city);
                request.setAttribute("process", process);
                request.setAttribute("status", result);
                RequestDispatcher view = request
                    .getRequestDispatcher("mastertask.jsp");

                view.forward(request, response);
            
            }  
         else if (process.equals("deletes")) {
            
                String email = request.getParameter("email");
                int result = processStudentservice.deletedst(email);
                request.setAttribute("process", process);
                request.setAttribute("status", result);
                RequestDispatcher view = request
                    .getRequestDispatcher("mastertask.jsp");

                view.forward(request, response);
            
            }
           else if(process.equals("edits")){
               request.setAttribute("process", process);
           RequestDispatcher view = request.getRequestDispatcher("studentajax.jsp");
           view.forward(request, response);
            }
           else if (process.equals("updatestudent")) {
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String email = request.getParameter("email");
                String state = request.getParameter("state");
                String city = request.getParameter("city");

                int result = processStudentservice.updatestudent(name, address, state, city,email);
                request.setAttribute("process", process);
                request.setAttribute("status", result);
                RequestDispatcher view = request
                    .getRequestDispatcher("mastertask.jsp");

                view.forward(request, response);
            
            }
           if(process.equals("searchstudent")){
            String email = request.getParameter("email");
           ResultSet rs = processStudentservice.searchstudents(email);
           request.setAttribute("result", rs);
           request.setAttribute("process", process);
           RequestDispatcher view = request.getRequestDispatcher("studentajax.jsp");
           view.forward(request, response);
            }
          }catch(SQLException e){}
          
        } finally {
            out.close();
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
