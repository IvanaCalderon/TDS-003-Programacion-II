public class Contador {
	
	int estadoContador;
	
	
	public static void main(String[]args) {
		
		
		Contador contador1 = new Contador();
		Contador contador2 = new Contador(25);
		
		
		contador1.Incrementar(12);
		contador2.Decrementar(5);
		
		contador2.ContadorEstado();
		contador1.ContadorEstado();
		
		
	}
	
	
	Contador(){
		
	}
	
	Contador(int newContador){
		
		estadoContador = newContador;
	}
	
	
	
	void Incrementar(int newIncrementar) {
		
		
		estadoContador = newIncrementar +  estadoContador;
		
	}

	
	void Decrementar(int newDecrementar) {
		
		estadoContador =newDecrementar +  estadoContador;
		
	}
	
	
	void ContadorEstado() {
		
		System.out.println("Estado del contador: "+ getEstadoContador());
	}
	
	
	
	
	
	

	public int getEstadoContador() {
		return estadoContador;
	}


	public void setEstadoContador(int estadoContador) {
		this.estadoContador = estadoContador;
	}


	
	
}
