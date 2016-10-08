import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

/*
 * Pedir:
 * Cambio de Contexto
 * Tiempo de Bloqueo
 * Tamaño de Cuantum
 * 
 * Leer del txt:
 * Nombre del proceso
 * Tiempo estimado
 * Num de bloqueos
 * 
 * Calcular:
 * Tiempo de Vencimiento de Cuantum
 * Tiempo de cada bloqueo = TB*numBloqueos
 * Tiempo total = TB+TVC+TE+TCC
 * Tiempo inicial (primero 0) = TFanterior
 * Tiempo final = TI + TT
 * 
 * Para almacenar los datos, se puede utilizar un String[][] o int[][]
 * [1][7]
 * [0]= Nombre del proceso
 * [0][0] = TCC
 * [0][1] = TE
 * [0][2] = TVC
 * [0][3] = TB
 * [0][4] = TT
 * [0][5] = TI
 * [0][6] = TF
 * 	
	void calcularTVC(int[][] tiempos){
		
	}
 */
public class Main {
	//Variables a pedir
	int TCC, TB, Cuantum;
	
	//Variables a leer del TXT
	//para la prueba sin el txt tendran valores por default
	int proceso, TE, numBloqueos;
	
	
	void pedirTiempos(){
	TCC = Integer.parseInt(JOptionPane.showInputDialog("Dame el tiempo de cambio de contexto"));
	TB = Integer.parseInt(JOptionPane.showInputDialog("Dame el tiempo de bloqueo"));
	Cuantum = Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño del cuantum"));
	}
	
	void leerTXT(){
		FileReader fr = null;
		try {
			fr = new FileReader("datos.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(fr);
	}
	
	//llenar los micros
	void asignarProcesos(){
		
	}
	
	
}