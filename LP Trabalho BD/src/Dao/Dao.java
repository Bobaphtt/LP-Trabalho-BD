package Dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
    Connection conn = null;
    PreparedStatement ps;
    ResultSet rs = null;
    public Connection getConnection() throws Exception {        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Teste", "root","");
           
        } catch (SQLException ex) {
            // handle any errors
            throw new Exception(ex.getMessage(),ex);
        }
        return conn;
    } 
}
