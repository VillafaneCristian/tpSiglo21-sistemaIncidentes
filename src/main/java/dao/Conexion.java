package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_incidentes";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection conectar() {

        try {

            Connection conexion =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexion exitosa a MySQL");

            return conexion;

        } catch (Exception e) {

            System.out.println("Error de conexion");
            e.printStackTrace();

            return null;
        }
    }
}