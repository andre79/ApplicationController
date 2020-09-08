package application;

public class Division extends Operador {
	public void execute(Integer number, Integer number2) {
		System.out.println(division(number, number2));
	}

	public int division(int i, int j) {
		return i / j;
	}
}
