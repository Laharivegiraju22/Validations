<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adding Debit card</title>
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
	<div class="container">
		<h2 style="color: navy;">Debit card Form</h2>
		<form id="form" name="form" action="/addDebitCardDetailsToDb"
			style="background-color: silver;">
			</br>
			<b>CUSTOMERS :</b> <select id="customerName" name="customerName">
				<c:forEach items="${customers}" var="customer">
					<option value="${customer.customerName}"><c:out
							value="${customer.customerName}"></c:out></option>
				</c:forEach>
			</select> </br>
			</br>
			<div class="form-group">
				<label for="debitCardNumber">Debit card Number :</label> <input type="text"
					class="form-control" id="debitCardNumber"
					placeholder="Enter debit card number" name="debitCardNumber" required>
			</div>
			</br>

			<div class="form-group">
				<label for="amount">Amount :</label> <input type="number"
					class="form-control" id="amount" placeholder="Enter amount" name="amount">
			</div>
			</br>
			<div class="form-group">
				<label for="expiry">Expiry date :</label> <input type="date"
					class="form-control" id="expiry" placeholder="Enter expiry date" name="expiry">
			</div>
			</br>

			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="http://localhost:8080/">go back</a> </br> </br>
		</form>
	</div>

</body>
<script>
	$.validator.addMethod("expiry",function(value,element){
		var currentDate=new Date();
		var expiryDate=new Date(value);
		if(currentDate<expiryDate||currentDate==expiryDate)
			return true;
		return false;
	});
	$.validator.addMethod("debitCard",function(value,element)
	{
		return this.optional(element) || /^([0-9]{15})$/.test(value);
	});
	$('form').validate({
	rules:{
		amount:{
			required:true,
			min:40000
		},
		expiry:{
			required:true,
			expiry:true
		},
		debitCardNumber:{
			required:true,
			debitCard:true
		}
		
	},
	messages:{
		"expiry":{
			required:"expiry date is required",
			expiry:"please enter a valid date"
		},
		"debitCardNumber":{
			required:"debit card is required",
			debitCard:"please enter a valid debit card number"
		}
		
	}
	});
</script>
</html>