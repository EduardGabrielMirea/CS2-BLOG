package all;

import all.repository.StarRepository;
import all.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cs2 implements CommandLineRunner {
    //Los objetos son los repositorios que vamos a usar.
    private final StarRepository starRepository;
    private final UserRepository userRepository;
    @Autowired
    public Cs2(StarRepository starRepository,UserRepository userRepository) {
        this.starRepository = starRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        // Esto no se porque.
        SpringApplication.run(Cs2.class, args);
    }
    @Override
    public void run(String... args) {
        System.out.println("****************************************************");
        starRepository.findAll().forEach(System.out::println);

        System.out.println("****************************************************");
    }
}
