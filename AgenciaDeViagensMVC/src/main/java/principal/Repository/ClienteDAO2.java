package principal.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import principal.Model.Cliente;
import principal.Model.Conexao;

public class ClienteDAO2 {
    private Connection conexao;
    private PreparedStatement pstm;

    public ClienteDAO2() {
        try {
            conexao = Conexao.createConnectionToMySQL(); // Usando o método da classe Conexao
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, endereco, cpf, idade, email) VALUES (?, ?, ?, ?, ?)";

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getEndereco());
            pstm.setString(3, cliente.getCpf());
            pstm.setInt(4, cliente.getIdade());
            pstm.setString(5, cliente.getEmail());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexoes();
        }
    }

    public void excluirCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id_clientes = ?";

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, id);

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexoes();
        }
    }

    public void atualizarCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nome = ?, endereco = ?, cpf = ?, idade = ?, email = ? WHERE id_clientes = ?";

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getEndereco());
            pstm.setString(3, cliente.getCpf());
            pstm.setInt(4, cliente.getIdade());
            pstm.setString(5, cliente.getEmail());
            pstm.setInt(6, cliente.getId_clientes());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexoes();
        }
    }

    public List<Cliente> listarClientes() {
        String sql = "SELECT * FROM clientes";
        List<Cliente> clientes = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();

            while (resultado.next()) {
                Cliente cliente = new Cliente();

                cliente.setId_clientes(resultado.getInt("id_clientes"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setIdade(resultado.getInt("idade"));
                cliente.setEmail(resultado.getString("email"));

                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexoes();
        }

        return clientes;
    }

    public Cliente buscarCliente(int clienteId) {
        String sql = "SELECT * FROM clientes WHERE id_clientes = ?";
        Cliente cliente = null;

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, clienteId);

            ResultSet resultado = pstm.executeQuery();

            if (resultado.next()) {
                cliente = new Cliente();

                cliente.setId_clientes(resultado.getInt("id_clientes"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setIdade(resultado.getInt("idade"));
                cliente.setEmail(resultado.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexoes();
        }

        return cliente;
    }

    public void fecharConexoes() {
        try {
            if (pstm != null) {
                pstm.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
