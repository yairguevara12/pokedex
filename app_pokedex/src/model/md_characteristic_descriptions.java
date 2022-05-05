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
public class md_characteristic_descriptions {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public md_characteristic_descriptions_language getLanguage() {
        return language;
    }

    public void setLanguage(md_characteristic_descriptions_language language) {
        this.language = language;
    }
      String description ;
    md_characteristic_descriptions_language language ;
}
