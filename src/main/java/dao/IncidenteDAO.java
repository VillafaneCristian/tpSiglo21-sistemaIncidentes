package dao;

import model.Incidente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class IncidenteDAO {

    public void guardar(Incidente incidente) {

        String sql =
                "INSERT INTO incidentes (descripcion, estado) VALUES (?, ?)";

        try {

            Connection conexion = Conexion.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setString(1, incidente.getDescripcion());
            ps.setString(2, incidente.getEstado());

            ps.executeUpdate();

            System.out.println("Incidente guardado correctamente");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void listar() {

        String sql = "SELECT * FROM incidentes";

        try {

            Connection conexion = Conexion.conectar();

            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " - "
                                + rs.getString("descripcion")
                                + " - "
                                + rs.getString("estado")
                );

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
