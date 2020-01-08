<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Details of Customers</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script>
	src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
</script>
</head>
<body>
	<form style="background-color: silver;">
		<div class="container">
			
				<c:forEach items="${customers}" var="customer">
				<div class="row">
				<div class="col-md-12">
				<h2><c:out value="${customer.customerName}"></c:out></h2>
				<table border="1" style="background-color:fuchsia;">
				<tr>
				<th>debitCardNumber</th>
				<th>amount</th>
				<th>expiry</th></tr>
				<c:forEach items="${customer.debitCards}" var="debitCard">
				<tr>
				<td><c:out value="${debitCard.debitCardNumber}"></c:out></td>
				<td><c:out value="${debitCard.amount}"></c:out></td>
				<td><c:out value="${debitCard.expiry}"></c:out></td>
				</tr>
				
				</c:forEach>
				</table>
				</div>
   				</div>
				</c:forEach>
				</br></br></br></br></br></br>
				
		</div>
	</form>
</body>
</html>