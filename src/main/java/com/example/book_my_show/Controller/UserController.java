package com.example.book_my_show.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/printLogs")
    public String printLogs(){

        //Advance way of writing system
        log.trace("This is a trace");
        log.debug("This is a debug");
        log.info("This is an info");
        log.warn("This is a warn");
        log.error("This is an error");
        return "Printed logs";
    }
}
