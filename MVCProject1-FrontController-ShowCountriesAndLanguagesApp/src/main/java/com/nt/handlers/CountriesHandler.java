package com.nt.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountriesHandler implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale locales[]=null;
		String countries[]=null;
		int i=0;
//	    List<String> list=new ArrayList<String>();
		countries=new String[10000];
		//get Locale class object
		locales=Locale.getAvailableLocales();
		//get all languages
		/*
		 for(Locale lcl:locales) { 
		 list.add(lcl.getDisplayCountry());
		  }
		 */
		for(Locale lcl:locales) {
			countries[i]=lcl.getDisplayCountry();
			++i;
		}
		System.out.println(Arrays.toString(countries));
		//keep result in request scope
		req.setAttribute("countries_result",countries);
		return "show_countries";
	}

}
