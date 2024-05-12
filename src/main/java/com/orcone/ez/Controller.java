package com.orcone.ez;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String getMessage() {
return welcomeMsg;
    }
}
