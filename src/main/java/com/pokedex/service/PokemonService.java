package com.pokedex.service;

import com.pokedex.model.Pokemon;
import com.pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Pokemon getPokemonById(Long id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    public List<Pokemon> searchPokemonByName(String name) {
        return pokemonRepository.findByName(name);
    }
}

