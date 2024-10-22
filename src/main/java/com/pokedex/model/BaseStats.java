package com.pokedex.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class BaseStats {
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    // Getters y Setters
    // Constructor por defecto
}
