<%@ page language="java" import="java.util.*" import="com.ssh.domain.Musics" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    <center>	  	
    	<p>Welcome ${sessionScope.user.username}</p>
    	<embed src="${path }" loop="false" autostart="true" >
    	</embed> 
    	<br><br>
    <table>
    	<c:forEach var="music" items="${requestScope.musics}" varStatus="status" >
    	<tr><td><c:out value="${status.count}" />&nbsp&nbsp</td><td>${music.musicname}</td></tr>
    	</c:forEach>
    </table>
    </center>
  </body>
</html>
