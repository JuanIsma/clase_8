package clase8;
 

public class Producto {
 
	// Propiedades
	private String nombre;
     private double precio;
     private int stock;
 
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// Constructores
	public Producto() {
	}
	
	public Producto(String nombre) {
 		
		this.nombre = nombre;
	 }
	
	// Getters
	public String getNombre() {
	 return this.nombre;
	}
	
	public boolean hayStock(int cantidad) {
		if (this.stock >= cantidad) {
			return true;
		}
		return false;
	}
	 

// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto: nombre=" + nombre ;
	}

 
	 
	
	
} // Fin de la clase
 
	 
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
