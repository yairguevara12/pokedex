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
public class md_podemon_species_genera {

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public md_podemon_species_genera_language getLanguage() {
        return language;
    }

    public void setLanguage(md_podemon_species_genera_language language) {
        this.language = language;
    }
    String genus ;
    md_podemon_species_genera_language language ; 
    
}
