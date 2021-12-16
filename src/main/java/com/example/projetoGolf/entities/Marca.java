package com.example.projetoGolf.entities;


import javax.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Integer idMarca;

    @Column (name= "nome")
    private Integer nome;

    public Marca(Integer idMarca, Integer nome) {
        this.idMarca = idMarca;
        this.nome = nome;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }
}
