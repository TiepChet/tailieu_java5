<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/05/2023
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="/san-pham/update/${sp.id}" method="post" modelAttribute="sp">
    ID: <form:input path="id"/> <form:errors path="id"/> <br>
    Mã: <form:input path="ma"/> <form:errors path="ma"/> <br>
    Tên: <form:input path="ten"/> <form:errors path="ten"/> <br>
    Giá: <form:input path="gia"/> <form:errors path="gia"/> <br>
    Loại:
    <form:select path="loai">
        <form:option value="loai 1">Loại 1</form:option>
        <form:option value="loai 2">Loại 2</form:option>
        <form:option value="loai 3">Loại 3</form:option>
        <form:option value="loai 4">Loại 4</form:option>
    </form:select>
    <button>Update</button>
</form:form>

</body>
</html>
