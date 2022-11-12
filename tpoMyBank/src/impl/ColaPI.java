package impl;
import api.ColaTDA;

public class ColaPI implements ColaTDA{
	protected Object []elementos;
	private int indice;

//	public ColaPI(Object[] elementos, int indice) {
//		this.elementos = elementos;
//		this.indice = indice;
//	}

	public void Acolar(int elemento){ //VER si es acolar object o int
		try {
			elementos[indice] = elemento;
			indice++;
		}catch(Exception ex) {
			System.out.println("Array no inicializado");
		}	
	}
	
	public void Desacolar() {
		for(int i=0; i < indice-1; i++) {
			elementos[i] = elementos[i+1];
		}
		if(!ColaVacia())
			indice--;
	}
	
	public void Inicializar() {
		elementos = new Object[100]; //cant elem que va a tener
		indice = 0;
	}

	public Object Primero() {
		return elementos[0];
	}
	
	public boolean ColaVacia() {
		return (indice==0);
	}
	
	public int devolverTiempoTotal() { //tiempo total del turno
		return 0; //suma de tiempo de espera con tiempo de atencion
	}
	
	public int PuestoElemento(int elementoid) { //retorna id del elem
		return 0;
	}
}