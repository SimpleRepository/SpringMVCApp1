package ru.gudilin.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Gudilin on 01.10.2020.
 */
@Controller
public class secondController {
    @GetMapping("/exit")
    public String exit(){
        return "second";
    }
}
