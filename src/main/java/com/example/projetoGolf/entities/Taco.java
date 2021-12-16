package com.example.projetoGolf.entities;

import javax.persistence.*;

@Entity
@Table(name = "taco")
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Integer idTaco;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idMarca")
    private Integer idMarca;

    public Taco() {
    }

    public Taco(Integer idTaco, Integer numero, String nome, Integer idMarca) {
        this.idTaco = idTaco;
        this.numero = numero;
        this.nome = nome;
        this.idMarca = idMarca;
    }

    public Integer getIdTaco() {
        return idTaco;
    }

    public void setIdTaco(Integer idTaco) {
        this.idTaco = idTaco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }
}
