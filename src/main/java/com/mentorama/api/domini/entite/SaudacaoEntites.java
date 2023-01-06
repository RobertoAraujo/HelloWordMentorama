package com.mentorama.api.domini.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SaudacaoEntites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String saudacao;

    public SaudacaoEntites() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSaudacao() {
        return saudacao;
    }

    public void setSaudacao(String saudacao) {
        this.saudacao = saudacao;
    }

    @Override
    public String toString() {
        return "SaudacaoEntites{" +
                "id=" + id +
                ", saudacao='" + saudacao + '\'' +
                '}';
    }
}
