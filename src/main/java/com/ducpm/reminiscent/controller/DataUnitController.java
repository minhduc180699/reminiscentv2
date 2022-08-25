package com.ducpm.reminiscent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/unit")
public class DataUnitController {
    @RequestMapping("/add")
    private String add(){
        return "addDataUnit";
    }
}
