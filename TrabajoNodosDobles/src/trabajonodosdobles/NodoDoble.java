/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajonodosdobles;

/**
 *
 * @author skafi
 */
public class NodoDoble {
  public int dato;
    public int codigo;
    public int tarea;
    public NodoDoble siguiente;

    public NodoDoble(int codigo, int tarea, NodoDoble siguiente, NodoDoble anterior) {
        this.codigo = codigo;
        this.tarea = tarea;
        this.siguiente = siguiente;
    }
	
	NodoDoble  anterior;
	//constructor cuando no hay nodos
		public NodoDoble (int codigo,int tarea){
			this(codigo,tarea,null,null); 
		}
	
	//Constructor para cuando ya hay nodos
	public NodoDoble(int codigo, NodoDoble s, NodoDoble a) {
		dato= codigo;
		siguiente=s;
	}
	
  
}
