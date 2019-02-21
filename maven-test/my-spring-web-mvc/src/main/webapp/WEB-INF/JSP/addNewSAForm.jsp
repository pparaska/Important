<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="sprng" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">
.error {
	color: red
}
	<sping:form action="createAccount">
		<center>
			<label>Enter Account Holder Name: </label> <input type="text"
				name="txtAccHN" /> <br /> <label>Enter Account Balance: </label> <input
				type="number" name="txtBalance" /> <br /> <label>Salaried?:
			</label> <input type="radio" name="rdSalary" value="Yes" /> Yes <input
				type="radio" name="rdSalary" value="No" /> No <br /> <input
				type="submit" value="Submit" /> <input type="reset" value="Clear" />
		</center>
	</spring:form>
	<div>
		<jsp:include page="home.jsp"></jsp:include>
	</div>
</body>
</html>

<spring:form action="save" method="post" modelAttribute="employee">
		<sprng:message code="message.empId"/>: <spring:input path="empId" />
		<spring:errors path="empId" cssClass="error" />
		<br /> 
		<sprng:message code="message.empName"/>: <spring:input path="empName" />
		<spring:errors path="empName" cssClass="error" />
		<br />
		<sprng:message code="message.salary"/>: <spring:input path="salary" />
		<spring:errors path="salary" cssClass="error" />
		<br />
		<input type="submit" value="Submit" />
	</spring:form>









