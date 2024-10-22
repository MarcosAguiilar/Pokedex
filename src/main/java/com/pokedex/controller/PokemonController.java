package com.pokedex.controller;

import com.pokedex.model.Pokemon;
import com.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/")
    public String index(Model model) {
        List<Pokemon> pokemonList = pokemonService.getAllPokemon();
        model.addAttribute("pokemonList", pokemonList);
        return "index";
    }

    @GetMapping("/pokemon/{id}")
    public String viewPokemon(@PathVariable Long id, Model model) {
        Pokemon pokemon = pokemonService.getPokemonById(id);
        model.addAttribute("pokemon", pokemon);
        return "pokemon-detail";
    }

    @GetMapping("/search")
    public String searchPokemon(@RequestParam("name") String name, Model model) {
        List<Pokemon> results = pokemonService.searchPokemonByName(name);
        model.addAttribute("pokemonList", results);
        return "index";
    }
}
