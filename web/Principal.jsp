<%
    String target = request.getAttribute("target") != null ? (String) request.getAttribute("target") : "Login.jsp";
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>     
    </head>
    <body>
        <jsp:include page="<%=target%>" flush="true"/>
    </body>
</html>