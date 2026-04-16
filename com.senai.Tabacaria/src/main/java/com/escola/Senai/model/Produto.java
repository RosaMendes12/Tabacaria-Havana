package com.escola.Senai.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Gera Getters, Setters e toString
@NoArgsConstructor // Exigido pelo Hibernate
@AllArgsConstructor // Facilita a criação de objetos
@Table(name = "produtos")
public class Produto {

    @Id //Define que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //O banco de dados gera os números sozinho (1,2,3...).
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private double preco;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int estoque;


}