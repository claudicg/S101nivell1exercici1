package n1exercici1.main;

import n1exercici1.beans.InstrumentoCuerda;
import n1exercici1.beans.InstrumentoPercusion;
import n1exercici1.beans.InstrumentoViento;

public class BandaMusicalMain {
	
	public static void main(String[] args) {
		
		//No he puesto bloque de inicialización. Por tanto, llama al constructor directamente y crea
		//una nueva instancia de la clase InstrumentoCuerda.
		//Para demostrarlo he puesto un System.out dentro del constructor.
		//System.out.println("He creado nueva instancia de InstrumentoCuerda.\n");
		InstrumentoCuerda instrumentoCuerda1 = new InstrumentoCuerda("Violín", 4000);
		
		//He puesto un bloque no estático. Por tanto, inicializa el bloque no estático primero.
		//Para demostrarlo he puesto un System.out dentro del bloque.
		//System.out.println("Inicio bloque no estático de InstrumentoViento.\n");
		//y llama al método tocar().
		//System.out.println("Está sonando un instrumento de viento.");
		//A continuación llama al constructor y crea una nueva instancia de la clase.
		//System.out.println("He creado nueva instancia de InstrumentoViento.\n");
		InstrumentoViento instrumentoViento1 = new InstrumentoViento("Trompeta", 2500);
		
		//He puesto un bloque estático. Por tanto, inicializa el bloque estático primero.
		//Para demostrarlo he puesto un System.out dentro del bloque.
		//System.out.println("Inicio bloque estático de InstrumentoPercusion.\n");
		//No admite llamadas a métodos no estáticos. 
		//A continuación llama al constructor y crea una nueva instancia de la clase.
		//System.out.println("He creado nueva instancia de InstrumentoPercusion.\n");
		InstrumentoPercusion instrumentoPercusion1 = new InstrumentoPercusion("Tambor", 1000);
		
		//Todas las instancias creadas llaman a sus respectivos métodos tocar(),
		//e imprimen el mensaje correctamente.
		instrumentoCuerda1.tocar();;
		instrumentoViento1.tocar();
		instrumentoPercusion1.tocar();
		
		System.out.println("------------------------------");
		
		//Crea una nueva instancia de la clase InstrumentoCuerda.
		InstrumentoCuerda instrumentoCuerda2 = new InstrumentoCuerda("Violonchelo", 10000);
		
		//Vuelve a inicializar el bloque  no estático primero y
		//a continuación llama al constructor y crea una nueva instancia de la clase.
		InstrumentoViento instrumentoViento2 = new InstrumentoViento("Trombón", 3500);
		
		//Los bloques estáticos se inicializan solamente con la primera instaciación
		//de la clase. Por lo tanto, esta segunda vez sólo llama al contructor e instancia 
		//la clase.
		InstrumentoPercusion instrumentoPercusion2 = new InstrumentoPercusion("Bombo", 800);
		
		//No hay cambios al llamar a los métodos con las nuevas instancias.
		instrumentoCuerda2.tocar();
		instrumentoViento2.tocar();
		instrumentoPercusion2.tocar();
		
		
	}

}
