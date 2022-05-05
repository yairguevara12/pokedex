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
public class md_podemon_species_names {

    public md_podemon_species_names_language getLanguage() {
        return language;
    }

    public void setLanguage(md_podemon_species_names_language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    md_podemon_species_names_language language;
    String name ;
}
