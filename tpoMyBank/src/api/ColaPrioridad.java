package api;

public interface ColaPrioridad {
	public void inicializarCola();
	public void acolarPrioridad(int x, int prioridad);
	public void desacolar();
	public boolean colaVacia();
	public int primero();
	public int prioridad();
}
