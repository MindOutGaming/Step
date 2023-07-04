<%-- 
    Document   : sign-up
    Created on : Jun 6, 2023, 4:00:05 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>STEP - sign-up Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="js/index.js"></script>   </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container-fluid w-75">
            <form>
                <div class="mb-3 mt-3">
                    <label for="username" class="form-label">Username:</label>
                    <input type="text" class="form-control" id="username" placeholder="Enter Username" name="username">
                </div>
                  <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
                </div>
                 <div class="mb-3">
                    <label for="cpassword" class="form-label">Confirm-Password:</label>
                    <input type="password" class="form-control" id="cpassword" placeholder="Enter Confirm-Password" name="cpassword">
                </div>
                <button class="btn btn-primary" onclick="return dateForm()">Submit</button>
                <button type="reset" class="btn btn-warning">RESET</button>
            </form>
            <br/>
            If you are not registered,kindly register here: <a href="index.jsp" class="link-primary">Login Form</a>
        </div>
                <input id="aj" type="hidden">

            </body></html>
