/*
 * Aqu� est� el objeto Micro que se convertir� en la tabla.
 * Nos guiaremos a partir del tiempo final.
 * En Main habr� un contador para saber cuantos micros ya tienen un proceso
 * esto a partir del tiempo final de cada micro.
 * 
 * Los micros van de 1 al # que pidi� el usuario.
 * 
 * Cuando los n micros tengan un proceso, se tendr� un registro con todos
 * los tiempos finales.
 */
public class Micro {
	int TF=0, numDeMicro;
	
	public Micro(int TF, int numDeMicro){
		this.TF = TF;
		this.numDeMicro = numDeMicro;
	}
	
	int getTiempoFinal(){
		return this.TF;
	}
	
	void setTiempoFinal(int TF){
		if(this.TF < TF){
			this.TF = TF;
		}
	}
	
	int getNumDeMicro(){
		return this.numDeMicro;
	}
}
