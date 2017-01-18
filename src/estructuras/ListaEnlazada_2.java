package estructuras;

public class ListaEnlazada_2 {
	private Nodo inicio;
	private Nodo ultimo;
	private int tam;
	
	public ListaEnlazada_2() {
		
		this.inicio = null;
		this.ultimo= null;
		this.tam = 0;
	}
	
	public void insertarInicio(String e){
		Nodo nuevo= new Nodo(e);
		if(estavacia()){
			inicio=nuevo;
			ultimo=nuevo;
		}
		else{
			enlazar(nuevo, inicio);
			inicio=nuevo;
		}
		tam++;
		
	}
	public void insertarFinal(String e){
		Nodo nuevo= new Nodo(e);
		if(estavacia()){
			inicio=nuevo;
			ultimo=nuevo;
		}
		else{
			enlazar(ultimo, nuevo);
			ultimo=nuevo;
		}
	}
	public void mostrar() {
		  Nodo aux = inicio;
		 while( aux != null ) {
		  System.out.print( aux.getInformacion() + "-> " );
		   aux= aux.sig; 
		   } 
		 System.out.println("null");
		  }
	/*
	 * 
	 * ublic Nodo buscar(int dato) {
  Nodo buscado = null; Nodo iterador = cabeza;
 while
 ( buscado == null && iterador != null ) {
if
 ( iterador.informacion == dato ) { buscado = iterador; } iterador = iterador.siguiente; }
return
 buscado; }
 
 public void mostrar() {
  Nodo aux = inicio;
 while( aux != null ) {
  System.out.print( iterador.informacion + " -> " );
   iterador = iterador.siguiente; 
   } 
  }
	 */
	
	private void enlazar(Nodo nodA, Nodo nodB){
		nodA.sig=nodB;
		nodB.ant= nodA;
	}

	public boolean estavacia(){
		return(inicio==null);
	}
	

}
