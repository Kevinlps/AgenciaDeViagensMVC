<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listagem de Clientes</title>
    <link rel="stylesheet" href="css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar col-12 navbar-expand-lg navbar-dark bg-dark" style="z-index: 999;">
        <div class="container-fluid col-11 m-auto">
            <a class="navbar-brand" href="#" style="background-image: url('img/logoDestinosDoMundo.jpeg'); padding: 5px; border-radius: 15px;">Destinos Do Mundo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.html">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="destino.html">Destinos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="promocoes.html">Promoções</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contato.html">Contato</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/AgenciaDeViagensMVC/Cadastro">Lista de usuários</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Cadastro.jsp">Cadastro de Usuário</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h1>Listagem de Clientes</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Endereço</th>
                    <th>CPF</th>
                    <th>Idade</th>
                    <th>Email</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cliente" items="${clientes}">
                    <tr>
                        <td>${cliente.id_clientes}</td>
                        <td>${cliente.nome}</td>
                        <td>${cliente.endereco}</td>
                        <td>${cliente.cpf}</td>
                        <td>${cliente.idade}</td>
                        <td>${cliente.email}</td>
                        <td>
                            <a href="editar?id=${cliente.id_clientes}" class="btn btn-success">Editar</a>
                            <a href="excluir?id=${cliente.id_clientes}" onclick="return confirm('Deseja Excluir?')" class="btn btn-danger">Excluir</a>

                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
