package com.example.projetoGolf.entities;


import javax.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Integer idMarca;

    @Column (name= "nome")
    private String nome;

    public Marca() {
    }

    public Marca(Integer idMarca, String nome) {
        this.idMarca = idMarca;
        this.nome = nome;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
