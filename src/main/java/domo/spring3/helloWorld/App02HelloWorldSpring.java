package domo.spring3.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AppGamingBasicJava
 */
public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // 1. Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Configure the things that we want Spring to manage
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            // 3. Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person4Parameters"));
            System.out.println(context.getBean("person5Qualifier"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}