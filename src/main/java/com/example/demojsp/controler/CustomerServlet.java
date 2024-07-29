package com.example.demojsp.controler;

import com.example.demojsp.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "Customer List", value = "/customer-servlet")
public class CustomerServlet extends HttpServlet {
    List<Customer> customers;
    protected void setCustomers() {
        customers = new ArrayList<>();
        customers.add(new Customer("Hokager_Đệ tứ","12/04/1944", "Làng lá", "https://i.pinimg.com/736x/ef/e0/48/efe0486a1683acaf16a0b4ef8c6fff80.jpg"));
        customers.add(new Customer("Naruto","14/05/1999", "Làng lá", "https://i.pinimg.com/736x/0a/3c/fc/0a3cfcbd55ca2d2de2895797d7b95ba9.jpg"));
        customers.add(new Customer("Kakashi_","16/09/1888", "Làng lá", "https://i.pinimg.com/564x/f9/18/03/f91803e3936ec263d27da0259a90c27f.jpg"));
        customers.add(new Customer("Itachi","23/01/1998", "Làng lá", "https://i.pinimg.com/736x/ba/c1/1e/bac11e2f686a1dd531eb816c315da749.jpg"));
        customers.add(new Customer("Sasuke","29/12/2000", "Làng lá", "https://i.pinimg.com/736x/5b/8a/00/5b8a00497a0e9f6ea6d5f6fe62257762.jpg"));
        customers.add(new Customer("Luffy","11/12/1994", "Biển Đông", "https://i.pinimg.com/564x/d7/2c/d5/d72cd553ca62c79365da5de1b75f697a.jpg"));
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setCustomers();
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("customerList.jsp").forward(req, resp);
    }
}
