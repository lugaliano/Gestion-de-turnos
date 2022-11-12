package impl;

import api.AdminColasTDA;
import api.ColaTDA;

public class AdminColas implements AdminColasTDA {
	protected Object []elementos;
	private int indice; 


	public void inicializar(int cantPuestos) { 
		//inicializa el array General con la cantidad de puestos(N).
		elementos = new Object[cantPuestos]; //6 puestos () //elementos = new Object[6]
		indice = 0; 
		
		int tiempoespera = 0; 
//		Integer cantPuestos = 0;
	}


	public void agregarCola(ColaTDA cola) { //agregar cola al arrayGeneral
		elementos[indice] = cola;
		indice++;
	}


	public int cantColas() {
		return indice;
	}

	
	public ColaTDA devolverCola(int identificador) { //quizas cuadno pedimos q quiere busar hay que poner un if else antes de llamar
		ColaTDA rtrn = (ColaTDA) elementos[identificador];  //a este metodo asi si pide una cola por ej 10 q no existe c imprime q no existe
		return  rtrn;
	}

	
	public int tiempoEstimadoCola(int identificador) { //en la impl de colaPi y en la de colaPrioridad se necesita un private(? INT que tenga el tiempo de atencion
//		if (identificador <=4){ //aca lo que estamos haciendo seria ponele que detectar(ahr) si este valor va estar en la impl de pi o prioridad
//			ColaPI cola = elementos[identificador];
//			int t = cola.tiempoconsulta(); //aca accedemos mediante el metodo tiempoconsulta a la variable tiempo dentro del objeto Cola q no cree yet o no se q objeto seria
//		}
		//return t;
		return 0; //esto lo pongo para q no me tire ese error insoportable
	}

	
	public int puestoElemento(int turnoqbusca) { //dado un elemento(turno) ingresado devuelve en que puesto de atencion se encuentra
		                          // vamos a tener que ir cola por cola fijandonos donde esta ese numero de turno.
								// aca hay un tema porque hice las colasPI entonces cuando recorro las desacolo. lpm
		                       // planteo la idea pero esto lo vamss a tener q cambiar 
//		int i = 0; 
//		while(!elementos.cantcolas()==0) {
//			ColaTDA cola = elementos[i];
//			cola.buscar(turnoqbusca);   //podriamos agregar en el colaTDA un metodo que sea buscar porq sino nose.
//		    //etc etc etc
//		}
		return 0;
	}

}
