package com.example.raiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping("/cadastrar")
    public String cadastrar(){
        return "/funcionario/cadastro";
    }

    @GetMapping("/listar")
    public String lista(){
        return "/funcionario/lista";
    }
}


