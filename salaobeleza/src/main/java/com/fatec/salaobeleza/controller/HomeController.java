package com.fatec.salaobeleza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView menu() { return new ModelAndView("paginaMenu");}
    
   @GetMapping("/login")
    public ModelAndView autenticacao() {
        return new ModelAndView("paginaLogin");
    }

    @GetMapping("/fornecedor")
    public ModelAndView fornecedor(){
        return new ModelAndView("paginaFornecedor");
    }
    
    @GetMapping("/cliente")
    public ModelAndView cliente() { return new ModelAndView("paginaCliente");}
    
    @GetMapping("/estoque")
    public ModelAndView estoque() { return new ModelAndView("paginaEstoque");}
}
