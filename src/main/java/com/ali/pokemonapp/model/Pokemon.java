/**
 * 
 */
package com.ali.pokemonapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 12, 2020
 */
@Entity(name="pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer pokemonId;
	
	@Column(name="identifier")
	private String pokemonName;
	
	@Column(name="height")
	private Integer height;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="base_experience")
	private Integer baseExperience;
	
	@Column(name="ORDERS")
	private Integer orders;
	
	@Column(name="is_default")
	private Integer isDefault;

	
	@Override
	public String toString() {
		return "Pokemon [pokemonId=" + pokemonId + ", pokemonName=" + pokemonName + ", height=" + height + ", weight="
				+ weight + ", baseExperience=" + baseExperience + ", orders=" + orders + ", isDefault=" + isDefault
				+ "]";
	}

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(Integer baseExperience) {
		this.baseExperience = baseExperience;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	
}
