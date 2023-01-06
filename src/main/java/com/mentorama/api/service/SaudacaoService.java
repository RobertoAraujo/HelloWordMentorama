package com.mentorama.api.service;

import com.mentorama.api.domini.entite.SaudacaoEntites;
import com.mentorama.api.domini.repository.SaudacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaudacaoService {
    @Autowired
    private SaudacaoRepository saudacaoRepository;
    public SaudacaoEntites salvaSaudacao(SaudacaoEntites saudacaoEntites){
        SaudacaoEntites saveSadacao = saudacaoRepository.save(saudacaoEntites);
        return saveSadacao;
    }
    public List<SaudacaoEntites> buscaSaudacao(){
        String s = "Hello Word!";
        List<SaudacaoEntites> allSaudacao = saudacaoRepository.findAll();
        System.out.println(s + allSaudacao);
        return allSaudacao;
    }
}
