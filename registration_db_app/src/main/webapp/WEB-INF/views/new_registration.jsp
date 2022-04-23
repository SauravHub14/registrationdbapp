<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>
     <h2>registration | new registration</h2>
     <form action="reg"method="post">
          <pre>
               Name<input type="text"name="name"/>
               City<input type="text"name="city"/>
               Email<input type="email"name="email"/>
               Mobile<input type="text"name="mobile"/>
               <input type="submit"value="save"/>
               
          
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