/**
 * 
 */
package com.ali.pokemonapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.pokemonapp.model.Pokemon;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 13, 2020
 */
public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{

	public List<Pokemon> findByPokemonNameContaining(String name);
	public List<Pokemon> findByPokemonNameStartsWith(String name);
	public List<Pokemon> findByPokemonNameEndsWith(String name);
	
}
