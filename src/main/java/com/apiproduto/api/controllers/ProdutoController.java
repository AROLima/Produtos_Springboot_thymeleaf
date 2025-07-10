package com.apiproduto.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.apiproduto.api.models.Produto;
import com.apiproduto.api.models.ProdutoRepository;

@RequestMapping
@Controller //trabalhando com front e back se usa o controller não restcontroller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/")
    public String listarProdutos(Model model) {
        model.addAttribute("todosOsProdutos", repository.findAll());
        return "listar";
    }
    
    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastrar";
    }

    @PostMapping("/cadastro")
    public String cadastrarProduto(Produto produto) {
        repository.save(produto);
        return "cadastrar";
    }


}
