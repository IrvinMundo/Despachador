import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador {
	public Procesador [] procesadores;
	public ArrayList<Proceso> procesos;
	String [] tableName={"Folio","Nombre:","Apellido Paterno:","Apellido Materno:","Fecha de Nacimiento:","DirecciÛn:"};
	Object content [][];//Body of the table
	DefaultTableModel model;



	public void configurarProcesador(int tiempoCambioCuatum,int tiempoVencimientoCuantum,int tiempoBloqueo, int micros,String cadena){
		procesadores = new Procesador[micros];
		for(int i=0;i<procesadores.length;i++){
			procesadores[i]=new Procesador(new ArrayList<Proceso>(),(i+1)+"", tiempoCambioCuatum,tiempoVencimientoCuantum,tiempoBloqueo, 0);
		}
		configurarProcesos(cadena);
	}
	public void configurarProcesos(String cadena){

		procesos = new ArrayList<Proceso>();
		for(int i=0;i<cadena.length();i++){
			int bloqueos,duracion;
			duracion=Integer.parseInt(JOptionPane.showInputDialog("Indique la duración del proceso "+cadena.charAt(i)));//Lee la cadena
			bloqueos=Integer.parseInt(JOptionPane.showInputDialog("Indique las veces que el proceso "+cadena.charAt(i)+"se bloqueará"));//Lee la cadena	
			//objeto proceso 
			procesos.add(new Proceso(""+cadena.charAt(i),duracion, bloqueos,0,0,0));
		}
		buscarProcesadorDisponible();
	}
	public void buscarProcesadorDisponible(){
		while(procesos.size()>0){
			int indice=0,mayor=procesadores[0].tiempoFinalizacionTarea;
			for(int j=0;j<procesadores.length;j++){
				if(mayor>procesadores[j].tiempoFinalizacionTarea){
					mayor=procesadores[j].tiempoFinalizacionTarea;
					indice=j;
				}
			}
			asignarProcesadorDisponible(indice);
		}

	}
	public void asignarProcesadorDisponible(int indice){
		procesadores[indice].nuevoProceso(procesos.get(0));
		procesos.remove(0);

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


