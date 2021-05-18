<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1> <center> Painting Service Bill Generation </center></h1>
<form:form method="post" action="/billDesk" modelAttribute="painting">
<center>
    <table>
        <tr>
            <td>
                <form:label path="serviceType">Choose Service</form:label>
            </td>
            <td>
                <form:select path="serviceType" items="${serviceList}" id="serviceType" />
            </td>
            <tr>
                <td>
                    <form:label path="area">Area</form:label>
                </td>
                <td>
                    <form:input path="area" id="area" />
                </td>
            </tr>
        </tr>
            <tr>
            <td>
            <input type="submit" name="submit" value="TotalCost">
            </td>
            </tr>
        </table>
        </center>
        </form:form>


</body>
</html>	 	  	    	    	     	      	 	
