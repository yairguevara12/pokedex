/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_pokedex;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import model.md_pokemon_species;

/**
 *
 * @author yair
 */
public class Application_pokedex {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*  Probamos_cositas pc = new Probamos_cositas();
        pc.Inicio();*/
        WebClient client = new WebClient();
        Page page = client.getPage("https://pokeapi.co/api/v2/pokemon-species/?limit=898");
        WebResponse response = page.getWebResponse();
        // System.out.println(response.getContentAsString());
        if (response.getContentType().equals("application/json")) {
            String json = response.getContentAsString();

            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();

            Gson gson = builder.create();
            md_pokemon_species student = gson.fromJson(json, md_pokemon_species.class);
            System.out.println(student);
            String jsonString;
            jsonString = gson.toJson(student);
            System.out.println(jsonString);
        }
    }
    
}
