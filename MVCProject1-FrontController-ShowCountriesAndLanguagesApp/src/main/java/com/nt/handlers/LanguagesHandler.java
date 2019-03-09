package com.nt.handlers;

import java.util.Arrays;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LanguagesHandler implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale locales[]=null;
		String languages[]=null;
		int i=0;
//	    List<String> list=new ArrayList<String>();
		languages=new String[300];
		//get Locale class object
		locales=Locale.getAvailableLocales();
		//get all languages
		/*
		 for(Locale lcl:locales) { 
		 list.add(lcl.getDisplayCountry());
		  }
		 */
		for(Locale lcl:locales) {
			languages[i]=lcl.getDisplayLanguage();
			++i;
		}
		System.out.println(Arrays.toString(languages));
		//keep result in request scope
		req.setAttribute("lang_result",languages);
		return "show_lang";
	}

}
