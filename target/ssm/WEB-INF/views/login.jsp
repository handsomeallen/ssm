
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<form action="/image" method="post" enctype="multipart/form-data">
<%--<p>用户名:<input type="text" name="userName" placeholder="请输入用户名"></p>

<p>密码:<input type="password" name="passwd" placeholder="请输入密码"></p>--%>

    <input type="file" name="image">

<p><input type="submit" value="确认"></p>

</form>
</body>
</html>
