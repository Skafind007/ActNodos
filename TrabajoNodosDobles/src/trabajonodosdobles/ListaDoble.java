/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajonodosdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author skafi
 */
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
       
         this.inicio = null;
   
    }
    //Método para saber cuando la lista está vacía

    public boolean estaVacia() {
        return inicio == null;
    }

    //Método para agregar nodos al final
    public void agregarAlFinal(int codigo, int tarea) {
        if (!estaVacia()) {
            NodoDoble nuevoInforme = new NodoDoble(codigo, tarea, null, fin);
            fin.siguiente = nuevoInforme;
            fin = nuevoInforme;
        } else {
            inicio = fin = new NodoDoble(codigo, tarea, null, null);
        }
    }

    //Método para agregar al inicio
    public void agregarAlInicio(int codigo, int tarea) {
        if (!estaVacia()) {
            inicio = new NodoDoble(codigo, tarea, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(codigo, tarea, null, null);
        }
    }

    //Método para mostrar la lista de Inicio a fin
    private String obtenerEtiquetaTarea(int tarea) {
    switch (tarea) {
        case 1:
            return "Administrativo";
        case 2:
            return " Empresarial";
        case 3:
            return "Personal";
        default:
            return " Tarea Desconocida";
    }
} public void mostrarInicioFin() {
int j=0;
        if (!estaVacia()) {
            String datos = " INFORME ";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                
          j=auxiliar.tarea;
                datos = datos +"\n Codigo: " + auxiliar.codigo + "Tarea: "+auxiliar.tarea+": "+obtenerEtiquetaTarea(j)+"\n";
                
                auxiliar = auxiliar.siguiente;
                
           }JOptionPane.showMessageDialog(null, datos
                            ,
                            "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
   






  



   
   public boolean eliminarInforme(int codigoAEliminar) {
    if (!estaVacia()) {
        NodoDoble auxiliar = inicio;

        // Caso especial: si el nodo a eliminar está en el inicio
        if (auxiliar.codigo == codigoAEliminar) {
            if (inicio == fin) {
                // Solo hay un nodo en la lista
         
            } else {
                inicio = inicio.siguiente;
                inicio.anterior = null;
            }
            return true;
        }

        while (auxiliar != null) {
            if (auxiliar.codigo == codigoAEliminar) {
                // Encontramos el nodo con el código a eliminar
                if (auxiliar == fin) {
                    // Caso especial: si el nodo a eliminar está en el fin
                    fin = fin.anterior;
                    fin.siguiente = null;
                } else {
                    // Nodo a eliminar está en el medio
                    auxiliar.anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente.anterior = auxiliar.anterior;
                }
                return true;
            }
            auxiliar = auxiliar.siguiente;
        }
    }
    // No se encontró el informe con el código especificado o la lista está vacía
    return false;
}



}



