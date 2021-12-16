package com.example.projetoGolf.Controller;

import com.example.projetoGolf.entities.Marca;
import com.example.projetoGolf.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Marca incluir (@RequestBody Marca marca){
        System.out.println("Incluindo nova marca: " + marca.getNome());
        marca.setIdMarca(0);
        marcaRepository.save(marca);
        marcaRepository.flush();
        return marca;
    }
}
