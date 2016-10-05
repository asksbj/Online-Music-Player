<%@ page language="java" import="java.util.*" import="com.ssh.domain.Musics" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List<Musics> list = (List<Musics>)request.getSession().getAttribute("mymusic");
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
    	<c:forEach var="music" items="${sessionScope.mymusic}" varStatus="status" >
    	<tr><td><center><a href=playMymusic.do?id=${music.musicid}>${music.musicname}</a></center></td></tr>
    	</c:forEach>
    </table>
   </center>
  </body>
</html>
