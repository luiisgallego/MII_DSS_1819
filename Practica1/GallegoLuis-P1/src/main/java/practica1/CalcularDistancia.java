package practica1;

public class CalcularDistancia {
	
	private double RADIO;
	private double revolAnt;
	
	public CalcularDistancia() {
		RADIO = 4.86;
		revolAnt = 0.0;
	}
	
	public double ejecutar(Object o) {
			
		double revoluciones = (Double) o;
		double distancia = (revoluciones - revolAnt)*2*RADIO*3.1416;
		revolAnt = revoluciones;
		
		return distancia;
	}

}
