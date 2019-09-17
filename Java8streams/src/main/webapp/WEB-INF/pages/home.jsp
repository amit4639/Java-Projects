<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		
		<form:form action="search"  modelAttribute="searchEmployee">
		Employee Name:<form:input path="empName"/><br/><br/>
						AND:<br/><br/>
		Employee Band :<form:select path="emp_tblband">
						<form:option value='0'>SELECT</form:option>
						<form:option value='E'>Employee</form:option>
						
						<form:option value='C'>Contractor</form:option>
						<form:option value='M'>Manager</form:option>
						</form:select>
						
		
				AND:<br/><br/>
		Employee Salary :<form:input path="salary"/>
		
		<input type="submit" value="Search"/>
		</form:form>
		<h2>Number of Employee: ${listEmployee.size()}</h2>
		
		<table border="1">

			<th>EmployeeNO</th>
			<th>EmployeeName</th>
			<th>Salary</th>
			<th>EmployeeBand</th>
			<th>DateOfJoin</th>
			

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.empNo}</td>
					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.emp_tblband}</td>
					<td>${employee.dateOfJoin}</td>
									
				    
				</tr>
			</c:forEach>
		</table>
		
		<h4>
			New Employee Register <a href="newEmployee">here</a>
	
		</h4>
	
	</div>
</body>
</html>