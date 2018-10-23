package practica1;

public class Calcular implements Filtro{
	
	private double INTERVALO;
	
	public Calcular() {
		INTERVALO = 14.27;
	}
	
	public double ejecutar(Object o) {
		
		double distancia = (Double) o;
		double velocidad = distancia*3600/INTERVALO;
		
		return velocidad;
	}

}
