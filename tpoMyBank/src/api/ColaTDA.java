package api;

public interface ColaTDA {
	public void Inicializar();
    public void Acolar(int turno);    
    public void Desacolar();
    public Object Primero(); 
    public boolean ColaVacia();

    public int devolverTiempoTotal();
   

}
