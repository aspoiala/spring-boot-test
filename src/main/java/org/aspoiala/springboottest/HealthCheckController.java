package org.aspoiala.springboottest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/ping")
    @ResponseStatus(HttpStatus.OK)
    public String ping(){
        return "pong";
    }

}
