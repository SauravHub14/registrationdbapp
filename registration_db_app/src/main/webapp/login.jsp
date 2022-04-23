<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
     <h2>Login Here</h2>
     <hr>
     <div>
     <%
     if(request.getAttribute("newAccountCreated")!=null){
    	 out.println(request.getAttribute("newAccountCreated"));
     }
     
     %>
     <%
     if(request.getAttribute("error")!=null){
    	 out.println(request.getAttribute("error"));
     }
     
     %>
      <%
     if(request.getAttribute("logOutMsg")!=null){
    	 out.println(request.getAttribute("logOutMsg"));
     }
     
     %>
     
     </div>
     
     <div>
         <form action="verifyLogin"method="post">
           email:<input type="email"name="email"/>
           password:<input type="password"name="password"/>
           <input type="submit"value="Login"/>
     
     
        </form>
     
     
     </div>
     <a href="newAccount">create new account</a>
     

</body>
</html>