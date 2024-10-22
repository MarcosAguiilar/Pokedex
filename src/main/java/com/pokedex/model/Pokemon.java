package com.pokedex.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    private List<String> type;

    @ElementCollection
    private List<String> abilities;

    private String description;

    private String imageUrl;

    @Embedded
    private BaseStats baseStats;

    // Getters y Setters
    // Constructor por defecto
}

