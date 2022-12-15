package domo.spring3;

import domo.spring3.game.GameRunner;
import domo.spring3.game.MarioGame;
import domo.spring3.game.PacmanGame;
import domo.spring3.game.SuperContraGame;

/**
 * AppGamingBasicJava
 */
public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}