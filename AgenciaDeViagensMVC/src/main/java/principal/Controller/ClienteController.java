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
        
        ClienteDAO2 cdao = new ClienteDAO2();
        List<Cliente> clientes = cdao.listarClientes();

        
        req.setAttribute("clientes", clientes);

        
        RequestDispatcher dispatcher = req.getRequestDispatcher("listagemClientes.jsp");
        dispatcher.forward(req, resp);
    }
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String nome = req.getParameter("nome"); 
        String endereco = req.getParameter("endereco");
        String cpf = req.getParameter("cpf");
        String idadeStr = req.getParameter("idade");
        String email = req.getParameter("email"); 
        
        int idade = Integer.parseInt(idadeStr);
        
        Cliente cliente = new Cliente(nome,endereco, cpf, idade, email); 

        
        ClienteDAO2 cdao = new ClienteDAO2();
        cdao.criarCliente(cliente);

        
        resp.sendRedirect("index.html"); 
    }
    
    
}

