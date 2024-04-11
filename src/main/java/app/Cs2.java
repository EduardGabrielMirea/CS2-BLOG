package app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication para que funcione la conexion spring.
@SpringBootApplication
public class Cs2 implements CommandLineRunner {

    //Los objetos son los repositorios que vamos a usar.

    public Cs2() {
    }

    public static void main(String[] args) {
        // Esto no se porque.
        SpringApplication.run(Cs2.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
