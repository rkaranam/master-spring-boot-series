<html>
<head>
    <title>Login Jsp Page</title>
</head>
<body>
    <h3>Spring Boot: Login JSP Page</h3>
    <h4><font color="red">${error_message}</font></h4>
    <form method="post">
        <label for="name">Name : </label><input type="text" name="name"/>
        <label for="password">Password : </label><input type="password" name="password"/>
        <input type="submit"/>
    </form>
</body>
</html>