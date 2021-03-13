<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>

<title>Customer Database For CRM</title>




	<link type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">


</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM-CUSTOMER RELATIONSHIP MANAGEMENT DATABASE</h2>


			<div id="container">
				<div id="content">

					<table class="styled-table">
						<thead>
							<tr>
								<th>ID</th>
								<th>Fist Name</th>
								<th>Last Name</th>
								<th>Email</th>
								<th>Branch</th>
								<th>Address</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="tempCustomer" items="${customers}">


								<tr class="active-row">

									<td>${tempCustomer.id}</td>
									<td>${tempCustomer.first_name}</td>
									<td>${tempCustomer.last_name}</td>
									<td>${tempCustomer.email}</td>
									<td>${tempCustomer.branch}</td>
									<td>${tempCustomer.address}</td>

								</tr>

							</c:forEach>


							<!-- and so on... -->
						</tbody>
					</table>

				</div>

			</div>
		</div>
	</div>

</body>

</html>