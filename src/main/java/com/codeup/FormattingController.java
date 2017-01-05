package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FormattingController {

    @GetMapping("/formatting")
    public String formatting(Model model){
        model.addAttribute("productName", "DVD Player");
        model.addAttribute("productDate", "11/12/1990");
        model.addAttribute("productPrice", "2.2389");
        return "formatting";
    }}
