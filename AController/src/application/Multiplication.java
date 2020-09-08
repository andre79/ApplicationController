package application;

public class Multiplication implements Operador {
	public void execute(Integer number, Integer number2) {
		Integer multipication = number * number2;
		System.out.println(multipication);
	}

	public int multiplication(int i, int j) {
		return i * j;
	}
}
