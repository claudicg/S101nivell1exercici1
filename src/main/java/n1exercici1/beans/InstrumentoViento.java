package n1exercici1.beans;

public class InstrumentoViento extends Instrumento {
	
	{
		//Escribo el System.out para demostrar que al ejecutar la aplicación
		//primero se inializan los bloques estáticos y después la instanciación de la clase.
		System.out.println("Inicio bloque no estático de InstrumentoViento.\n");
		tocar();
	}
	

	public InstrumentoViento(String nombre, int precio) {
		super(nombre, precio);
		System.out.println("He creado nueva instancia de InstrumentoViento.\n");
	}
	
	
	@Override
	public void tocar() {
		
		System.out.println("Está sonando un instrumento de viento.");
		
	}
}

