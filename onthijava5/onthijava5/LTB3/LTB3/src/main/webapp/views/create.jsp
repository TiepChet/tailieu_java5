<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>LT Buoi 3</title>
</head>
<body>
<center>
    <h1>Thêm Cửa Hàng</h1>
    <%--    <form action="store" method="post">--%>
    <%--        <table>--%>
    <%--            <tr>--%>
    <%--                <td>Mã: </td>--%>
    <%--                <td><input type="text" name="ma"></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>Tên: </td>--%>
    <%--                <td><input type="text" name="ten"></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>Địa chỉ: </td>--%>
    <%--                <td><input type="text" name="diaChi"></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>Thành phố: </td>--%>
    <%--                <td><input type="text" name="thanhPho"></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>Quốc gia: </td>--%>
    <%--                <td><input type="text" name="quocGia"></td>--%>
    <%--            </tr>--%>
    <%--        </table>--%>
    <%--        <button type="submit">Them</button>--%>
    <%--    </form>--%>

    <%--@elvariable id="cuaHang" type="java"--%>
    <form:form action="store" modelAttribute="cuaHang" method="post">
        <div>
            <label>Mã: </label>
            <form:input path="ma"/>
            <br>
            <form:errors path="ma"  cssStyle="color: red" />
        </div>
        <div>
            <label>Tên: </label>
            <form:input path="ten"/>
            <br>
            <form:errors path="ten" element="div">Không được để trống tên</form:errors>
        </div>
        <div>
            <label>Địa chỉ: </label>
            <form:input path="diaChi"/>
            <br>
            <form:errors path="diaChi" element="div">Không được để trống địa chỉ</form:errors>
        </div>
        <div>
            <label>Thành Phố: </label>
            <form:input path="thanhPho"/>
            <br>
            <form:errors path="thanhPho" element="div">Không được để trống thành phố</form:errors>
        </div>
        <div>
            <label>Quốc gia: </label>
            <form:input path="quocGia"/>
            <br>
            <form:errors path="quocGia" element="div">Không được để trống quốc gia</form:errors>
        </div>
        <form:errors path="*">${mess}</form:errors>
        <button type="submit">Thêm</button>

    </form:form>
</center>
</body>
</html>