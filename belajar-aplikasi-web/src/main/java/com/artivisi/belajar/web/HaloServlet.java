package com.artivisi.belajar.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/halo")
public class HaloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nama = req.getParameter("tamu");
        
        String output = "<html>\n";
        output += "<head><title>HaloServlet</title></head>\n";
        output += "<body><h1>Halo Servlet</h1>\n";
        
        output += "<h2>Halo "+nama+" ;\n)";
        
        Date sekarang = new Date();
        
        output += "<h2>Waktu saat ini : "+sekarang+"</h2>\n";
        output += "</body></html>\n";
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(output);
        writer.flush();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    
}
