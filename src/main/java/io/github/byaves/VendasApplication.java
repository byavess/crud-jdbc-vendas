package io.github.byaves;

import io.github.byaves.domain.Cliente;
import io.github.byaves.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {

            clientes.salvar(new Cliente("Fabrício"));
            clientes.salvar(new Cliente("outro Cliente : Arthur"));
            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);//:: methodo de referencia

        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
