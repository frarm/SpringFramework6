package domo.spring3.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate Verbosity in creating Java Beans
// Public accesor methods, constructor, equals, hashcode and String are automatically created.
// Released in JDK 16

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Franco";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("Luis", 25, new Address("Mz I lote 11 calle 11, Urb ProLima", "Los Olivos"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    // available: expected single matching bean but found: address2, address3
    // (Primary)
    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Mz R lote 12 calle 12, Urb ProLima", "Los Olivos");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Mz L lote 13 calle 13, Urb ProLima", "Los Olivos");
    }
}