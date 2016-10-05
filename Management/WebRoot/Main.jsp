<%@ page language="java" import="java.util.*" import="com.ssh.domain.Users" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Users user = (Users)request.getSession().getAttribute("user");
String name = user.getUsername();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Main.jsp' starting page</title>
    
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
  	<p>Welcome ${sessionScope.user.username}</p>
    <table>
    	<tr><td><a href=mymusic.do>My music</a></td></tr>
    	<tr><td><a href=musiclist.do>Music list</a></td></tr>
    	<tr><td><a href=singer.do>Singer</a></td></tr>
    </table>
   </center>
  </body>
</html>
