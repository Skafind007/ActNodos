/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajonodosdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author skafi
 */
import javax.swing.JOptionPane;

public class TrabajoNodosDobles {

    public static void main(String[] args) {
        ListaDoble informes = new ListaDoble();
        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar informe\n" +
                        "2. Eliminar informe\n" +
                        "3. Mostrar informes \n" +
                 
                        "5. Salir\n" +
                        "¿Qué deseas hacer?", "Menú de opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el código del informe:",
                                "Agregando informe", JOptionPane.INFORMATION_MESSAGE));
                        int tarea = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa la tarea del informe:",
                                "Agregando informe", JOptionPane.INFORMATION_MESSAGE));
                     informes.agregarAlFinal(codigo, tarea);
                        break;
                    case 2:
                        if (!informes.estaVacia()) {
                            int codigoAEliminar = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el código del informe a eliminar:",
                                    "Eliminando informe", JOptionPane.INFORMATION_MESSAGE));
                            boolean eliminado = informes.eliminarInforme(codigoAEliminar);
                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "Informe eliminado con éxito",
                                        "Informe Eliminado", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontró el informe con ese código",
                                        "Informe no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay informes",
                                    "Lista de Informes Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!informes.estaVacia()) {
                            informes.mostrarInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay informes",
                                    "Lista de Informes Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
           
                    case 4:
                        JOptionPane.showMessageDialog(null, "Finalizado", "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe la opción", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
            }
        } while (opcion != 4);
    }
}
