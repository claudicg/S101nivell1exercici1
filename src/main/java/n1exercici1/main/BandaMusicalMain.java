package n1exercici1.main;

import n1exercici1.beans.InstrumentoCuerda;
import n1exercici1.beans.InstrumentoPercusion;
import n1exercici1.beans.InstrumentoViento;

public class BandaMusicalMain {
	
	public static void main(String[] args) {
		
		
		InstrumentoCuerda instrumentoCuerda1 = new InstrumentoCuerda("Violín", 4000);
		
		
		InstrumentoViento instrumentoViento1 = new InstrumentoViento("Trompeta", 2500);
		
		
		InstrumentoPercusion instrumentoPercusion1 = new InstrumentoPercusion("Tambor", 1000);
		
		
		instrumentoCuerda1.tocar();;
		instrumentoViento1.tocar();
		instrumentoPercusion1.tocar();
		
		System.out.println("------------------------------");
		
		
		InstrumentoCuerda instrumentoCuerda2 = new InstrumentoCuerda("Violonchelo", 10000);
		
		
		InstrumentoViento instrumentoViento2 = new InstrumentoViento("Trombón", 3500);
		
		
		InstrumentoPercusion instrumentoPercusion2 = new InstrumentoPercusion("Bombo", 800);
		
		
		instrumentoCuerda2.tocar();
		instrumentoViento2.tocar();
		instrumentoPercusion2.tocar();
		
		
	}

}
