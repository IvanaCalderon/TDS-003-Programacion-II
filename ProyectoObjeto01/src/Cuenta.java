public class Cuenta {
	
	String Propietario;
	int montoTotal;
	String tipodeCuenta;
	
	
	
	
	public static void main(String[]args) {
		
		
		
		
		
		Cuenta cuenta1 = new Cuenta("Ivana Calderon", 300,"Cuenta de Ahorro");
		Cuenta cuenta2 = new Cuenta("Juan Alejandro", 500,"Cuenta de Ahorro");
		cuenta1.estadoCuenta();
		cuenta2.estadoCuenta();
		
		cuenta1.Transferencia(100);
		cuenta2.Ingreso(200);
		cuenta1.estadoCuenta();
		cuenta2.estadoCuenta();
	}
	
	
	
	Cuenta(){}
	
	Cuenta(String newPropietario, int newmontoTotal, String newtipodeCuenta){
		
		Propietario = newPropietario;
		montoTotal = newmontoTotal;
		tipodeCuenta = newtipodeCuenta;
	}
	
	
	
	
	void Ingreso(int newIngreso) {
		
		 montoTotal = newIngreso + montoTotal ;
		
	}
	
	void Reintegro(int newReintegro) {
		
		
		montoTotal = newReintegro + montoTotal;
		
		
	}
	
	void Transferencia(int newtransferencia) {
		
		montoTotal = montoTotal	- newtransferencia;
		
		
		
	}
	
	
	
	
	
	
	void estadoCuenta() {
		
		System.out.println("Propietario: "+ getPropietario());
		System.out.println("Monto: "+ getMontoTotal());
		System.out.println("Tipo de cuenta: "+ getTipodeCuenta());
		System.out.println("");
		
	}
	
	
	




	public String getPropietario() {
		return Propietario;
	}




	public void setPropietario(String propietario) {
		Propietario = propietario;
	}




	public int getMontoTotal() {
		return montoTotal;
	}




	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}




	public String getTipodeCuenta() {
		return tipodeCuenta;
	}




	public void setTipodeCuenta(String tipodeCuenta) {
		this.tipodeCuenta = tipodeCuenta;
	}
	
	
	
	
	
	

}
