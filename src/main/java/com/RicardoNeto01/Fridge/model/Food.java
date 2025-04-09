package com.RicardoNeto01.Fridge.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

//Essa notação diz que essa classe é uma entidade no banco de dados, ou seja, todos os atributos estão presentes em um banco de dados.
@Entity
//@Table faz essa classe criar uma tabela no banco de dados
@Table(name = "food_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    //Essa anotation faz o id ser incrementado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime expirationDate;
    private Integer quantity;
}
