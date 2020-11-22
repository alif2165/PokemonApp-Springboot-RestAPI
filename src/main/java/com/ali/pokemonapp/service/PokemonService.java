/**
 * 
 */
package com.ali.pokemonapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ali.pokemonapp.model.Pokemon;
import com.ali.pokemonapp.repository.PokemonRepository;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 13, 2020
 */
@Service
public class PokemonService {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	/**
	 * Service method to fetch all pokemons from a repository
	 * @return List<Pokemon>
	 */
	public List<Pokemon> getAllPokemons(Integer pageNo, Integer pageSize){
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		if(pageSize>0) {
			Pageable paging = PageRequest.of(pageNo, pageSize,Sort.by("pokemonName").ascending());
			pokemonRepository.findAll(paging).forEach(pokemons::add);	
		}else {
			pokemonRepository.findAll().forEach(pokemons::add);
		}
		
		return pokemons;
	}
	
	/**
	 * Service method which returns a pokemon object based on Id
	 * @param Id
	 * @return Pokemon
	 */
	public Pokemon getPokemon(Integer Id){
		
		return pokemonRepository.findById(Id).get();
	}
	
	/**
	 * Service method fetches list of pokemons based on the name specified
	 * @param name
	 * @return List<Pokemon>
	 */
	public List<Pokemon> getPokemonByName(String name){
		return pokemonRepository.findByPokemonNameContaining(name);
	}
}
