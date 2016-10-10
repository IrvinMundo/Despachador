import java.util.ArrayList;

public class Proceso {
	String nombre;		
	int tiempoEjecucion, bloqueo,	tiempoTotal, tiempoInicial,	tiempoFinal;
	public Proceso(String nombre, int tiempoEjecucion, int bloqueo, int tiempoTotal,
			int tiempoInicial, int tiempoFinal) {
		// TODO Auto-generated constructor stub
	}
	int getTiempoEjecucion(){
		return this.tiempoEjecucion;
	}
	
	void setTiempoEjecucion(int tiempoEjecucion){
		this.tiempoEjecucion = tiempoEjecucion;
	}
	int getBloqueo(){
		return this.bloqueo;
	}
	
	void setBloqueo(int bloqueo){
		this.bloqueo = bloqueo;
	}
	int getTiempoTotal(){
		return this.tiempoTotal;
	}
	
	void setTiempoTotal(int tiempoTotal){
		this.tiempoTotal = tiempoTotal;
	}
	int getTiempoInicial(){
		return this.tiempoInicial;
	}
	
	void setTiempoInicial(int tiempoInicial){
		this.tiempoInicial = tiempoInicial;
	}
	int getTiempoFinal(){
		return this.tiempoFinal;
	}
	
	void setTiempoFinal(int tiempoFinal){
		this.tiempoFinal = tiempoFinal;
	}
	String getNombre(){
		return this.nombre;
	}
	
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	
}
