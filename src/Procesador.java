import java.util.ArrayList;

public class Procesador {
	ArrayList <Proceso> historial;
	String nombre;
	int tiempoCambioCuatum,tiempoVencimientoCuantum,tiempoBloqueo, tiempoFinalizacionTarea;
	public Procesador(ArrayList<Proceso> hitorial,String nombre, int tiempoCambioCuatum, int tiempoVencimientoCuantum, int tiempoBloqueo,
			int tiempoFinalizacionTarea) {
		// TODO Auto-generated constructor stub
	}
	int getTiempoCambioCuatum(){
		return this.tiempoCambioCuatum;
	}
	
	void setTiempoCambioCuatum(int tiempoCambioCuatum){
		this.tiempoCambioCuatum = tiempoCambioCuatum;
	}
	int getTiempoVencimientoCuantum(){
		return this.tiempoVencimientoCuantum;
	}
	
	void setTiempoVencimientoCuantum(int tiempoVencimientoCuantum){
		this.tiempoVencimientoCuantum = tiempoVencimientoCuantum;
	}
	int getTiempoBloqueo(){
		return this.tiempoBloqueo;
	}
	
	void setTiempoBloqueo(int tiempoBloqueo){
		this.tiempoBloqueo = tiempoBloqueo;
	}
	int getTiempoFinalizacionTarea(){
		return this.tiempoFinalizacionTarea;
	}
	
	void setTiempoFinalizacionTarea(int tiempoFinalizacionTarea){
		this.tiempoFinalizacionTarea = tiempoFinalizacionTarea;
	}
	String getNombre(){
		return this.nombre;
	}
	
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	ArrayList getHistorial(){
		return this.historial;
	}
	
	void setHistorial(ArrayList historial){
		this.historial = historial;
	}
	public void agregar (Proceso proceso){
		//vien de asignar procesador
		historial.add(proceso);
	}

	public void ejecutarProceso(){
		int restante= historial.get(historial.size()-1).tiempoEjecucion;
		do{
			
		}while(restante>tiempoVencimientoCuantum);
		//Al último proceso en la lista se va restando para ir calculando el tiempo de finalizacion, con esto activo buscar procesador
	}
	
}
