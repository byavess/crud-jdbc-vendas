package io.github.byaves;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {
    @Bean
    String applicationName(){
        return "Sistema de Vendas";
    }
}
