package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        System.out.println("dfs");
        return "Hello World\n";
        System.out.println("dfddds");
        System.out.println("dfs");
    }
    
}
