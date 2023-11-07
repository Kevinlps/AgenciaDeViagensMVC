<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Alteração do cliente ${cliente.nome}</title>

<link rel="stylesheet" href="css/style.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

</head>
<body>

	<div class="container">
		<h5>Alteração de cliente ${cliente.nome}</h5>
		<form action="editar" method="post" class="form-control">

			<input type="hidden" name="id" value="${cliente.id_clientes}">
			<p>Nome:</p>
			<p>
				<input type="text" name="nome" value="${cliente.nome}">
			</p>
			<p>
				<input type="text" name="cpf" value="${cliente.cpf}">
			</p>
			<p>
				<input type="text" name="email" value="${cliente.email}">
			</p>
			<p>
				<input type="text" name="endereco" value="${cliente.endereco}">
			</p>
			<p>Idade:</p>
			<p>
				<input type="number" name="idade" value="${cliente.idade}">
			</p>
			<button type="submit" class="btn btn-success">Atualizar</button>
		</form>
	</div>
</body>
</html>