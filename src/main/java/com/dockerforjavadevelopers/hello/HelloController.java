package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        System.out.println("ererererererererer");
        System.out.println("sdfsdfsdf");
        System.out.println("sampleeeeee");
         System.out.println("ererererererererer");
        System.out.println("sdfsdfsdf");
        return "Hello World\n";
    }
    
}
