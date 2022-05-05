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

public class md_pokemon_species {

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public md_resultsarray[] getResults() {
        return results;
    }

    public void setResults(md_resultsarray[] results) {
        this.results = results;
    }
    int count ;
    String next ;
    String previous;
    md_resultsarray[] results;
}
