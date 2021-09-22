package br.com.petshop.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection conn = null;
    
    public Conexao() {

    }
    
    public boolean conectar(){
    
        try {
            String url = "jdbc:sqlite:src/br/com/petshop/banco/pet_shop.db";
            ///br/com/petshop/
            this.conn = DriverManager.getConnection(url);
            System.out.println("Conectado");
        } catch (SQLException e) {
                throw new ConexaoException(e.getMessage());
            }
        return true;
    }
    
     public boolean desconectar() {

        try {
            if (this.conn.isClosed() == false) {
                this.conn.close();
            }
           
        } catch (SQLException e) {
                throw new ConexaoException(e.getMessage());
            }
        return true;
    }

  
    }
