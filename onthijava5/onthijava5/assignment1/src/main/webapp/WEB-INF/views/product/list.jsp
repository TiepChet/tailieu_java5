<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
<div class="container mt-3">
    <table class="table">
        <thead>
        <tr>
            <th style="width:30%">Tên sản phẩm</th>
            <th style="width:30%">Nhóm sản phẩm</th>
            <th style="width:20%">Giá</th>
            <th style="width:20%"></th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${productList.size() == 0}">
            <tr>
                <td colspan="4">Chưa có sản phẩm</td>
            </tr>
        </c:if>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.name}</td>
                <td>${product.category.name}</td>
                <td>${product.price}</td>
                <td>
                    <a href="/delete-product/${product.id}" onclick="xoa()" class="btn btn-sm btn-danger">Xóa</a>
                    <a href="/product/view-update/${product.id}" class="btn btn-sm btn-secondary">Chỉnh sửa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/product/view-add" class="btn btn-primary btn-sm">Thêm sản phẩm</a>
</div>

<script>
    function xoa() {
        if (confirm("Bạn có chắc muốn xóa dữ liệu ?")) {
            return true;
        } else return false;
    }
</script>