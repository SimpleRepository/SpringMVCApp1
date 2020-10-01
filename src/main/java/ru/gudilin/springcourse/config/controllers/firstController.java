package ru.gudilin.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Gudilin on 01.10.2020.
 */
@Controller
@RequestMapping("/first")
public class firstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            Model model){
        //String name    = request.getParameter("name");
        //String surname = request.getParameter("surname");

        //System.out.println(name + " " + surname);
        model.addAttribute("message","Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String googbye(){
        return "first/goodbye";
    }
}
