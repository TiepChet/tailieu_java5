<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form:form action="/khach-hang/update/${khachHang.maKhachHang}" method="post" modelAttribute="khachHang">
    Tên Khách Hàng: <form:input path="tenKhachHang"/> <form:errors path="tenKhachHang"/> <br>
    Số Điện Thoại: <form:input path="soDienThoai"/> <form:errors path="soDienThoai"/> <br>
    Giới Tính: <form:radiobutton value="true" path="gioiTinh"/> Nam
    <form:radiobutton value="false" path="gioiTinh"/> Nữ
    <form:errors path="gioiTinh"/> <br>
    Hạng Khách Hàng:
    <form:select path="hangKhachHang">
        <c:forEach items="${listHKH}" var="hkh">
            <option value="${hkh.maHang}" ${hkh.maHang==khachHang.hangKhachHang.maHang?"selected":""}>${hkh.maHang}-${hkh.tenHang}</option>
        </c:forEach>
    </form:select>
    <label>${error}</label>
    <br>
    <button onclick="sua()">Sứa</button>
</form:form>

<script>
    function sua() {
        if (confirm("Bạn muốn sửa dữ liệu ?")){
            return true;
        }
    }
</script>
</body>
</html>