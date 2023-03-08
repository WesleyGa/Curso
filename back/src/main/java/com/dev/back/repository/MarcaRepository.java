package com.dev.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.back.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}