package com.webappproject.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/index")
    public String index(){
        return "<h1>hi</h1>";
    }
}
