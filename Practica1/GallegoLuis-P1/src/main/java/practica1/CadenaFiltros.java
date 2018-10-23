package practica1;

import java.util.List;
import java.util.ArrayList;

/*
 * - Proporciona filtros a la instacia de GestorFiltros
 * - Encargada de ejecutar los filtros en el orden introducidos
 */

public class CadenaFiltros {
	
	// private Filtros ArrayList de filtros
	private List<Filtro> filtros;	
	// Objeto que se encarga de procesar la peticion que se envía desde el cliente (clase Interfaz)
	private Interfaz objetivo;
	
	public CadenaFiltros() {
		filtros = new ArrayList<Filtro>();
	}
	
	public void addFiltro(Filtro filtro) {
		filtros.add(filtro);
	}
	
	public void ejecutar(double peticion) {
		for(Filtro filtro:filtros) {
			System.out.println("Nueva velocidad (m/s)" + filtro.ejecutar(peticion));
		}
		
		objetivo.ejecutar(peticion);
	}
	
	public void setObjetivo(Interfaz objetivo) {
		this.objetivo = objetivo;
	}

}


