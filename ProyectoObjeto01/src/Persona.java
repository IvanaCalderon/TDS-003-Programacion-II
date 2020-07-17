  public class Persona {
	
	String Nombre;
	String Apellidos;
	int Edad;
	boolean Casado;
	String Cedula;
	String Profesion;
	
	
	


	public static void main(String[]args) {
		
		Persona persona1 = new Persona("Laura","Serulle Calderon", 35 , true ,"548752" , "Chef");
		Persona persona2 = new Persona("Lya","Ortiz Serulle", 6 , false ,"748965" , "Profesora");
		Persona persona3 = new Persona("Luis","Castillo Martinez", 56 , true ,"232354" , "Medico");
		Persona persona4 = new Persona("Juanita","Calderon Mejia", 65 , false ,"785496" , "Profesora");
		Persona persona5 = new Persona("Ivana","Calderon Pache", 20 , false ,"353025" , "Chef");
		Persona persona6 = new Persona("Eduardo","Calderon Rodriguez", 21 , false ,"549877" , "Medico");
		Persona persona7 = new Persona("Odaly","Calderon Mejia", 51 , true ,"231515" , "Profesor");
		
		System.out.println(" ");
		persona1.Cocinar();
		persona2.Examinar();
		persona3.Operar();
		persona4.Clase();
		persona5.Hornear();
		persona6.Inyectar();
		persona7.Corregir();
		
		System.out.println(" ");
		
		
		persona1.getInformation();
		persona2.getInformation();
		persona3.getInformation();
		persona4.getInformation();
		persona5.getInformation();
		persona6.getInformation();
		persona7.getInformation();
		
		
	}
	
	Persona(String newNombre, String newApellidos, int newEdad, boolean newCasado, String newCedula, String newProfesion){
		
		
		 Nombre = newNombre;
		 Apellidos = newApellidos;
		 Edad = newEdad;
		 Casado = newCasado;
		 Cedula = newCedula;
		 Profesion = newProfesion;
		
		
	}
	
	
	void Cocinar() {
		
		System.out.println(this.getNombre()+ " está cocinando");
		
	}
	
	void Hornear() {
		
		System.out.println(this.getNombre()+ " está horneando");
		
	}
	
	void Sazonar() {
		
		System.out.println(this.getNombre()+ " está sazonando");
		
	}
	
	void Operar() {
		
		System.out.println(this.getNombre()+ " está operando");
		
	}
	
	void Curar() {
		
		System.out.println(this.getNombre()+ " está curando");
		
	}
	
	void Inyectar() {
		
		System.out.println(this.getNombre()+ " está inyectando");
		
	}
	
	
	void Corregir() {
		
		System.out.println(this.getNombre()+ " está corrigiendo");
		
	}
	
	void Examinar() {
		
		System.out.println(this.getNombre()+ " está examinando");
		
	}
	
	void Clase() {
		
		System.out.println(this.getNombre()+ " está en clase");
		
	}
	
	
	
	
	void getInformation() {
		
		System.out.println(getNombre()+" "+ getApellidos() );
		System.out.println(getProfesion());
		System.out.println("Edad: "+ getEdad());
		System.out.println("Casado: "+ isCasado());
		System.out.println("Cedula: "+ getCedula());
		System.out.println(" ");
		
	}
	
	
	
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public boolean isCasado() {
		return Casado;
	}
	public void setCasado(boolean casado) {
		Casado = casado;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getProfesion() {
		return Profesion;
	}


	public void setProfesion(String profesion) {
		Profesion = profesion;
	}

	
	
	

}
