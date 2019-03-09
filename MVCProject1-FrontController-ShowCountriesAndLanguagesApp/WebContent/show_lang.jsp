<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<h1 style="color: red; text-align: center">Languages Result Page</h1>
<h1 style="color: green; text-align: center">All Languages are::</h1>
<%
	String langList[] = (String[]) request.getAttribute("lang_result");
	if (langList != null && langList.length > 0) {
		for (String c : langList) {
			if (c != null) {
				out.println("<br/>" + c);
			}
		}
	}
%>
<br/><br/>
<a href="index.html">Home</a>