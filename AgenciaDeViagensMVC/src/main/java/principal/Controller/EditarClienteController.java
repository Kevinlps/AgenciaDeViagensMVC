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
            // Handle the case where the "id" parameter is not a valid integer
            resp.sendRedirect("home"); // Redirect to the home page or handle the error as needed
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
            // Handle the case where form data is not valid
            resp.sendRedirect("listagemClientes.jsp"); // Redirect to the home page or handle the error as needed
        }
    }
}
