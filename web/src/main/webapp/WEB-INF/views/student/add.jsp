<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
    <div style="width: 25%; margin-left: auto; margin-right: auto;">
        <p style="margin: 0">注册</p>
        <form action="${website}add" method="post">
            用户名: <input type="text" name="userName" /> <br />
            密  码： <input type="password" name="password" /> <br />
            <input type="submit" value="注册" />
            <input type="reset" value="重置" />
        </form>
    </div>
</body>
</html>