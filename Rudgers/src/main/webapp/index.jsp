<html>
<body>
	<h2>Welcome to rudger's site</h2>
	<form action="admissionPath" method="post">
	<table>
		<tr>
			<td>FirstName</td> &nbsp&nbsp
			<td><input type="text" name="firstname"></td>
		</tr>
		<tr>
			<td>LastName</td> &nbsp&nbsp
			<td><input type="text" name="lastname"></td>
		</tr>
		<tr>
			<td>Gender</td> &nbsp&nbsp&nbsp
			<td><input type="radio" name="gender">Female</td>
			<td><input type="radio" name="gender">Male</td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name=email></td>
		</tr>
		<tr>
			<td>Subjects</td>
			<td><input type="checkbox" name="subject" value="oss">OSS</td>
			<td><input type="checkbox" name="subject" value="java">JAVA</td>
			<td><input type="checkbox" name="subject" value="AC">AC</td>
		</tr>
		<tr>
			<td align="right"><input type="submit" name="click" value="submit"></td>
		</tr>

	</table>
	</form>
</body>
</html>
