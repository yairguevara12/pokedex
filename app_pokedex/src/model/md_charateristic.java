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
public class md_charateristic {

    public md_characteristic_descriptions[] getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(md_characteristic_descriptions[] descriptions) {
        this.descriptions = descriptions;
    }

    public int getGene_modulo() {
        return gene_modulo;
    }

    public void setGene_modulo(int gene_modulo) {
        this.gene_modulo = gene_modulo;
    }

    public md_charateristic_highest_stat getHighest_stat() {
        return highest_stat;
    }

    public void setHighest_stat(md_charateristic_highest_stat highest_stat) {
        this.highest_stat = highest_stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getPossible_values() {
        return possible_values;
    }

    public void setPossible_values(int[] possible_values) {
        this.possible_values = possible_values;
    }
     md_characteristic_descriptions[] descriptions;
    int gene_modulo;
    md_charateristic_highest_stat highest_stat;
    int id;
    int[] possible_values;
}
