import java.util.HashMap;

public class ApplicationController {

	private HashMap<String, Handler> commands;
	private Handler command;

	public ApplicationController() {
		commands = new HashMap<String, Handler>();
		commands.put("Graduação", new Graduado());
		commands.put("Mestrado", new Mestrado());
		commands.put("Doutorado", new Doutorado());
	}

	public Object doCommand(String key) throws Exception {

		try {
			command = commands.getOrDefault(key, null);
		} catch (NullPointerException e) {
			System.out.println("Não há classe responsável por esse comando:" + key);// TODO: handle exception
		}
		return command.handlerIt(key);
	}
}
