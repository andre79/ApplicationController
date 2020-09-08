package application;

public class Addition extends Operador {
	public void execute(Integer number, Integer number2) {
		System.out.println(addition(number, number2));
	}

	public int addition(int i, int j) {
		return i + j;
	}
}
