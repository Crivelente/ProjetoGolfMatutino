package com.example.projetoGolf.repositories;

import com.example.projetoGolf.entities.Taco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Integer> {
    List<Taco> findByAtivo(Boolean ativo);
}
