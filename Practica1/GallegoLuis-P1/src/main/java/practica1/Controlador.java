package practica1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlador", eager = true)
@SessionScoped

public class Controlador implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	//ESTADOS
	private int estado;
	private final int APAGADO = 0;
	private final int ENCENDIDO = 1;
	private final int ACELERANDO = 2;
	
	
	
	@ManagedProperty(value = "#{titulo}")
	private String titulo;
	@ManagedProperty(value = "#{colorTitulo}")
	private String colorTitulo;
	@ManagedProperty(value = "#{botonOnOff}")
	private String botonOnOff;
	@ManagedProperty(value = "#{colorOnOff}")
	private String colorOnOff;
	@ManagedProperty(value = "#{colorAcelerar}")
	private String colorAcelerar;
	
	public String getTitulo() {
		if(titulo != null) return titulo;
		else return "APAGADO";
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getColorTitulo() {
		if(colorTitulo != null) return colorTitulo;
		else return "red";
	}
	
	public void setColorTitulo(String colorTitulo) {
		this.titulo = colorTitulo;
	}
	
	
	

}
