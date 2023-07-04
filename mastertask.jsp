<%-- 
    Document   : mastertask
    Created on : Jun 20, 2023, 10:57:35 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String str = (String)request.getAttribute("process");
if(str.equals("insertStudents")||str.equals("deletes") || str.equals("updatestudent")){
%>
<input type="hidden" value="${status}" id="status"/>
<% } %>
