package sistemaderecomendación;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author UNALMAN
 */
public class Conexion {

    public Connection postgresConn() {

        // Connection con=null;
        try {
            ResultSet rs = null;
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/datasets";
            String user = "postgres";
            String password = "123";
            Connection con = DriverManager.getConnection(url, user, password);
            java.sql.Statement st = con.createStatement();
            return con;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}