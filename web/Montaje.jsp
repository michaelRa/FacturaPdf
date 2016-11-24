<%
    String targetModulo = request.getAttribute("targetModulo") == null ? "Factura.jsp" : (String) request.getAttribute("targetModulo");
%>
<jsp:include page="<%=targetModulo%>" flush="true"></jsp:include>