package com.example.projetoGolf.controller;


import com.example.projetoGolf.entities.Taco;
import com.example.projetoGolf.repositories.TacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Taco")
public class TacoController {

    @Autowired
    private TacoRepository tacoRepository;

    @GetMapping()
    public List<Taco> listar() {
        List<Taco> lista = tacoRepository.findByAtivo(true);
        return lista;
    }

    @GetMapping("/{id}")
    public Taco buscar(@PathVariable int id) {
        Taco taco = tacoRepository.findById(id).get();
        return taco;
    }

    @PostMapping
    public Taco incluir (@RequestBody Taco taco){

        System.out.println("Incluindo taco: " + taco.getNome());
        taco.setIdTaco(0);
        taco.setAtivo(true);
        tacoRepository.save(taco);
        tacoRepository.flush();
        return taco;
    }

    @PutMapping  //Mapeia o POST na URL
    public Taco alterar(@RequestBody Taco taco) {
        tacoRepository.save(taco);
        tacoRepository.flush(); //Comando para gravar a nova aposta efetivamente
        return taco;
    }

    @DeleteMapping("{id}")
    public Taco deletar(@PathVariable Integer id){
        Taco excluir = tacoRepository.findById(id).get();
        excluir.setAtivo(false);
        tacoRepository.save(excluir);
        tacoRepository.flush();
        return excluir;
    }

    @DeleteMapping
    public Taco deletar(@RequestBody Taco taco) {
        Taco excluir = tacoRepository.findById(taco.getIdTaco()).get();
        excluir.setAtivo(false);
        tacoRepository.save(excluir);
        tacoRepository.flush();
        return excluir;
    }
}
