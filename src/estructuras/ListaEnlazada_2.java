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
		tam++;
	}

	
	public void eliminar(Nodo aux){ //--> 
		Nodo b= aux.ant;
		Nodo a= aux.getSig();
		enlazar(b, a);
	}
	
	
	public void eliminarDato(String entrada){
		Nodo actual, anterior;
		boolean encontrado;
	
		actual = inicio;
		anterior = null;
		encontrado = false;
		
		while ((actual != null) && (!encontrado)){
		encontrado = (actual.getInformacion() == entrada);
			if (!encontrado){
		anterior = actual;
		actual = actual.sig;
		}
		}if (actual != null){
			if (actual == inicio){
				inicio = actual.getSig();
			}
			else{
				anterior.setSig(actual.getSig());
			}
		actual = null;
		}
		tam--;
		
	}

	public Nodo buscar(String dato) {
		Nodo buscado = null; 
		Nodo aux = inicio;
		while( buscado == null && aux != null ) {
			if
				( aux.getInformacion() == dato ) { 
					buscado = aux;
				} 
				aux = aux.getSig();
			}
			return buscado;
			
	}
	
	public Nodo buscarNum(int num){
		
		Nodo buscado= null;
		Nodo aux=inicio;
		int i=0;
		while(i<num){
			buscado=aux;
			aux= aux.getSig();
			i++;
		}
		
		return buscado;
		
	}
 

	 
	
	private void enlazar(Nodo nodA, Nodo nodB){
		nodA.sig=nodB;
		nodB.ant= nodA;
	}

	public boolean estavacia(){
		return(inicio==null);
	}
	
	public void imprimir() {
		  Nodo aux = inicio;
		 while( aux != null ) {
		  System.out.print( aux.getInformacion() +" "  );
		   aux= aux.sig; 
		   } 
		 System.out.println();
		  }
	
	public void imprimirUltimo(){
		Nodo aux= ultimo;
		while(aux!= null){
			System.out.print(aux.getInformacion() +" ");
			aux= aux.ant;
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "ListaEnlazada_2 [inicio=" + inicio + ", ultimo=" + ultimo
				+ ", tam=" + tam + "]";
	}
	
	

}
