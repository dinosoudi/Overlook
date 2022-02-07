package ErroresCodigo;

public class EjercicioHerencia {

	public static void main(String[] args) {
		A oA = new A();
		System.out.println("En el main: ");
		
		//System.out.println("Valor double = " + oA.getB());
		//Error: Se usa una instancia de la clase A para invocar un método definido
		//en la clase B. getB() no existe en la clase A
		
		System.out.println("Valor double = " + oA.getA());
		
		//Corrección: Declarar oA como instancia de A coluciona el error, PERO realmente 
		//no permite accedor al doble (que está en B), sólo al entero (que está en A), pues A
		//carece de un get para obtener el valor doble (*)
		
		//B oB = new A();
	    //Error: No se puede convertir un objeto de clase A a uno de clase B 
		
		B oB = new B();
		
		//Corrección: Declarar oB como instancia de B, no de A.
		
		System.out.println("Valor double REAL = " + oB.getB());
		
		// (*) Para acceder al double en B se necesita una instancia de B
		
		oB.setB(23.5);
		System.out.println("Valor double modificado en el main = " + oB.getB());
	}

}   //Clase EjercicioHerencia. Contiene el método main.
