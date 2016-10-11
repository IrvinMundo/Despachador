import java.util.ArrayList;

public class Procesador {
	ArrayList <Proceso> historial;
	String nombre;
	int tiempoCambioCuatum,tiempoVencimientoCuantum,tiempoBloqueo, tiempoFinalizacionTarea;
	public Procesador(ArrayList<Proceso> hitorial,String nombre, int tiempoCambioCuatum, int tiempoVencimientoCuantum, int tiempoBloqueo,
			int tiempoFinalizacionTarea) {
		// TODO Auto-generated constructor stub
	}
	public int getTiempoCambioCuatum(){
		return this.tiempoCambioCuatum;
	}

	public void setTiempoCambioCuatum(int tiempoCambioCuatum){
		this.tiempoCambioCuatum = tiempoCambioCuatum;
	}
	public int getTiempoVencimientoCuantum(){
		return this.tiempoVencimientoCuantum;
	}

	public void setTiempoVencimientoCuantum(int tiempoVencimientoCuantum){
		this.tiempoVencimientoCuantum = tiempoVencimientoCuantum;
	}
	public int getTiempoBloqueo(){
		return this.tiempoBloqueo;
	}

	public void setTiempoBloqueo(int tiempoBloqueo){
		this.tiempoBloqueo = tiempoBloqueo;
	}
	public int getTiempoFinalizacionTarea(){
		return this.tiempoFinalizacionTarea;
	}

	public void setTiempoFinalizacionTarea(int tiempoFinalizacionTarea){
		this.tiempoFinalizacionTarea = tiempoFinalizacionTarea;
	}
	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public ArrayList getHistorial(){
		return this.historial;
	}

	public void setHistorial(ArrayList historial){
		this.historial = historial;
	}
	public void agregar (Proceso proceso){
		//vien de asignar procesador
		historial.add(proceso);
	}

	public void ejecutarProceso(Proceso proceso){
		int restante= proceso.tiempoEjecucion;
		if(historial.size()!=0){
			tiempoFinalizacionTarea+=tiempoCambioCuatum;
		}
		while(restante>tiempoVencimientoCuantum){
			restante-=tiempoVencimientoCuantum;
			tiempoFinalizacionTarea+=tiempoVencimientoCuantum;
			tiempoFinalizacionTarea+=tiempoCambioCuatum;

		}	
		tiempoFinalizacionTarea+=restante;
		proceso.bloqueo*=tiempoBloqueo;
		tiempoFinalizacionTarea+=proceso.bloqueo;
		proceso.tiempoFinal=tiempoFinalizacionTarea;
		proceso.tiempoTotal=proceso.tiempoFinal-proceso.tiempoInicial;
		//Al último proceso en la lista se va restando para ir calculando el tiempo de finalizacion, con esto activo buscar procesador
	}
	public void nuevoProceso(Proceso proceso) {
		proceso.tiempoInicial=tiempoFinalizacionTarea;
		ejecutarProceso(proceso);
		historial.add(proceso);
	}
	public void imprimir(){
		System.out.println("Procesador: "+nombre+"\n\tHistorial:");
		for(int i=0;i<historial.size();i++){
			System.out.println("\t\t\tProceso: "+ historial.get(i).nombre + "\n Tiempo de Ejecucion: " + historial.get(i).tiempoEjecucion + "\n Tiempo Bloqueado: " + historial.get(i).bloqueo +"\n Tiempo Total: "+	historial.get(i).tiempoTotal +"\nTiempo Inicial: " + historial.get(i).tiempoInicial + " Tiempo Final: "	+historial.get(i).tiempoFinal);
		}
	}

}
