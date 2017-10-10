/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderecomendación;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lizet
 */
public class RecommendationSystem {

    Conexion conpg;

    public static String consulta() throws SQLException {

        Connection conn = null;

        ResultSet rs = null;
        Conexion pg = new Conexion();
        conn = pg.postgresConn();

        java.sql.Statement st = conn.createStatement();
        String sql = "select userid,movieid,rating from movies";
        rs = st.executeQuery(sql);
        while (rs.next()) {
            String id = rs.getString("userid");
            String idmovie = rs.getString("movieid");
            String rating = rs.getString("rating");
            System.out.println("id " + id + " id movie " + idmovie + " Puntaje " + rating);
            // double num = Double.parseDouble(rating);

        }
        return null;
    }

    public static void euclidiana(double x[], double y[]) {
        double resultado;
        double resultado2 = 0;
        double result = 0;
        for (int i = 0; i < 4; i++) {
            double num = x[i] - y[i];
            resultado = Math.pow(num, 2);
            result = result + resultado;

        }
        resultado = Math.sqrt(result);
        System.out.println("Euclidiana " + resultado);
    }

    public static void main(String[] args) throws SQLException {
        System.out.print(consulta());

    }
}
