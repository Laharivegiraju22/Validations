<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Form</title>
<meta charset="utf-8">
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
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2 style="color:navy;">Customer form</h2>
		<form id="form" name="form" action="/addCustomerToDb"
			style="background-color: silver;">
			</br>
			
			<div class="form-group">
				<label for="customerName">NAME :</label> <input type="text"
					class="form-control" id="customerName" placeholder="Enter name"
					name="customerName">
			</div>
			</br>
			
			<div class="form-group">
				<label for="age">AGE :</label> <input type="number"
					class="form-control" id="age" placeholder="Enter age" name="age">
			</div>
			</br>
			
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="http://localhost:8080/">go back</a> </br>
			</br>
		</form>
	</div>

</body>
<script>
$.validator.addMethod("alphabetsnspace", function(value, element) {
	return this.optional(element) || /^[a-zA-Z ]*$/.test(value);
});
$('form').validate({
	rules : {
		customerName: {
			required : true,
			alphabetsnspace : true,
		},
		age : {
			required : true,
			range : [ 18, 100 ]
		}

	},
messages:{
	"customerName":{
		required:"please enter name",
		alphabetsnspace:"please enter alphabets"
	}
}
});
</script>
</html>
