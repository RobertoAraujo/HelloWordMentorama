package com.mentorama.api.controller;

import com.mentorama.api.domini.entite.SaudacaoEntites;
import com.mentorama.api.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hello/v1/")
public class HelloWordController {
    @Autowired
    private SaudacaoService saudacaoService;

    @PostMapping(value = "/publicar")
    public SaudacaoEntites publicarSaudacao(@RequestBody SaudacaoEntites saudacaoEntites) {
        SaudacaoEntites saudacaoEntit = saudacaoService.salvaSaudacao(saudacaoEntites);
        return saudacaoEntit;
    }

    @GetMapping("/word")
    public String chamaHello() {
        List<SaudacaoEntites> saudacaoEntites = saudacaoService.buscaSaudacao();
        return saudacaoEntites + "Hello word!";
    }
}
