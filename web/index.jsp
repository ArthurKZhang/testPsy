<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>

<head>
    <title>Login</title>
</head>
<body>


    <form id="loginForm"
          action="${pageContext.request.contextPath}/user/loginAction"
          method="post" class="form">
    <h3>请登陆</h3>
    <br />
    <table style="line-height:40px;/*行高*/">
        <tr>
            <td style="padding-left:22px;">用户名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td style="padding-left:22px;">密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>

            <td colspan="2" align="center" >
                <input id="submit" class="btn" type="submit" value="登陆"/>
                <input id="reset" class="btn" type="reset" value="重置"/>
                <a href="${pageContext.request.contextPath}/pages/register.jsp">注册</a>
            </td>
        </tr>

    </table>

</form>

</body>
</html>
