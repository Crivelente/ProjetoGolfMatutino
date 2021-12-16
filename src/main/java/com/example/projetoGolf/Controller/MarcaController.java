package com.example.projetoGolf.Controller;

import com.example.projetoGolf.entities.Marca;
import com.example.projetoGolf.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Marca")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping("listar")
    public List<Marca> listar(){
        List<Marca> lista = marcaRepository.findAll();
        return lista;
    }
    @GetMapping("/{id}")
    public Marca buscar(@PathVariable int id) {
        Marca marca = marcaRepository.findById(id).get();
        return marca;
    }
}
