package com.assignmentone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/Planning"})
@Controller
public class PlanningController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() { return "index"; }
}
