<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Cliente</title>
    <link rel="stylesheet" href="css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body >
 <nav class="navbar col-12  navbar-expand-lg navbar-dark bg-dark" style="z-index: 999;">
      <div class="container-fluid col-11 m-auto">
        <a class="navbar-brand" href="#"
          style="background-image: url('img/logoDestinosDoMundo.jpeg');padding: 5px; border-radius: 15px;">Destinos Do
          Mundo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
              <a class="nav-link" href="/AgenciaDeViagensMVC/Cadastro">Lista de usuarios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Cadastro.jsp">Cadastro de Usuario</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
<div class="container">
    <h1>Cadastro de Cliente</h1>
    
<form action="Cadastro" class="container" method="post">
    <div class="mb-3">
        <label for="nome" class="form-label">Nome:</label>
        <input type="text" class="form-control" name="nome" id="nome" required>
    </div>
    
    <div class="mb-3">
        <label for="endereco" class="form-label">Endereço:</label>
        <input type="text" class="form-control" name="endereco" id="endereco" required>
    </div>
    
    <div class="mb-3">
        <label for="cpf" class="form-label">CPF:</label>
        <input type="text" class="form-control" name="cpf" id="cpf" required>
    </div>
    
    <div class="mb-3">
        <label for="idade" class="form-label">Idade:</label>
        <input type="text" class="form-control" name="idade" id="idade" required>
    </div>
    
    <div class="mb-3">
        <label for="email" class="form-label">E-mail:</label>
        <input type="email" class="form-control" name="email" id="email" required>
    </div>
    
    <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
