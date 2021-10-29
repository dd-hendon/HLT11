<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1><%= "Register" %>
</h1>
<br>
<p>Create your account. It's free and only takes a minute.</p>
<br>
<form action="JDBC-servlet">

    <input type="text" name="firstName" placeholder="First Name"/>
    <input type="text" name="lastName" placeholder="Last Name"/><br>
    <input type="email" name="email" placeholder="Email"/><br>
    <input type="password" name="password" placeholder="Password"/><br>
    <input type="password" name="confirmPassword" placeholder="Confirm Password"/><br><br>

    <input type="submit" name="registerNow" value="Register Now"/>

</form>

</body>
</html>