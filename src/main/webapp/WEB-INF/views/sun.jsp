<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%--
	On this page we show the current weather.
	
	Model:
	- Sun sun
 --%>
<html>
<head>
<%@ include file="parts/head.jsp"%>
</head>
<body>
	<div class="nav">
		<a href="<c:url value="/"/>">Home</a>
	</div>
	<h1>Sun</h1>

	<p>
		<label>Current Sunrise: </label>
		<c:out value="${ sun1.sunRise }" />

	</p>
	<p>
		<label>Current Sunset: </label>
		<c:out value="${ sun1.sunSet }" />
	</p>



</body>
</html>