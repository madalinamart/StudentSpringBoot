package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student madalina =new Student(

                    "Madalina",
                    "mmadalina7@gmail.com",
                    LocalDate.of(1997, Month.MARCH, 26 )


            );
            Student alex = new Student(

                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1998, Month.MARCH, 26 )


            );

            repository.saveAll(
                    List.of(madalina,alex)
            );
        };
    }
}
