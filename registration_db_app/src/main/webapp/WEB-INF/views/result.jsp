<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.sql.ResultSet" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
     <h2>Registration | All Registrations</h2>
     <hr>
     <table border='1'>
           <tr>
               <th>Name</th>
               <th>City</th>
               <th>Email</th>
               <th>Mobile</th>
               <th>Delete</th>
               <th>Edit</th>
               
               
           </tr>
           
           <%
             ResultSet res=(ResultSet)request.getAttribute("result");
             while(res.next()){
            %>
	              <tr>
	               <td><%=res.getString(1) %></td>
	               <td><%=res.getString(2) %></td>
	               <td><%=res.getString(3) %></td>
	               <td><%=res.getString(4) %></td>
	               <td><a href="delete?email=<%=res.getString(3) %>"Onclick="return ConfirmDelete();">delete</a></td>
	               <td><a href="edit?email=<%=res.getString(3) %>&mobile=<%=res.getString(4) %>">edit</a></td>
	               
	               
	             </tr>
           
            
           
           <%} %>
     </table>

</body>
      <script>
         function ConfirmDelete()
         {
           return confirm("Are you sure you want to delete?");
         }
     </script>    
</html>