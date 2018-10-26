package practica1;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz());
		gestorFiltros.setFiltro(new Calcular());
		Cliente cliente = new Cliente();
		cliente.setGestorFiltros(gestorFiltros);
		cliente.enviarPeticion(100); 				// Número inicial de vueltas del eje
		
	}

}
