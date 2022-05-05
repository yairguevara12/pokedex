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
public class md_podemon_species_flavor_text_entries {

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public md_podemon_species_flavor_text_entries_language getLanguage() {
        return language;
    }

    public void setLanguage(md_podemon_species_flavor_text_entries_language language) {
        this.language = language;
    }

    public md_podemon_species_flavor_text_entries_version getVersion() {
        return version;
    }

    public void setVersion(md_podemon_species_flavor_text_entries_version version) {
        this.version = version;
    }
    String flavor_text;
    md_podemon_species_flavor_text_entries_language language ;
    md_podemon_species_flavor_text_entries_version version ;
    
}
