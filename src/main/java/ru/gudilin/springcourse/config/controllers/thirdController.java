package ru.gudilin.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Gudilin on 01.10.2020.
 */
@Controller
public class thirdController {
    private enum ADD_ENUM
    {
        MULTI,
        ADD,
        SUB,
        DIV
    }

    @GetMapping("/calc")
    public String calc( @RequestParam(value = "a", required = false) Integer a,
                        @RequestParam(value = "b", required = false) Integer b,
                        @RequestParam(value = "action", required = false) ADD_ENUM valAction,
            Model model){

        double c;

        if ( valAction == null )
            valAction = ADD_ENUM.MULTI;

        switch(valAction)
        {
            case MULTI:
                c = a * b;
                break;
            case ADD:
                c = a + b;
                break;
            case SUB:
                c = a - b;
                break;
            case DIV:
                try {
                    c = a / (double)b;
                }
                catch( ArithmeticException object ) {
                    model.addAttribute("calcError", object.toString());
                    c = 0;
                }
                break;
            default:
                c = 0;
        }

        model.addAttribute("calcResult", c );
        return "first/calculator";
    }
}
