/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yair
 */
public class md_podemon_species_varieties {

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public md_podemon_species_varieties_pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(md_podemon_species_varieties_pokemon pokemon) {
        this.pokemon = pokemon;
    }
    boolean is_default ;
    md_podemon_species_varieties_pokemon pokemon ;
}
