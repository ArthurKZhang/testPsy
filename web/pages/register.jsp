<%--
  Created by IntelliJ IDEA.
  User: sherry
  Date: 16/12/20
  Time: 下午3:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path;
    path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Register</title>
</head>
<body>

    <form id="registerForm"
          action="${pageContext.request.contextPath}/user/registerAction"
          method="post" class="form">
        <table>
            <tr>
                <td align="right">用户名：</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td align="right">密码：</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td align="right">确认密码：</td>
                <td><input type="password" name="repassword"/></td>
            </tr>
            <tr>
                <td style="padding-left:22px;">身份类型：</td>
                <td><input type="text" name="identity"/></td>
            </tr>
            <tr>
                <td align="right" colspan="2"><input type="submit" value="注册"/></td>

            </tr>
        </table>
    </form>
</body>
</html>
