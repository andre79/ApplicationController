package application;
import java.util.Scanner;

public class FrontController {

	public static void main(String[] args) 
	{
		Integer input1;
		Integer input2;
		String operator;

		Scanner input = new Scanner(System.in);
		ApplicationControler calculate = new ApplicationControler();
		
		System.out.println("Entre com o primeiro número");
		input1 = Integer.parseInt(input.nextLine());

		System.out.println("Escolha um operador matemático -, +, /, *");
		operator = input.nextLine();

		System.out.println("Entre com o primeiro número");
		input2 = Integer.parseInt(input.nextLine());

		System.out.println("O Resultado é:");

		ApplicationControler.handleOperator(operator, input1, input2);
	}

}
