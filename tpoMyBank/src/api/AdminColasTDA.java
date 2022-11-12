package api;

public interface AdminColasTDA {
	public void inicializar(int n);
	public void agregarCola(ColaTDA cola);
	public int cantColas();
	public ColaTDA devolverCola(int identificador);
	public int tiempoEstimadoCola(int id);
	public int puestoElemento(int turnoqbusca);
}