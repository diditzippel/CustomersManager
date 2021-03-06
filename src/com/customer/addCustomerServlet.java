package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * Servlet implementation class addCustomerServlet
 */
@WebServlet("/bankManager")
public class addCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected ServletContext context;
	
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	    context = config.getServletContext();	    
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
        String typeAction = request.getParameter("action");
		
		if (typeAction.equals("getAllCustomer")){
			ObjectMapper objectMapper = new ObjectMapper();
	    	String listToJson = objectMapper.writeValueAsString(Customer.listFromJsonObject);
	    	System.out.println("Convert List of customers objects to JSON :");
	    	System.out.println(listToJson);
	    	
            response.setContentType("application/json");// set content to json
	    	PrintWriter out = response.getWriter();
	    	out.write(listToJson);
	    	
	    	out.flush();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
        String typeAction = request.getParameter("action");
        
        // Check the action of      
        if (typeAction.equals("addCustomer")){

        	String jsonObjectBeforeCasting = request.getParameter("customer");
        	Customer customer = new ObjectMapper().readValue(jsonObjectBeforeCasting, Customer.class);
        	Customer.listFromJsonObject.add(customer);
        	
            System.out.println(customer.getFirstName() + " - " + 
            				   customer.getLastName() + " - " + 
            				   customer.getMail() + " - " + 
            		           customer.getPhone() + " - " + 
            				   customer.getAdress() + " - " + 
            		           customer.getState() + " - " + 
            				   customer.getCity());
        }
	}
}
