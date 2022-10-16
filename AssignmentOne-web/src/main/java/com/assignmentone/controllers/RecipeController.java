package com.assignmentone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/Recipe"})
@Controller
public class RecipeController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String Index(){
        return "index";
    }
}
