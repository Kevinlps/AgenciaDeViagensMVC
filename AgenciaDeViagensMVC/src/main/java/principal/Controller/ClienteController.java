package principal.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.Model.Cliente;
import principal.Repository.ClienteDAO2;


@WebServlet("/Cadastro")
public class ClienteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Chame o método que lista todos os clientes (você deve implementar esse método)
        ClienteDAO2 cdao = new ClienteDAO2();
        List<Cliente> clientes = cdao.listarClientes();

        // Armazene a lista de clientes em um atributo do request para acessá-la na página JSP
        req.setAttribute("clientes", clientes);

        // Encaminhe a requisição para uma página JSP que exibirá a lista de clientes
        RequestDispatcher dispatcher = req.getRequestDispatcher("listagemClientes.jsp"); // Substitua "listagemClientes.jsp" pelo nome da sua página JSP
        dispatcher.forward(req, resp);
    }
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Recupere os parâmetros do formulário
        String nome = req.getParameter("nome"); // Substitua "nome" pelo nome do campo no formulário
        String endereco = req.getParameter("endereco");
        String cpf = req.getParameter("cpf");
        String idadeStr = req.getParameter("idade");
        String email = req.getParameter("email"); // Substitua "email" pelo nome do campo no formulário
        
        int idade = Integer.parseInt(idadeStr);
        // Crie um objeto Cliente com os parâmetros recebidos
        Cliente cliente = new Cliente(nome,endereco, cpf, idade, email); // Supondo que você tenha uma classe Cliente com construtor correspondente

        // Chame o método que cria o cliente no banco de dados (você deve implementar esse método)
        ClienteDAO2 cdao = new ClienteDAO2();
        cdao.criarCliente(cliente);

        // Redirecione para uma página de sucesso ou faça o que for necessário
        resp.sendRedirect("index.html"); // Substitua "sucesso.jsp" pela página que você deseja exibir após o cadastro
    }
    
    
}

