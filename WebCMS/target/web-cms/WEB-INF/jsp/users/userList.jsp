<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>List of Users</title>
</head>
<body>
<table border="1" align="center" style="width:50%">
            <thead>
            <tr>
                    <th>User Id</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Id role</th>
                </tr>
        </thead>
            <tbody>
            <c:forEach var="users" items="${users}" >
                    <tr>
                        <td>${users.id}</td>
                        <td>${users.username}</td>
                        <td>${users.password}</td>                  
                        <td>${users.id_role}</td>                  
                    </tr>
                </c:forEach>
        </tbody>
        </table>
</body>
</html>