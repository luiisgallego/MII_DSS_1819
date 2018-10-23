package practica1;

public class Main {
	
	public static void main(String[] args) {
		
		GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz());
		gestorFiltros.setFiltro(new Calcular());
		Cliente cliente = new Cliente();
		cliente.setGestorFiltros(gestorFiltros);
		cliente.enviarPeticion(500); 				// Número inicial de vueltas del eje
		
	}

}
