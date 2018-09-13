/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 758243
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstTextValue = request.getParameter("firstValue");
        String secondTextValue = request.getParameter("secondValue");
        
        request.setAttribute("first", firstTextValue);
        request.setAttribute("second", secondTextValue);
        
        if(request.getParameter("firstValue") == null 
                || request.getParameter("firstValue").equals("")
                || request.getParameter("secondValue") == null 
                || request.getParameter("secondValue").equals(""))
        {
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int firstValue = Integer.parseInt(firstTextValue);
        int secondValue = Integer.parseInt(firstTextValue);
        
        switch(request.getParameter("operation"))
        {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
