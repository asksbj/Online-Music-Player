<%@ page language="java" import="java.util.*" import="com.ssh.domain.Musiclist" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    	<c:forEach var="list" items="${sessionScope.musiclists}" varStatus="status" >
    	<tr><td><c:out value="${status.count}" />&nbsp&nbsp</td><td><a href=listmusics.do?id=${list.listid}>${list.listname}</a></td></tr>
    	</c:forEach>
    </table>
   </center>
  </body>
</html>
