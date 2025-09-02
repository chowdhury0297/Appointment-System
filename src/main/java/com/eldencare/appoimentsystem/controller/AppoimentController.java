package com.eldencare.appoimentsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointment")
public class AppoimentController {


    @GetMapping("/test")
    public String getresponse(){
        return "<h1 style=\"text-align: center;\">Hi from ApppointmentService </h1>";
    }

    @GetMapping("/docker-test")
    public String getresponsefordocker(){
        return "<h2 style=\"text-align: center; padding: 20px;\">Docker from ApppointmentService </h2>";
    }

}
