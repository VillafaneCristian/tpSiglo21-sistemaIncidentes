import model.Equipamiento;
import model.PC;
import model.Impresora;
import model.Incidente;
import dao.IncidenteDAO;
import dao.EquipamientoDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IncidenteDAO dao = new IncidenteDAO();

        EquipamientoDAO equipamientoDAO = new EquipamientoDAO();

        int opcion = 0;

        while (opcion != 4) {

            System.out.println();
            System.out.println("=========================");
            System.out.println(" SISTEMA DE INCIDENTES ");
            System.out.println("=========================");
            System.out.println("1 - Crear incidente");
            System.out.println("2 - Listar incidentes");
            System.out.println("3 - Mostrar Equipamientos");
            System.out.println("4 - Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {

                System.out.print("Descripcion del incidente: ");
                String descripcion = scanner.nextLine();

                Incidente incidente =
                        new Incidente(descripcion, "ABIERTO");

                dao.guardar(incidente);

            } else if (opcion == 2) {

                dao.listar();

            } else if (opcion == 3) {

                equipamientoDAO.listar();

            } else if (opcion == 4) {

                System.out.println("Programa finalizado");

            } else {

                System.out.println("Opcion invalida");

            }
        }

        scanner.close();
    }
}