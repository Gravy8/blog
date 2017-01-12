package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{numberOne}/and/{numberTwo}")
    @ResponseBody
    public String add(@PathVariable int numberOne, @PathVariable int numberTwo) {
        return numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo);
    }

    @GetMapping("/subtract/{numberOne}/from/{numberTwo}")
    @ResponseBody
    public String subtract(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberTwo + " - " + numberOne + " = " + (numberTwo - numberOne);
    }

    @GetMapping("/multiply/{numberOne}/and/{numberTwo}")
    @ResponseBody
    public String multiply(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo);
    }

    @GetMapping("/divide/{numberOne}/by/{numberTwo}")
    @ResponseBody
    public String divide(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo);
    }
}
