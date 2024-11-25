package com.med.ateliermicroservice;

import com.med.ateliermicroservice.Entity.Customer;
import com.med.ateliermicroservice.Repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtelierMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtelierMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("X").email("x@mail.com").build());
            customerRepository.save(Customer.builder().name("Y").email("y@mail.com").build());
        };
    }

}
