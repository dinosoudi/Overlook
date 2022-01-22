package ErroresCodigo;

public class A {
 int a = 100;
 
 public A() {
	 System.out.println("Constructor A: ");
	 System.out.println("a = " + this.a);
	 this.a = 333;
	 System.out.println("a = " + this.a);
 }
  
 public void setA(int valor) {
	 this.a = valor;
 }
 
 public int getA(){
	 return a;
 }
 
}   //Clase A. Contiene un entero
