<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/10/31
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"
            +request.getServerPort()+request.getContextPath()+"/";//获取当前网页路径
%>
<html>
<head>
    <title>注册学生</title>
    <base href="<%=basePath%>"><!--如果使用相对路径，就需要加傻瓜绝对资质-->
</head>
<body>
<div align="center">
<form action="student/addstudent.do">
    <table>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
    </table>
    <input type="submit" value="注册学生">
</form>
</div>
</body>
</html>
