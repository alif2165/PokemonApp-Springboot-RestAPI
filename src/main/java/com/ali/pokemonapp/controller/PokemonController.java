/**
 * 
 */
package com.ali.pokemonapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ali.pokemonapp.model.Pokemon;
import com.ali.pokemonapp.service.PokemonService;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 11, 2020
 */
@RestController
@RequestMapping("pokemonApp")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/pokemons")
	public List<Pokemon> getAllPokemon(@RequestParam Map<String, String> urlParam) {
		return pokemonService.getAllPokemons(Integer.valueOf(urlParam.getOrDefault("pageNo", "0")),
				Integer.valueOf(urlParam.getOrDefault("pageSize","0")));
	}
	
	@GetMapping("/pokemons/search")
	public List<Pokemon> searchPokemonByName(@RequestParam Map<String, String> urlParam) {
		return pokemonService.getPokemonByName(urlParam.get("name"));
	}
	
	@GetMapping("/pokemons/{Id}")
	public Pokemon getPokemon(@PathVariable Integer Id) {
		return pokemonService.getPokemon(Id);
	}
	
}
