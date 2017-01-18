package estructuras;

public class Nodo {
	private String informacion;
	protected Nodo ant;
	protected Nodo sig;
	
	
	public Nodo(String i) {
		informacion=i;
		ant=sig=null;
				
	}
	
	
	public Nodo(String informacion, Nodo ant, Nodo sig) {
		super();
		this.informacion = informacion;
		this.ant = ant;
		this.sig = sig;
	}


	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public Nodo getant() {
		return ant;
	}
	public void setant(Nodo ant) {
		this.ant = ant;
	}

	
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Nodo [informacion=" + informacion + ", ant=" + ant + ", sig="
				+ sig + "]";
	}
	
	
	
	

}
