/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Array;

/**
 *
 * @author yair
 */
public class evolution_chain_chain {

    public Array[] getEvolution_details() {
        return evolution_details;
    }

    public void setEvolution_details(Array[] evolution_details) {
        this.evolution_details = evolution_details;
    }

    public evolution_chain_chain_evolves_to[] getEvolves_to() {
        return evolves_to;
    }

    public void setEvolves_to(evolution_chain_chain_evolves_to[] evolves_to) {
        this.evolves_to = evolves_to;
    }

    public boolean isIs_baby() {
        return is_baby;
    }

    public void setIs_baby(boolean is_baby) {
        this.is_baby = is_baby;
    }

    public evolution_chain_chain_evolves_to_evolves_to_species getSpecies() {
        return species;
    }

    public void setSpecies(evolution_chain_chain_evolves_to_evolves_to_species species) {
        this.species = species;
    }
    Array[] evolution_details ;
    evolution_chain_chain_evolves_to[]   evolves_to;
    boolean is_baby;
    evolution_chain_chain_evolves_to_evolves_to_species species;
}
