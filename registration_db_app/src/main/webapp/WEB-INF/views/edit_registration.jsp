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
     <h2>registration | edit registration</h2>
     <form action="edit"method="post">
          <pre>
               
               Email<input readonly type="email"name="email"value=<%=request.getAttribute("email") %>>
               Mobile<input type="text"name="mobile"value=<%=request.getAttribute("mobile") %>>
               <input type="submit"value="update"/>
               
          
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