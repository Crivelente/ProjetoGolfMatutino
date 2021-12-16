package com.example.projetoGolf.repositories;

import com.example.projetoGolf.entities.Taco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Integer> {

}
