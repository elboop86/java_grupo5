package com.example;
import com.example.repository.ClienteRepository;
import  com.example.entities.Cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) { ApplicationContext context = SpringApplication.run(App.class, args);
        ClienteRepository clienteRepo = context.getBean(ClienteRepository.class);

        Cliente cliente1 = new Cliente(1L,"Jésus Peña Peña","calle cisne 21","arm@gmail.com","777788555L",698524789);
        Cliente cliente2 = new Cliente(2L,"María Perez Soto","avenida la Paz34 1.2","lug@gmail.com", "35874895Ñ",698547145);
        Cliente cliente3 = new Cliente(3L,"Raul Luz Casals","ronda Europa 15 5.4","kkkuhg@gmail.com","6666652241P",555221478);
        Cliente cliente4 = new Cliente(4L,"Luis Osma Perez","avenida del Tancat 14 4.1","kkkhhbb@gmail.com","444182241O",777441152);
        Cliente cliente5 = new Cliente(5L,"Oscar Reyes Medina","calle Tos s/n","gggr@gmail.com","44114415I",695231478);

        clienteRepo.saveAll(List.of(cliente1,cliente2,cliente3,cliente4,cliente5));
    }

}
