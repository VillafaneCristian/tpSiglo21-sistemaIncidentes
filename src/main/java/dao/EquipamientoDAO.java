package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EquipamientoDAO {

    public void listar() {

        String sql = "SELECT * FROM equipamientos";

        try {

            Connection conexion = Conexion.conectar();

            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " - "
                                + rs.getString("tipo")
                                + " - "
                                + rs.getString("numero_serie")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}