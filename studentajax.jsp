<%-- 
    Document   : studentajax
    Created on : Jun 18, 2023, 10:33:21 AM
    Author     : Lenovo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String str = (String)request.getAttribute("process");
if(str.equals("viewstudent") || str.equals("editstudent") || str.equals("deletestudent") || str.equals("searchstudent")){
%>

 <%
           if(str.equals("viewstudent")){ 
        %>
<form class="navbar-right">
    <input class="" type="search" placeholder="Email" aria-label="Search" id="search">
        <button class="btn btn-warning" onclick="searchstudentloder()">Search</button>
      </form>
          <% } %>

<table class="table table-bordered">
    <thead>
        <tr>
            <th>Name</th>
            <th>address</th>
            <th>Email</th>
            <th>State</th>
            <th>City</th>
        </tr>
    </thead>
    <tbody>
        
        <% 
                ResultSet rs = (ResultSet)request.getAttribute("result");
                while(rs.next()){
            %>
        <tr>
           <td><%=rs.getString("name")%></td>
           <td><%=rs.getString("address")%></td>
           <td><%=rs.getString("email")%></td>
           <td><%=rs.getString("state")%></td>
            <td><%=rs.getString("city")%></td>
            <%
           if(str.equals("editstudent")){ 
        %>
    <td>
        <input type="button" class="btn-warning" value="Edit" onclick="editstudents()"/>
    </td>
          <% } %>
          
           <%
           if(str.equals("deletestudent")){ 
        %>
    <td>
        <input type="button" class="btn-danger" onclick="deletestudent()" value="Delete"/>
    </td>
          <% } %>
        </tr>
        
          
          
        <% } %> 
    </tbody>
</table>
     
<% } %>

<%
if(str.equals("addstudent")||str.equals("edits") ){
%>
         <div class="mx-auto" style="width:75%">
           <% if(str.equals("addstudent")){ %>
                   <h2>Add Students Form</h2>

          <% } %>
           <% if(str.equals("edits")){ %>
                   <h2>Edit Students Form</h2>

          <% } %>
        <form id="studentform" method="post">
            <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name">
          </div>
            <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" class="form-control" id="address" name="address">
          </div>
          <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" class="form-control" id="email" name="email">
          </div>
            <div class="form-group">
            <label for="state">State:</label>
            <input type="text" class="form-control" id="state" name="state">
          </div>
            <div class="form-group">
            <label for="city">City:</label>
            <input type="text" class="form-control" id="city" name="city">
          </div>
            <% if(str.equals("addstudent")){ %>
          <button class="btn btn-primary" onclick="return ValidateStudentForm('insertStudents')">Add Students</button>
          <% } %>
           <% if(str.equals("edits")){ %>
          <button class="btn btn-primary" onclick="return ValidateStudentForm('updatestudent')">Edit Students</button>
          <% } %>
          <button type="reset" class="btn btn-warning">Reset</button>
        </form>
    </div>
    <div id="processAjax">
        
    </div>       
<% } %>
