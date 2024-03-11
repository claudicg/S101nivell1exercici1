package n1exercici1.beans;

public class InstrumentoPercusion extends Instrumento {
	
	static
	{		
		//tocar();
		 System.out.println("Inicio bloque estático de InstrumentoPercusion.\n");
	}
	
	
	public InstrumentoPercusion(String nombre, int precio) {
		super(nombre, precio);
		System.out.println("He creado nueva instancia de InstrumentoPercusion.\n");
	}
	
	
	public void tocar() {
		
		System.out.println("Está sonando un instrumento de percusión.");
	}

}

