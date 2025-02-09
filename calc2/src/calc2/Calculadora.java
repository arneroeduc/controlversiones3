package calc2;

public class Calculadora {

	public int sumar(int a, int b) {
		
	 return a + b;
	 
	}
	public int restar(int a, int b) {
	    return a - b;
	}

	public int multiplicar(int a, int b) {
	    return a * b;
	}
//rama MAIN v2
	 
	 public static void main(String[] args) {
		 
	 Calculadora calc = new Calculadora();
	 System.out.println("Resultado de la suma: " + calc.sumar(5, 3));
	 
	 }
	 }