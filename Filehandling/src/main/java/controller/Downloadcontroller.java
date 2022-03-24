package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Downloadcontroller {
    @GetMapping("/")
    public String spring()
    {
        
        return "Welcome to the world of AWS!!!!";
    }
}
