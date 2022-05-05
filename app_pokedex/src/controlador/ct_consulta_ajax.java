package controlador;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HTMLParser;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.gson.Gson;
import model.md_pokemon_species;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import model.evolution_chain;
import model.evolution_chain_chain_evolves_to;
import model.evolution_chain_chain_evolves_to_evolution_details;
import model.evolution_chain_chain_evolves_to_evolves_to;
import model.md_charateristic;
import model.md_podemon_species_id;
import model.md_resultsarray;

/**
 *
 * @author yair
 */
public class ct_consulta_ajax {

    WebClient webclient = new WebClient(BrowserVersion.CHROME);
    HtmlPage htmlpage = null;
    Page page = null;

    public evolution_chain evolution_chain(String url) {

        evolution_chain evolutionchain = new evolution_chain();
        try {
            WebClient client = new WebClient();

            Page page1 = client.getPage(url);

            HtmlPage tmpPage = HTMLParser.parseHtml(page1.getWebResponse(), client.getCurrentWindow());

            //   System.out.println(tmpPage.asText());
            WebResponse response = page1.getWebResponse();

            if (response.getContentType().equals("application/json")) {
                String json = tmpPage.asText();
                GsonBuilder builder = new GsonBuilder();
                builder.setPrettyPrinting();

                Gson gson = builder.create();
                evolutionchain = gson.fromJson(json, evolution_chain.class);
                //chain evolution
              /*  evolution_chain_chain_evolves_to[] getevolution_detail = evolutionchain.getChain().getEvolves_to();

                evolution_chain_chain_evolves_to[] probando = evolutionchain.getChain().getEvolves_to();
                evolution_chain_chain_evolves_to_evolves_to[] prueba2 = probando[0].getEvolves_to();
                
                
                
                System.out.println(prueba2[0].getSpecies().getUrl());
                System.out.println(getevolution_detail[0].getSpecies().getUrl());
                System.out.println(evolutionchain.getChain().getSpecies().getUrl());*/
                
                
                
                
                
            }

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());

        }
        return evolutionchain;
    }

    public md_podemon_species_id characteristic_pokemon(String id) {

        md_podemon_species_id md_podemon_species_id = new md_podemon_species_id();
        try {
            WebClient client = new WebClient();

            Page page1 = client.getPage("https://pokeapi.co/api/v2/pokemon-species/" + id);

            HtmlPage tmpPage = HTMLParser.parseHtml(page1.getWebResponse(), client.getCurrentWindow());

            //   System.out.println(tmpPage.asText());
            WebResponse response = page1.getWebResponse();
            /* System.out.println(response.getContentAsString());
            System.out.println(response.getContentType());*/

            if (response.getContentType().equals("application/json")) {
                String json = tmpPage.asText();
                GsonBuilder builder = new GsonBuilder();
                builder.setPrettyPrinting();

                Gson gson = builder.create();
                md_podemon_species_id = gson.fromJson(json, md_podemon_species_id.class);
                //   System.out.println(md_podemon_species_id.getName());
                /*        System.out.println(student.getDescriptions()s(.description);
                System.out.println(student.descriptions[5].language.name);*/
            }

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());

        }
        return md_podemon_species_id;
    }

    public md_pokemon_species all_pokemons() {
        md_pokemon_species md_pokemon = new md_pokemon_species();
        try {
            WebClient client = new WebClient();
            //   Page page = client.getPage("https://pokeapi.co/api/v2/characteristic/4");
            Page page = client.getPage("https://pokeapi.co/api/v2/pokemon-species/?limit=898");

            WebResponse response = page.getWebResponse();

            //   System.out.println(response.getContentAsString());
            if (response.getContentType().equals("application/json")) {
                String json = response.getContentAsString();

                GsonBuilder builder = new GsonBuilder();
                builder.setPrettyPrinting();

                Gson gson = builder.create();
                md_pokemon = gson.fromJson(json, md_pokemon_species.class);
                //   System.out.println(md_pokemon.getResults().length);
                md_resultsarray[] mdresult = md_pokemon.getResults();
                //  System.out.println(mdresult[0].getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return md_pokemon;

    }

    private void Iniciar() {
        try {
            //el webcliente es la simulacion del buscador
            webclient.getOptions().setJavaScriptEnabled(true);//activando el uso de java script(mala opcion)
            ///OPCIONC CORRECTA para usar el javascript          webclient.getOptions().setJavaScriptEnabled(true);//activando el uso de java script

            webclient.getOptions().setCssEnabled(true); //desactivando  el uso de css
            webclient.getCookieManager().setCookiesEnabled(true); //habilitando el uso de cookies
            webclient.setAjaxController(new NicelyResynchronizingAjaxController());//sirve para estar ordenados por javascript
            webclient.getOptions().setThrowExceptionOnScriptError(false);

//            webclient.getOptions().setUseInsecureSSL(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void set_image_pokemon(JLabel jLabelImagen_pokemon, String id) {
        Iniciar();
        try {
            page = webclient.getPage("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");

            htmlpage = HTMLParser.parseHtml(page.getWebResponse(), webclient.getCurrentWindow());
            InputStream is = htmlpage.getWebResponse().getContentAsStream();

            OutputStream out = new FileOutputStream(new File("src\\public_img\\imagen_principal_default" + id + ".png"));

            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = is.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            is.close();
            out.flush();
            out.close();

            ImageIcon imageicon = new ImageIcon("src\\public_img\\imagen_principal_default" + id + ".png");

            jLabelImagen_pokemon.setHorizontalAlignment(jLabelImagen_pokemon.CENTER);
            jLabelImagen_pokemon.setVerticalAlignment(JLabel.CENTER);
            jLabelImagen_pokemon.setBorder(new LineBorder(Color.RED, 4));
            jLabelImagen_pokemon.setIcon(imageicon);
        } catch (Exception e) {
            System.out.println("Error image " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //  System.out.println(System.getProperty("java.class.path"));
        ct_consulta_ajax ct = new ct_consulta_ajax();
        ct.evolution_chain("2");
    }
}
