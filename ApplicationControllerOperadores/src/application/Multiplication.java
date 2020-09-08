package application;

public class Multiplication extends Operador {
	public void execute(Integer number, Integer number2) {
		System.out.println(multiplication(number, number2));
	}

	public int multiplication(int i, int j) {
		return i * j;
	}
}
