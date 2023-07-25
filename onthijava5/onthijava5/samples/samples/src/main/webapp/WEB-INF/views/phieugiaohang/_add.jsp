<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form modelAttribute="phieugiaohang" method="post" action="/phieugiaohang/add">
    <p>Người nhận:
        <form:input path="nguoinhan"/>
        <form:errors path="nguoinhan" element="div"/>
    </p>
    <p>SĐT người nhận:
        <form:input path="sdtnhan"/>
        <div>${sdtNhanError}</div>
    </p>

    <p>
        Ngày giao: <form:input path="ngaygiao" placeholder="dd/MM/yyyy"/>
        <form:errors path="ngaygiao" element="div"/>
    </p>

    <p>Địa chỉ giao:
        <form:select path="diachigiao.madiachi">
            <option value="">----</option>
            <form:options items="${dsDiachi}"
                itemLabel="madiachi" itemValue="madiachi"
            />
        </form:select>
        <div>${maDiachiError}</div>
    </p>
    <p>
        Trạng thái:
        <form:radiobuttons path="trangthai" items="${dsTrangThai}"/>
        <form:errors path="trangthai" element="div"/>
    </p>
    ${message}
    <button>Add</button>
</form:form>