package com.softtek.mayo13.modelo;

import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "moviles")
public class Movil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovil;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double precio;
    @Column(length = 60,nullable = false)
    private String marca;
}