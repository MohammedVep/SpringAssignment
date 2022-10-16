package com.assignmentone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/food"})
@Controller
public class FoodController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listFood() {return "food/index";}
}
