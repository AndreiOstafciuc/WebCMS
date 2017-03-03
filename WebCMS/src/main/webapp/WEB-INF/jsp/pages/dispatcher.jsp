<%--
  Created by IntelliJ IDEA.
  User: andre
  Date: 3/3/2017
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<%
    String pageName= (String) request.getAttribute("pageName");
    String pagePath="/WEB-INF/jsp/pages/"+pageName+".jsp";
%>
<jsp:include page="<%=pagePath%>"/>
</body>
</html>
