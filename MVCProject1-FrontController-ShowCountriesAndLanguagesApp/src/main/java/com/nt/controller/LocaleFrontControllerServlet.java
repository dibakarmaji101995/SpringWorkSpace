package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.handlers.CountriesHandler;
import com.nt.handlers.Handler;
import com.nt.handlers.LanguagesHandler;

public class LocaleFrontControllerServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String urlPattern=null;
		 Handler handler=null;
		 String lvn=null;
		 String resultPage=null;
		 RequestDispatcher rd=null;
         //get url pattern from request url
		urlPattern=req.getServletPath();
		//Navigation management
		if(urlPattern.equalsIgnoreCase("/lang.do")) {
			//create LanguageHandler class object
			handler=new LanguagesHandler();
		}
		else if(urlPattern.equalsIgnoreCase("/countries.do")){
			//create CountriesHandler class object
			handler=new CountriesHandler();
		}
		//invoke the handler method
		try {
			lvn=handler.execute(req, res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//view Management
		if(lvn.equalsIgnoreCase("show_lang")) {
			resultPage="/"+lvn+".jsp";
		}
		else if(lvn.equalsIgnoreCase("show_countries")) {
			resultPage="/"+lvn+".jsp";
		}
		//Dispatch the request to given page
		rd=req.getRequestDispatcher(resultPage);
		rd.forward(req, res);
	}//doget(-,-) method

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-) method

}
