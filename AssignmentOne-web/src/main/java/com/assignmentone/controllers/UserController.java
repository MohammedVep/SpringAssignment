package com.assignmentone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/User"})
@Controller
public class UserController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "User/index";
    }
}
