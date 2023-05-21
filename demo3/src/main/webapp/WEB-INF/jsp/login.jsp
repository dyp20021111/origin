<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>

<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <style type="text/css">
        div {
            width: 300px;
            height: 200px;
            margin-left: auto;
            margin-right: auto;
        }
    </style>

    <script language="JavaScript" type="text/JavaScript">

        function check(form){
//检查姓名是否填写
            var email = form.email.value;
            if(email.length==0){
                alert("请填写用户名！");
                form.email.focus();
                return false;
            }
            var password = form.password.value;
            if(password.length==0){
                alert("请填写密码！");
                form.password.focus();
                return false;
            }
        }

    </script>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table border="1">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>密&emsp;码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;"><input
                        type="submit" value="登录"></td>
            </tr>

        </table>
            <body>
            您还没有登录，请先登录！
            </body>
    </form>
</div>

</script>
</body>
</html>