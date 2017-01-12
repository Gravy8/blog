package com.codeup.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceRollController {

    @GetMapping("/roll-dice")
    public String roll() {
        return "roll_dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String roll(@PathVariable int guess, Model model) {
        int randomNumber = (int) Math.floor(Math.random() * 6) + 1;
        boolean isCorrect = guess == randomNumber;
        model.addAttribute("guess", guess);
        model.addAttribute("roll", randomNumber);
        model.addAttribute("isCorrect", isCorrect);
        return "roll_dice";
    }
}
