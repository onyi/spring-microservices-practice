package com.biohazard.security.ssoserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class TestController {

    @GetMapping(path = "test")
    public String getTest(){
        return "testing";
    }

    @GetMapping(path = "testwithauth")
    public String getTestWithAuth(){
        return "This message requires Authentication to view";
    }

}
