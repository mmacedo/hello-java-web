<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-Edge">
    <title>Hello World - JSP (with include actions)</title>
  </head>
  <body>
    <jsp:include page="header.jsp" flush="true">
      <jsp:param name="from" value="JSP (with include actions)" />
    </jsp:include>
    <p>Quod Erat Demonstrandum</p>
  </body>
</html>
