package org.example.tictactoe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
	}

	@Override
	public void run(String... args) {
		TicTacToeCommand gameCommand = new TicTacToeCommand();
		gameCommand.run();
	}
}