package principal.Controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.Repository.ClienteDAO2;



@WebServlet("/excluir")
public class ExcluirClienteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idCliente = Integer.parseInt(req.getParameter("id"));

		ClienteDAO2 cdao = new ClienteDAO2();

		cdao.excluirCliente(idCliente);

		resp.sendRedirect("index.html");
	}

}
