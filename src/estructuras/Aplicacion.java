package estructuras;

import javax.sound.midi.SysexMessage;

public class Aplicacion {
	public static void main(String[] args){
		
		ListaEnlazada_2 lista= new ListaEnlazada_2();
		lista.insertarInicio("l");
		lista.imprimir();
		lista.insertarInicio("o");
		lista.imprimir();
		lista.insertarFinal("a");
		lista.imprimir();
		lista.insertarInicio("h");
		lista.imprimir();
		lista.insertarFinal("a");
		lista.imprimir();

		System.out.println("La lista al revés es:");
		lista.imprimirUltimo();
		
		//lista.buscar("h");
		String aux= "p";
		int num=3;
		Nodo a= lista.buscar(aux);
		System.out.println( (a !=null)? "si existe el dato: "+ aux:"no existe el dato: "+aux);
		Nodo b= lista.buscarNum(num);
		System.out.println((b!=null)? "si existe inf. en la posición "+num +": "+b.getInformacion(): "no existe inf. en la pos: "+num);
	/*	if(lista.buscar("a")==null){
			System.out.println("elemento no encontrado");
		}
		else{
			System.out.println("elemento encontrado");
		}
		*/
		
		System.out.println("Eliminando el dato de la pos "+ num + ": "+ b.getInformacion());
		lista.eliminar(b);
		lista.imprimir();
	
		aux="h";
		System.out.println("eliminando el dato "+ aux );
		lista.eliminarDato(aux);
		lista.imprimir();
		
		
	}

}
