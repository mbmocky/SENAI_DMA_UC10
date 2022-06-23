import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Dados de Conexão com o Banco de Dados
public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/ComaBem";
    private String usuario = "root";
    private String senha = "teste123";
    public Connection conn;

// Conectar com Banco de Dados
    public void conexao()
    {
        try  //bloco para realização caso não ocorram erros
        {
            conn=DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("CONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex) //bloco para execução, caso ocorra erro no try
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

//Desconectar do Banco de Dados
    public void desconecta()
    {
        try //bloco para realização caso não ocorram erros
        {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex) //bloco para execução, caso ocorra erro no try
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO AO FECHAR CONEXAO!!!");
        }
    }

// Métodos utilizado apenas para teste da conexão, pode apagar se quiser
    public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();
    }
}
