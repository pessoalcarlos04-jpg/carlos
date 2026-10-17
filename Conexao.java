
import java.sql.*; 
public class Conexao {
    
    private static String URL = "jdbc:postgresql://ep-falling-grass-b4maz5hz-pooler.c-6.us-east-2.aws.neon.tech/neondb?sslmode=require&channel_binding=require";
    private static String USUARIO = "neondb_owner";
    private static String SENHA =  "npg_ZV9BlzTYiM7f";


private static Connection getConnection() throws SQLException{
    try{
        return DriverManager.getConnection(URL, USUARIO, SENHA);

        }catch ( SQLException e){
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    


    }
    


public void insertpessoa(String nome, int idade){
  try{
    Connection conecta = getConnection();
    Statement stmt = conecta.createStatement();   
    stmt.executeUpdate(" insert Into pessoa ( nome, idade) values ('"+ nome +"', "+ idade +")");
  }catch ( SQLException e){
            throw new RuntimeException("error", e);
  }    

}

}