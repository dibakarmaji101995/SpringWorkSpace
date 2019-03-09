<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1 style="color:red;text-align:center">Countries Result Page</h1>    
<h1 style="color:green;text-align:center">All Countries are::</h1>
<%
   String countriesList[]=(String[])request.getAttribute("countries_result");
   if(countriesList!=null && countriesList.length>0){
	   for(String c:countriesList){
		   if(c!=null && c!=""){
		      out.println("<br/>"+c);
		   }
	   }
   }

%>
<br/><br/>
<a href="index.html">Home</a>