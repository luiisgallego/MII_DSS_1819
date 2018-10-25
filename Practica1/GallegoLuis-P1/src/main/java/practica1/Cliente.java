package practica1;

import java.io.IOException;
import java.net.URISyntaxException;

/*
 * Envia la petición a la instancia Objetivo
 */

public class Cliente {
	
	private GestorFiltros gestor;
	
	public void setGestorFiltros(GestorFiltros gestorFiltros) {
		this.gestor = gestorFiltros;
	}
	
	public void enviarPeticion(double numVueltas) throws IOException, URISyntaxException {
		gestor.ejecutar(numVueltas);
	}

}
