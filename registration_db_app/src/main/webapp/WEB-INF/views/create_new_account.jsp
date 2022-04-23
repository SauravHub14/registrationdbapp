<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>
     <h2>new user  | create new account</h2>
     <form action="newAccount"method="post">
          <pre>
               
               Email<input  type="email"name="email"/>
               password<input type="password"name="password"/>
               <input type="submit"value="create new account"/>
               
          
          </pre>
      </form>
      
      <div>
     <%
     if(request.getAttribute("message")!=null){
    	 out.println(request.getAttribute("message"));
     }
     
     %>
     
     </div>

</body>
</html>