package application;

public class Subtraction implements Operador {
	public void execute(Integer number, Integer number2) {
		System.out.println(subtraction(number, number2));
	}

	public int subtraction(int i, int j) {
		return i - j;
	}
}
