<%-- 
    Document   : students
    Created on : Jun 10, 2023, 4:33:06 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${Process == 'load'}">
    <ul class=" nav nav-pills">
    <li class="active"><a href="#">Add Students</a></li>
    <li><a href="#">Edit Students</a></li>
    <li><a href="#" >Delete Students</a></li>
    <li><a href="#" >View Students</a></li>
</ul>
</c:if>--%>
<%
String str = (String)request.getAttribute("process");
if(str.equals("load")){
%>
<ul class="nav nav-pills">
    <li class="active"><a onclick=" addstudent()">Add Students</a></li>
<li><a onclick="viewstudentloder('editstudent')">Edit Students</a></li>
<li><a onclick="viewstudentloder('deletestudent')">Delete Students</a></li>
<li><a onclick="viewstudentloder('viewstudent')">View Students</a></li>
</ul>
<div id="studentload">
    
</div>
<% } %>
<% if(str.equals("exam")) { %>
<ul class="nav nav-pills">
    <li class="active"><a onclick="">Add Exam</a></li>
<li><a onclick="">Edit Exam</a></li>
<li><a onclick="">Delete Exam</a></li>
<li><a onclick="">View Exam</a></li>
</ul>
<div id="examload">
    
</div>
<% } %>

