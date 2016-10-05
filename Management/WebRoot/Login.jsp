<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<center>
  		<h1><b>Asks Music</b></h1>
  		<form name="form1" action="login.do" method="post">
       		Username: <input type = "text"  name = "username" ><br><br>
       		Password: <input type = "password" name = "password" ><br><br>
       		 <a href="Register.jsp">Signup</a>&nbsp&nbsp&nbsp&nbsp&nbsp
       		<input type = "submit" value = "login"><br><br>
    	</form>
  	</center>
    
  </body>
</html>
