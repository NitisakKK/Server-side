<%--
  Created by IntelliJ IDEA.
  User: nitisakkangkhan
  Date: 8/9/2023 AD
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Subject List</title>
</head>
<body>
  <table>
    <tr style=""...>
      <td>Subject Code</td>
      <td>Title</td>
      <td>Creadit</td>
    </tr>
    <c:forEach items="${subjects}" var="subject">
      <tr>
        <td>${subject.id}</td>
        <td>${subject.title}</td>
        <td>${subject.creadit}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
