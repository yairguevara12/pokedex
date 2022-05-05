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
public class md_podemon_species_id {

    public int getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(int base_happiness) {
        this.base_happiness = base_happiness;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public md_podemon_species_id_color_obj getColor() {
        return color;
    }

    public void setColor(md_podemon_species_id_color_obj color) {
        this.color = color;
    }

    public md_podemon_species_egg_groups[] getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(md_podemon_species_egg_groups[] egg_groups) {
        this.egg_groups = egg_groups;
    }

    public md_podemon_species_evolution_chain getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(md_podemon_species_evolution_chain evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    public md_podemon_species_evolves_from_species getEvolves_from_species() {
        return evolves_from_species;
    }

    public void setEvolves_from_species(md_podemon_species_evolves_from_species evolves_from_species) {
        this.evolves_from_species = evolves_from_species;
    }

    public md_podemon_species_flavor_text_entries[] getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(md_podemon_species_flavor_text_entries[] flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public Array[] getForm_descriptions() {
        return form_descriptions;
    }

    public void setForm_descriptions(Array[] form_descriptions) {
        this.form_descriptions = form_descriptions;
    }

    public boolean isForms_switchable() {
        return forms_switchable;
    }

    public void setForms_switchable(boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }

    public int getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(int gender_rate) {
        this.gender_rate = gender_rate;
    }

    public md_podemon_species_genera[] getGenera() {
        return genera;
    }

    public void setGenera(md_podemon_species_genera[] genera) {
        this.genera = genera;
    }

    public md_podemon_species_generation getGeneration() {
        return generation;
    }

    public void setGeneration(md_podemon_species_generation generation) {
        this.generation = generation;
    }

    public md_podemon_species_growth_rate getGrowth_rate() {
        return growth_rate;
    }

    public void setGrowth_rate(md_podemon_species_growth_rate growth_rate) {
        this.growth_rate = growth_rate;
    }

    public boolean isHas_gender_differences() {
        return has_gender_differences;
    }

    public void setHas_gender_differences(boolean has_gender_differences) {
        this.has_gender_differences = has_gender_differences;
    }

    public int getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(int hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_baby() {
        return is_baby;
    }

    public void setIs_baby(boolean is_baby) {
        this.is_baby = is_baby;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    public boolean isIs_mythical() {
        return is_mythical;
    }

    public void setIs_mythical(boolean is_mythical) {
        this.is_mythical = is_mythical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public md_podemon_species_names[] getNames() {
        return names;
    }

    public void setNames(md_podemon_species_names[] names) {
        this.names = names;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Array[] getPal_park_encounters() {
        return pal_park_encounters;
    }

    public void setPal_park_encounters(Array[] pal_park_encounters) {
        this.pal_park_encounters = pal_park_encounters;
    }

    public md_podemon_species_pokedex_numbers[] getPokedex_numbers() {
        return pokedex_numbers;
    }

    public void setPokedex_numbers(md_podemon_species_pokedex_numbers[] pokedex_numbers) {
        this.pokedex_numbers = pokedex_numbers;
    }

    public md_podemon_species_shape getShape() {
        return shape;
    }

    public void setShape(md_podemon_species_shape shape) {
        this.shape = shape;
    }

    public md_podemon_species_varieties[] getVarieties() {
        return varieties;
    }

    public void setVarieties(md_podemon_species_varieties[] varieties) {
        this.varieties = varieties;
    }

    int base_happiness;
    int capture_rate;
    md_podemon_species_id_color_obj color;
    md_podemon_species_egg_groups[] egg_groups;
    md_podemon_species_evolution_chain evolution_chain;
    md_podemon_species_evolves_from_species evolves_from_species;
    md_podemon_species_flavor_text_entries[] flavor_text_entries;
    Array[] form_descriptions;
    boolean forms_switchable;
    int gender_rate;
    md_podemon_species_genera[] genera;
    md_podemon_species_generation generation;
    md_podemon_species_growth_rate growth_rate;
    md_podemon_species_habitat habitat;

    public md_podemon_species_habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(md_podemon_species_habitat habitat) {
        this.habitat = habitat;
    }
    boolean has_gender_differences;
    int hatch_counter;
    int id;
    boolean is_baby;
    boolean is_legendary;
    boolean is_mythical;
    String name;
    md_podemon_species_names[] names;
    int order;
    Array[] pal_park_encounters;
    md_podemon_species_pokedex_numbers[] pokedex_numbers;
    md_podemon_species_shape shape;
    md_podemon_species_varieties[] varieties;

}
