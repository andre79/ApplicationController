import java.util.HashMap;

public class ApplicationController {

	private HashMap<String, Handler> commands;
	private Handler command;

	public ApplicationController() {
		commands = new HashMap<String, Handler>();
		commands.put("Gradua��o", new Graduado());
		commands.put("Mestrado", new Mestrado());
		commands.put("Doutorado", new Doutorado());
	}

	public Object doCommand(String key) throws Exception {

		try {
			command = commands.getOrDefault(key, null);
		} catch (NullPointerException e) {
			System.out.println("N�o h� classe respons�vel por esse comando:" + key);// TODO: handle exception
		}
		return command.handlerIt(key);
	}
}
