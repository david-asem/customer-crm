<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>
<head>

<title>Add New Customer</title>
<link type="text/css" rel="sytlesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="sytlesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>

		</div>
	</div>
	<div id="container">
		<h3>Add New Customer</h3>

		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">



			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="first_name" /></td>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="last_name" /></td>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					<tr>
						<td><label>Branch:</label></td>
						<td><form:input path="branch" /></td>
					<tr>
						<td><label>Address:</label></td>
						<td><form:input path="address" /></td>
					<tr>

						<td><label></label>
						<input type="submit" value="Save" class="save" />
						<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
						
					</tr>


				</tbody>
			</table>


		</form:form>

		<div style="clear;both"></div>

		
	</div>

</body>

</html>