package n1exercici2.main;

import n1exercici2.beans.Persona;
import n1exercici2.handlers.GenericMethods;

public class PersonaMain {

	public static void main(String[] args) {

		GenericMethods demo = new GenericMethods();
		Persona persona = new Persona("Josep", "Ruiz", 36);
		
		demo.imprimirPerPantalla(persona, "Casa", 10);
		System.out.println();
		demo.imprimirPerPantalla(10, persona, "Casa");
		System.out.println();
		demo.imprimirPerPantalla("Casa", 10, persona);
	}

}
