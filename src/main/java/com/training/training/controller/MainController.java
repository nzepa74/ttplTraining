package com.training.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By zepaG on 10/26/2021.
 */
@Controller
public class MainController {

    @RequestMapping("/employee")
    public String permission() {
        return "employee";
    }

    @RequestMapping("/dsfa")
    public String sddsd() {
        return "sdf";
    }
}
