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
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import model.md_resultsarray;

/**
 *
 * @author yair
 */
public class ct_consulta_ajax {

    WebClient webclient = new WebClient(BrowserVersion.CHROME);
    HtmlPage htmlpage = null;
    Page page = null;

    public md_pokemon_species all_pokemons() {
        md_pokemon_species md_pokemon = new md_pokemon_species();
        try {
            WebClient client = new WebClient();
            Page page = client.getPage("https://pokeapi.co/api/v2/pokemon-species/?limit=898");
            WebResponse response = page.getWebResponse();
            // System.out.println(response.getContentAsString());
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
            // System.out.println(page.());
            htmlpage = HTMLParser.parseHtml(page.getWebResponse(), webclient.getCurrentWindow());
            InputStream is = htmlpage.getWebResponse().getContentAsStream();

            /*
            //  HtmlImage image = (HtmlImage) htmlpage.<HtmlImage>getFirstByXPath("//img[src]");
            // System.out.println(htmlpage.getElementByName("img").getLocalName());
            HtmlImage image = (HtmlImage) htmlpage.getElementByName("img").getFirstByXPath("//img");
            ImageReader imagenReader = image.getImageReader();
            BufferedImage buf = imagenReader.read(0);
            ImageIcon imageicon = new ImageIcon(buf);
            jLabelImagen_pokemon.setIcon(imageicon);
            
             */
            OutputStream out = new FileOutputStream(new File("imagen_principal_default" + id + ".png"));

            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = is.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            is.close();
            out.flush();
            out.close();
            System.out.println("New file created!");
            //      wait(1000);
            // Thread.sleep(1000);
            ImageIcon imageicon = new ImageIcon("imagen_principal_default" + id + ".png");
            //    BufferedImage myPicture = ImageIO.read(new File("imagen_principal_default.png"));
            //   JLabel lbl = new JLabel("Hello, World", imageicon, (int) JLabel.LEFT_ALIGNMENT);
            //    JLabel picLabel = new JLabel(new ImageIcon(myPicture));

            //    Icon icon = new ImageIcon(getClass().getResource("imagen_principal_default.png"));
            //  jLabelImagen_pokemon.remove();
            //  picLabel.setIcon(null);
            //  jLabelImagen_pokemon.setIcon(imageicon);
            jLabelImagen_pokemon.setHorizontalAlignment(jLabelImagen_pokemon.CENTER);
            jLabelImagen_pokemon.setVerticalAlignment(JLabel.CENTER);
            jLabelImagen_pokemon.setBorder(new LineBorder(Color.RED, 4));
            jLabelImagen_pokemon.setIcon(imageicon);
        } catch (Exception e) {
            System.out.println("Error capcha " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        ct_consulta_ajax ct = new ct_consulta_ajax();
        ct.all_pokemons();
    }
}
