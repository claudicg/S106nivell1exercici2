package n1exercici2.handlers;

public class GenericMethods {

	public <T, U, V> void imprimirPerPantalla(T primer, U segon, V tercer) {
		
		System.out.println("El primer argument és " + primer);
		System.out.println("El segon argument és " + segon);
		System.out.println("El tercer argument és " + tercer);
	}
}
