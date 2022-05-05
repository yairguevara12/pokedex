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
public class evolution_chain_chain_evolves_to_evolves_to_evolution_details {

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeld_item() {
        return held_item;
    }

    public void setHeld_item(String held_item) {
        this.held_item = held_item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getKnown_movev() {
        return known_movev;
    }

    public void setKnown_movev(String known_movev) {
        this.known_movev = known_movev;
    }

    public String getKnown_move_type() {
        return known_move_type;
    }

    public void setKnown_move_type(String known_move_type) {
        this.known_move_type = known_move_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMin_affection() {
        return min_affection;
    }

    public void setMin_affection(String min_affection) {
        this.min_affection = min_affection;
    }

    public String getMin_beauty() {
        return min_beauty;
    }

    public void setMin_beauty(String min_beauty) {
        this.min_beauty = min_beauty;
    }

    public String getMin_happiness() {
        return min_happiness;
    }

    public void setMin_happiness(String min_happiness) {
        this.min_happiness = min_happiness;
    }

    public int getMin_level() {
        return min_level;
    }

    public void setMin_level(int min_level) {
        this.min_level = min_level;
    }

    public boolean isNeeds_overworld_rain() {
        return needs_overworld_rain;
    }

    public void setNeeds_overworld_rain(boolean needs_overworld_rain) {
        this.needs_overworld_rain = needs_overworld_rain;
    }

    public String getParty_species() {
        return party_species;
    }

    public void setParty_species(String party_species) {
        this.party_species = party_species;
    }

    public String getParty_type() {
        return party_type;
    }

    public void setParty_type(String party_type) {
        this.party_type = party_type;
    }

    public String getRelative_physical_stats() {
        return relative_physical_stats;
    }

    public void setRelative_physical_stats(String relative_physical_stats) {
        this.relative_physical_stats = relative_physical_stats;
    }

    public String getTime_of_day() {
        return time_of_day;
    }

    public void setTime_of_day(String time_of_day) {
        this.time_of_day = time_of_day;
    }

    public String getTrade_species() {
        return trade_species;
    }

    public void setTrade_species(String trade_species) {
        this.trade_species = trade_species;
    }

    public evolution_chain_chain_evolves_to_evolution_details_trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(evolution_chain_chain_evolves_to_evolution_details_trigger trigger) {
        this.trigger = trigger;
    }

    public boolean isTurn_upside_down() {
        return turn_upside_down;
    }

    public void setTurn_upside_down(boolean turn_upside_down) {
        this.turn_upside_down = turn_upside_down;
    }
    String gender;
    String held_item;
    String item;
    String known_movev;
    String known_move_type;
    String location;
    String min_affection;
    String min_beauty;
    String min_happiness;
    int min_level;
    boolean needs_overworld_rain;
    String party_species;
    String party_type;
    String relative_physical_stats;
    String time_of_day;
    String trade_species;
    evolution_chain_chain_evolves_to_evolution_details_trigger trigger ;
    boolean turn_upside_down;
}
