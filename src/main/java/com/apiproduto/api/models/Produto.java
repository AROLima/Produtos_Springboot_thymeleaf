package com.apiproduto.api.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity

public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double valor;
    
    
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

}
