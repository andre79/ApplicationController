package application;

public class Division implements Operador {
	public void execute(Integer number, Integer number2) {
		Integer division = number / number2;
		System.out.println(division);
	}

	public int division(int i, int j) {
		return i / j;
	}
}
