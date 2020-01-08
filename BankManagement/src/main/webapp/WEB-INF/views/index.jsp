<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Management App</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form class="form-inline md-form mr-auto mb-4" style="background-color:silver;" id="form" name="form">
		<div clasbackground-color: ="add">
			<div class="row header">
				<div class="col-md-12 ">
				<center><h1 style="color: navy;">Passport Management App</h1></center>
				</div>
			</div>
			</br></br></br>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<center>
							<input type="submit" class="btn btn-primary" id="addCustomer" name="addCustomer" onclick="form.action='/addCustomer'" value="Add
								Customer"/>
						</center>
					</div>
				</div>
				</br></br>
				<div class="row">
					<div class="col-md-12">
						<center>
							<input type="submit" class="btn btn-primary" onclick="form.action='/addDebitCard'" value="Add
								DebitCard Details"/>
						</center>
					</div>
					</div>
					</br></br>
					<div class="row">
						<div class="col-md-12">
							<center>
								<input type="submit" class="btn btn-primary" onclick="form.action='/viewAll'" value="View all
									Details"/>
							</center>
						</div>
					</div>
					</br></br>
				</div>
	</form>
</body>
</html>
