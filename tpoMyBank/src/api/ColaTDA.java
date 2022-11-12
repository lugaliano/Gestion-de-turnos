package api;

public interface ColaTDA {
	public void Inicializar();
    public void Acolar(int turno);    
    public void Desacolar();
    public Object Primero(); // VER esto de object o int o nose. Porque devuelve el (lugar,elemento)
    public boolean ColaVacia();
//    public int PuestoElemento(int elementoid); //NOSE
    public int devolverTiempoTotal();
    //public void acolarPrioridad(int id, int prioridad); --> borrar
}