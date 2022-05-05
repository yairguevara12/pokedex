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
public class evolution_chain {

    public String getBaby_trigger_item() {
        return baby_trigger_item;
    }

    public void setBaby_trigger_item(String baby_trigger_item) {
        this.baby_trigger_item = baby_trigger_item;
    }

    public evolution_chain_chain getChain() {
        return chain;
    }

    public void setChain(evolution_chain_chain chain) {
        this.chain = chain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  String  baby_trigger_item ;
  evolution_chain_chain chain ;
  int id ;
}
