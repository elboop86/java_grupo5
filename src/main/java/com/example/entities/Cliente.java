package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter      //Métodos Getter
@Setter      //Métodos Setter
@NoArgsConstructor  //Constructor sin párametros
@AllArgsConstructor // Constructor con párametros
@ToString  // Método ToString
@Builder  // Permite objetos dinámicos con concatenación
@Entity

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCompleto;
    @ManyToOne
    // @JoinColumn(name = "address_id")
    private String address;
    private String email;
    private String nif;
    private Integer telefono;

}
