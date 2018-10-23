package practica1;

/*
 * Envia la petición a la instancia Objetivo
 */

public class Cliente {
	
	private GestorFiltros gestor;
	
	public void setGestorFiltros(GestorFiltros gestorFiltros) {
		this.gestor = gestorFiltros;
	}
	
	public void enviarPeticion(double numVueltas) {
		gestor.ejecutar(numVueltas);
	}

}
