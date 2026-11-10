package com.aritmatika.operation.controller;

import com.aritmatika.operation.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {
    @Autowired
    OperationService service;

    @GetMapping("/")
    public String ui(Model model) {
        model.addAttribute("rows", service.getAll());
        return "UI";
    }
}
