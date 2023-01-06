package com.mentorama.api.domini.repository;

import com.mentorama.api.domini.entite.SaudacaoEntites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaudacaoRepository extends JpaRepository<SaudacaoEntites,String> {
}
