package com.deigon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/minecraft")
    public String sendToMinecraftServer(){
        return "redirect:http://94.227.65.222:25566/";
    }

    @GetMapping({"/minecraftInfo","/minecraftinfo"})
    public String minecraftInfo(){
        return "minecraft";
    }

    @RequestMapping("/sketchbook/pages")
    public String pages(){
        return "index";
    }
}
