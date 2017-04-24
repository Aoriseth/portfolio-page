package com.deigon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenna on 4/24/2017.
 * controller for all static web page mappings
 */
@Controller
public class StaticPageController {
    @RequestMapping("/sketchbook")
    public String sketchbook(){
        return "sketchbook";
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
