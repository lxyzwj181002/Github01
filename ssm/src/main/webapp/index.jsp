<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/10/31
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"
    +request.getServerPort()+request.getContextPath()+"/";//获取当前网页路径
%>
<html>
<head>
    <title>学生注册</title>
    <base href="<%=basePath%>"><!--如果使用相对路径，就需要加傻瓜绝对资质-->
</head>
<body>
<div align="center">
<img src="images/ssm.webp"/>
<table>
    <tr>
        <td><a href="Addstudent.jsp">学生注册</a></td>
    </tr>
    <tr>
        <td><a href="listStudent.jsp">浏览信息</a></td>
    </tr>
</table>
</div>
</body>
</html>
