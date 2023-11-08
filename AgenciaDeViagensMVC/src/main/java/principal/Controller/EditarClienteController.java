package principal.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.Model.Cliente;
import principal.Repository.ClienteDAO2;

@WebServlet("/editar")
public class EditarClienteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int idCliente = Integer.parseInt(req.getParameter("id"));
            ClienteDAO2 clienteDAO = new ClienteDAO2();
            Cliente clienteSelecionado = clienteDAO.buscarCliente(idCliente);

            req.setAttribute("cliente", clienteSelecionado);

            RequestDispatcher rd = req.getRequestDispatcher("/alterarCliente.jsp");
            rd.forward(req, resp);
        } catch (NumberFormatException e) {
            
            resp.sendRedirect("/alterarCliente.jsp"); 
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int idCliente = Integer.parseInt(req.getParameter("id"));
            String nome = req.getParameter("nome");
            String endereco = req.getParameter("endereco");
            String cpf = req.getParameter("cpf");
            int idade = Integer.parseInt(req.getParameter("idade"));
            String email = req.getParameter("email");

            Cliente clienteAlterado = new Cliente( nome, endereco, cpf, idade, email);
            ClienteDAO2 clienteDAO = new ClienteDAO2();
            clienteDAO.atualizarCliente(clienteAlterado);
            resp.sendRedirect("index.html");
        } catch (NumberFormatException e) {
            
            resp.sendRedirect("listagemClientes.jsp"); 
        }
    }
}
