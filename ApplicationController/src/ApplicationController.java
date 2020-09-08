import java.util.HashMap;

public class ApplicationController {

	private HashMap<String, Handler> commands;

	public ApplicationController() {
		commands = new HashMap<String, Handler>();
		commands.put("Gradua��o", new Graduado());
		commands.put("Mestrado", new Mestrado());
		commands.put("Doutorado", new Doutorado());
	}

	public Object doCommand(String key) throws Exception {
		Handler command = commands.getOrDefault(key, null);
		if (command == null) {
			throw new Exception("N�o a classe responsavel por esse comando:" + key);
		}
		return command.handlerIt(key);
	}
}
