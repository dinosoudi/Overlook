package ErroresCodigo;

public class B extends A{

	double b = 128.45;
	
	public B() {
		System.out.println("Constructor de B: ");
		System.out.println("B = " + this.b);
		this.b = 3.14159;
		System.out.println("B = " + this.b);
	}
	
		public void setB(double valor) {
			this.b = valor;
		}
	
		public double getB() {
			return this.b;
		}
	
}  //Clase B. Contiene un double.
