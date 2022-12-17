package domo.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import domo.spring3.game.GameRunner;
import domo.spring3.game.GamingConsole;

/**
 * AppGamingBasicJava
 */
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}