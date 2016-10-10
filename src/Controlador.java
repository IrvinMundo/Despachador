import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Controlador {
	public Procesador [] procesadores;
	public Proceso [] procesos;
	String [] tableName={"Folio","Nombre:","Apellido Paterno:","Apellido Materno:","Fecha de Nacimiento:","DirecciÛn:"};
	Object content [][];//Body of the table
	DefaultTableModel model;

	public DefaultTableModel contruir(int disponibles, String procesos){
		procesadores = new Procesador[disponibles];
		//registrarProcesadores(argumentos)
		iniciar(procesos);	
		return llenar();
	}
	public void registrarProcesadores(int tiempoCambioCuatum,int tiempoVencimientoCuantum,int tiempoBloqueo){
		for(int i=0;i<procesadores.length;i++){
			procesadores[i]=new Procesador(new ArrayList<Proceso>(),(i+1)+"", tiempoCambioCuatum,tiempoVencimientoCuantum,tiempoBloqueo, 0);
		}
	}
	public void iniciar(String procesos){
		for(int i=0;i<procesos.length();i++){
			//Lee la cadena
			buscarProcesadorDisponible();

		}
	}
	public void buscarProcesadorDisponible(){
		int indice=0,mayor=procesadores[0].tiempoFinalizacionTarea;
		for(int i=0;i<procesadores.length;i++){
			if(mayor>procesadores[i].tiempoFinalizacionTarea){
				mayor=procesadores[i].tiempoFinalizacionTarea;
				indice=i;
			}
		}
		asignarProcesadorDisponible(indice);

	}
	public void asignarProcesadorDisponible(int indice){
		
	}

	public  DefaultTableModel llenar() {
		model = new DefaultTableModel(content,tableName);
		/*Object [] content=null;
	while(rs.next()) {
		content=new Object[]{rs.getInt("folio"),rs.getString("nombre"),rs.getString("paterno"),rs.getString("materno"),rs.getString("nacimiento"),rs.getString("tel")};
		model.addRow(content);
	}
		 */
		return model;
	}
}


