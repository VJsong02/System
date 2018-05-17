package systemain;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

public class Main {
	public static JDA jda;

	public static void main(String[] args) throws LoginException, InterruptedException {
		//Connect bot
		jda = new JDABuilder(AccountType.BOT).setToken(resources.Safe.token).setAutoReconnect(true)
				.addEventListener(new CommandListener()).setGame(Game.playing("with the world")).buildBlocking();
		
		
		
		//Initialize commands
		CommandListener.commands.addAll(commands.Misc.commands);
	}
}
