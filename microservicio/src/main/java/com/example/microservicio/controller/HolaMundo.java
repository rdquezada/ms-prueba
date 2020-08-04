/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.microservicio.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
//@EnableAutoConfiguration
@RequestMapping("/")
public class HolaMundo {

    //@GetMapping
    @RequestMapping(value = "hola", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
}
