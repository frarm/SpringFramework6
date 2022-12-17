package domo.spring3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import domo.spring3.game.GameRunner;
import domo.spring3.game.GamingConsole;
import domo.spring3.game.PacmanGame;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
