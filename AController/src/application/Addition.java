package application;

public class Addition implements Operador {
	public void execute(Integer number, Integer number2) {
		Integer addition = number + number2;
		System.out.println(addition);
	}

	public int addition(int i, int j) {
		return i + j;
	}
}
