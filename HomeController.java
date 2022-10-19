package com.example.raiz.web.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "/home";
    }

}
