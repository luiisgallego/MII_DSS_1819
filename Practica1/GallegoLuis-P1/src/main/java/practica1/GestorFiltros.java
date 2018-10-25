package practica1;

import java.io.IOException;
import java.net.URISyntaxException;

/*
 * Crea la cadena de Filtros
 * Posee métodos para insertar los filtros en la cadena y provoca que cada uno ejecute
 * la petición del cliente. También el objetivo tiene que ejecutarla.
 */

public class GestorFiltros {
	
	private CadenaFiltros filtros;
	
	public GestorFiltros(Interfaz objetivo) {
		filtros = new CadenaFiltros();
		filtros.setObjetivo(objetivo);
	}
	
	public void setFiltro(Filtro filtro) {
		filtros.addFiltro(filtro);
	}
	
	public void ejecutar(double peticion) throws IOException, URISyntaxException {
		filtros.ejecutar(peticion);
	}

}
