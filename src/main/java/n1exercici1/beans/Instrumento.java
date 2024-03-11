package n1exercici1.beans;


public abstract class Instrumento {
		
	private String nombre;
	private int precio;
		
	public Instrumento() {
		super();
	}
		
	public Instrumento(String nombre, int precio) {
			
		this.nombre = nombre;
		this.precio = precio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
		
	public abstract void tocar();

	@Override
	public String toString() {
		return "Instrumento [nombre=" + this.nombre + ", precio=" + this.precio + "]";
	}
	
}
