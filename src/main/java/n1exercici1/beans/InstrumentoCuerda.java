package n1exercici1.beans;

public class InstrumentoCuerda extends Instrumento{
	
	
	public InstrumentoCuerda(String nombre, int precio) {
		super(nombre, precio);
		System.out.println("He creado nueva instancia de InstrumentoCuerda.\n");
	}
	
	@Override
	public void tocar() {
		
		System.out.println("Está sonando un instrumento de cuerda.");
	}

}
	

