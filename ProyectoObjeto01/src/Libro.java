public class Libro {
	
	String Titulo;
	int Precio;
	boolean Prestado;
	
	
	public static void main(String[]args) {
		
		Libro libro1 = new Libro("Los Caidos", 800,false);
		Libro libro2 = new Libro("La Biblia", 1000,false);
		Libro libro3 = new Libro("Remote", 500,false);
		Libro libro4 = new Libro("La Rosas", 200,false);
		
		libro1.estadoLibro();
		libro1.Prestamo(true);
		libro1.estadoLibro();
		libro1.Devolucion(false);
		libro1.estadoLibro();
		libro2.Prestamo(true);
		libro4.Prestamo(true);
		libro3.Prestamo(true);
		libro4.Devolucion(false);
	}
	
	
	Libro(){
		
	}
	
	Libro(String newTitulo, int newPrecio, boolean newPrestado){
		
		Titulo = newTitulo;
		Precio = newPrecio;
		Prestado = newPrestado;
		
		
	}
	
	void Prestamo (boolean newPrestamo) {
		
		Prestado = newPrestamo;
		System.out.println("El libro "+ this.Titulo +" ha sido sometido a un prestamo.");
		System.out.println(" ");
	}
	
	
	void Devolucion(boolean newDevolucion) {
		
		Prestado = newDevolucion;
		System.out.println("El libro "+ this.Titulo +" ha sido sometido a devolucion.");
		System.out.println(" ");
	}
	
	
	void estadoLibro() {
		
		
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Prestado: " + isPrestado());
		System.out.println("");
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public int getPrecio() {
		return Precio;
	}


	public void setPrecio(int precio) {
		Precio = precio;
	}


	public boolean isPrestado() {
		return Prestado;
	}


	public void setPrestado(boolean prestado) {
		Prestado = prestado;
	}
	
	
	
	
	

}
