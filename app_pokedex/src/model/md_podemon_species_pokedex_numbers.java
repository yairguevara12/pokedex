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
public class md_podemon_species_pokedex_numbers {

    public int getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(int entry_number) {
        this.entry_number = entry_number;
    }

    public md_podemon_species_pokedex_numbers_pokedex getPokedex() {
        return pokedex;
    }

    public void setPokedex(md_podemon_species_pokedex_numbers_pokedex pokedex) {
        this.pokedex = pokedex;
    }
    int entry_number;
    md_podemon_species_pokedex_numbers_pokedex pokedex;
}
