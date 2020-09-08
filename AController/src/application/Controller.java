package application;

import java.util.HashMap;

public class Controller {
	public static HashMap<String, Operador> key = new HashMap<String, Operador>();

	public static void handleOperator(String operator, Integer number, Integer number2) {
		key.put("+", new Addition());
		key.put("-", new Subtraction());
		key.put("/", new Division());
		key.put("*", new Multiplication());

		Operador handler = key.get(operator);
		handler.execute(number, number2);
	}
}
