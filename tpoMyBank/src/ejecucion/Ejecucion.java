package ejecucion;
import api.*;
import impl.*;

import java.util.Scanner;

//import impl.Puesto;

public class Ejecucion {

	public static void main(String[] args) {
		
		int turno = 1;
		
//		Integer cantPuestos = 0;  --> esto lo hace el admin de colas
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de puestos: ");
		int cantPuestos = sc.nextInt();
		
		System.out.println("Se crearon "+cantPuestos+" puestos de atención");
		
		System.out.println("Tipo de turno(C/NC/J/S): ");
		String tipo = "";
		Scanner teclado = new Scanner(System.in);
		tipo = teclado. nextLine();
		
		System.out.println("Cuantos?: ");
		int cuantost = sc.nextInt();
		
		ColaTDA cola1 = new ColaPI();
//		Puesto puesto = new Puesto(cola1); 
		cola1.Inicializar();
		
		int i;
		for (i=0;i<cuantost;i++) {
			cola1.Acolar(turno);
			turno++;
		}
	
		imprimir(cola1);
		
		
	}
	//Funcion para imprimir 
	public static void imprimir(ColaTDA c) {
		while(!c.ColaVacia()) {
			System.out.println("Elemento de la cola: "+c.Primero());
			c.Desacolar(); }
	}

}
