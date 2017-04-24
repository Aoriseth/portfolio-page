package com.deigon.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import com.deigon.models.Greeting;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lenna on 4/21/2017.
 * This is the main controller of the website and will handle simple REST requests
 */
@RestController
public class BasicRestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
