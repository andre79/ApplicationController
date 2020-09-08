/*
 * The application controller pattern
 * Iremos criar uma AC para apresentar a descri��o de cada entrada.
 * Ex: Graduado (descreve algo sebre graduado)
 * 1. Crie uma tela de entrada que receba o valor descrito ex: graduado (FrontController)
 * 2. Crie uma interface handler que manupule as entradas de acordo com que for digitados (Handler)
 * 3. Crie a classe Application COntroller que ira guardar as chamadas para e as descri��es (Application Controller)
 * 4. 
 */

import java.util.Scanner;

public class FrontController {

	public static void main(String[] args) throws Exception {
		ApplicationController ac = new ApplicationController();

		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma forma��o: Gradua��o, Mestrado e Doutorado");

		String formacao = input.nextLine();
		System.out.println(ac.doCommand(formacao));
	}

}
