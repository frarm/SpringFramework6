package domo.spring3;

import domo.spring3.game.GameRunner;
import domo.spring3.game.PacmanGame;

/**
 * AppGamingBasicJava
 */
public class App01GamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame(); // 1. Object Creation
        var gameRunner = new GameRunner(game);
        // 2. Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        gameRunner.run();
    }
}