package com.java.springboothelloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping(
        path = "/hello",
        produces = "text/plain"
    )
    public String getHelloWorld(){
        return "Hello World !";
    }

    @GetMapping(
        path = "/erreur",
        produces = "text/plain"
    )
    public String getCasserCode(){
        if(2+2==5){
            return "oui";
        }
    }


}
