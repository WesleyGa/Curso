package com.dev.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.back.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}