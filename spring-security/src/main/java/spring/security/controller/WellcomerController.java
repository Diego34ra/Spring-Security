package spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomerController {
    @GetMapping
    public String welcome(){
        return "Bem vindo ao meu Spring Boot Web API";
    }
    @GetMapping("/users")
    public String user(){
        return "Usuario autorizado";
    }

    @GetMapping("/managers")
    public String admin(){
        return "Adminstrador autorizado";
    }
}
