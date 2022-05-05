/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ct_consulta_ajax;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import model.md_characteristic_descriptions;
import model.md_charateristic;
import model.md_podemon_species_egg_groups;
import model.md_podemon_species_flavor_text_entries;
import model.md_podemon_species_genera;
import model.md_podemon_species_id;
import model.md_pokemon_species;
import model.md_resultsarray;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author yair
 */
public class frm_mainpokedex extends javax.swing.JFrame {

    /**
     * Creates new form frm_mainpokedex
     */
    private String cadena_evolucion;
    private ct_consulta_ajax ct = new ct_consulta_ajax();
    private md_pokemon_species md_pokemon = new md_pokemon_species();

    public frm_mainpokedex() {
        initComponents();
        this.setLocationRelativeTo(this);
        clean_oldfiles();
        this.clean_table();

        Load_table();
    }

    public void clean_oldfiles() {
        try {
            File directory = new File("src\\public_img");
            FileUtils.cleanDirectory(directory);
        } catch (Exception e) {
            System.out.println("Images " + e.getMessage());
        }
    }

    public void Load_table() {
        jTable_pokedex.setDefaultEditor(Object.class, null);
        jTable_pokedex.getTableHeader().setReorderingAllowed(false);
        jTable_pokedex.setAutoCreateColumnsFromModel(true);
        /*   final JScrollPane scrollPane = new JScrollPane(jTable_pokedex);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);*/

        DefaultTableModel model = (DefaultTableModel) jTable_pokedex.getModel();
        //model.
        System.out.println(model.getColumnCount());
        if (model.getColumnCount() == 0) {
            model.addColumn("N°");

            model.addColumn("POKEMON");

        }

        load_rows(model);
    }

    private void clean_table() {
        DefaultTableModel modelclean = (DefaultTableModel) jTable_pokedex.getModel();
        modelclean.setRowCount(0);
    }

    public void load_rows(DefaultTableModel model) {

        this.md_pokemon = ct.all_pokemons();
        md_resultsarray[] md_resultarray = md_pokemon.getResults();
        for (int i = 0; i < 28; i++) {

            model.addRow(new Object[]{
                i,
                md_resultarray[i].getName()

            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_pokedex = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel_contador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_pokemonname = new javax.swing.JLabel();
        jLabel_main_picture = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_rango_captura = new javax.swing.JLabel();
        jLabel_color = new javax.swing.JLabel();
        jLabel_genero = new javax.swing.JLabel();
        jLabel_generacion = new javax.swing.JLabel();
        jLabel_habitat = new javax.swing.JLabel();
        jLabel_legendario = new javax.swing.JLabel();
        jLabel_forma = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setText("POKEDEX");

        jTable_pokedex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_pokedex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pokedexMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_pokedex);

        jToggleButton1.setText(">");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("<");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel_contador.setText("1");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel2.setText("Nombre : ");

        jLabel_pokemonname.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel_pokemonname.setText("...");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setText("Descripcion");

        jTextArea_description.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea_description.setColumns(20);
        jTextArea_description.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea_description.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea_description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_description);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Rango de captura : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Color :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("genero");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("generacion :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("habitat : ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Legendario :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Forma :");

        jLabel_rango_captura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_rango_captura.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_rango_captura.setText("...");

        jLabel_color.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_color.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_color.setText("..");

        jLabel_genero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_genero.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_genero.setText("..");

        jLabel_generacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_generacion.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_generacion.setText("..");

        jLabel_habitat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_habitat.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_habitat.setText("..");

        jLabel_legendario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_legendario.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_legendario.setText("..");

        jLabel_forma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_forma.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_forma.setText("..");

        jToggleButton3.setText("Cadena de Evolucion");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel_pokemonname, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_main_picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_generacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_rango_captura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_forma, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_legendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_habitat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_pokemonname)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_main_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel_rango_captura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel_color))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel_genero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel_generacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel_habitat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel_legendario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel_forma))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jLabel_contador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        pagination_next();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        pagination_before();

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTable_pokedexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pokedexMouseClicked

        if (evt.getClickCount() == 2 && jTable_pokedex.getSelectedRow() != -1) {
            int selected_row = jTable_pokedex.getSelectedRow();
            int selected_column = 0;
            DefaultTableModel get_table = (DefaultTableModel) jTable_pokedex.getModel();
            int id_pokemon = Integer.parseInt(get_table.getValueAt(selected_row, selected_column).toString());
            ct.set_image_pokemon(jLabel_main_picture, String.valueOf(id_pokemon + 1));
            jLabel_pokemonname.setText(get_table.getValueAt(selected_row, selected_column + 1).toString());

            md_podemon_species_id md_pokemon_species = ct.characteristic_pokemon(String.valueOf(id_pokemon + 1));
            md_podemon_species_flavor_text_entries[] mdcharacteristic_descriptions = md_pokemon_species.getFlavor_text_entries();

            for (int i = 0; i < mdcharacteristic_descriptions.length; i++) {
                if (mdcharacteristic_descriptions[i].getLanguage().getName().equals("es")) {
                    //  System.out.println("->" + mdcharacteristic_descriptions[i].getFlavor_text());
                    if (i > 2) {
                        jTextArea_description.setText(null);
                    }
                    jTextArea_description.append(mdcharacteristic_descriptions[i].getFlavor_text());
                }
            }

            jLabel_rango_captura.setText(String.valueOf(md_pokemon_species.getCapture_rate()));
            jLabel_color.setText(md_pokemon_species.getColor().getName());

            md_podemon_species_genera[] mdpodemon_species_genera = md_pokemon_species.getGenera();

            for (int i = 0; i < mdpodemon_species_genera.length; i++) {
                if (mdpodemon_species_genera[i].getLanguage().getName().equals("es")) {
                    //  System.out.println("->" + mdpodemon_species_genera[i].getFlavor_text());

                    jLabel_genero.setText(mdpodemon_species_genera[i].getGenus());
                }
            }

            jLabel_generacion.setText(md_pokemon_species.getGeneration().getName());
            //     System.out.println(md_pokemon_species.getHabitat() == null);
            if (!(md_pokemon_species.getHabitat() == null)) {
                jLabel_habitat.setText(md_pokemon_species.getHabitat().getName());
                //jLabel_genero.setText(md_pokemon_species.getColor().getName());
                if (md_pokemon_species.isIs_legendary()) {
                    jLabel_legendario.setText("si");
                } else {
                    jLabel_legendario.setText("no");

                }
                jLabel_forma.setText(md_pokemon_species.getShape().getName());
            } else {
                jLabel_habitat.setText("unknown");
                jLabel_legendario.setText("unknown");
                jLabel_forma.setText("unknown");
                System.out.println("...");
            }

            System.out.println(md_pokemon_species.getEvolution_chain().getUrl());
            this.cadena_evolucion = md_pokemon_species.getEvolution_chain().getUrl();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_pokedexMouseClicked

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        Instanciar_cadena_evolucion();        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed
    public void Instanciar_cadena_evolucion() {

        //DefaultTableModel get_table = (DefaultTableModel) table_student.getModel();
        //   int user_dni = Integer.parseInt(get_table.getValueAt(selected_row, selected_column).toString());
        jd_cadena_evolucion editing_user = new jd_cadena_evolucion(this, rootPaneCheckingEnabled,this.cadena_evolucion);
        editing_user.setModal(true);
        editing_user.setVisible(true);

        editing_user.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }

    public void pagination_before() {

        if (jTable_pokedex.getRowCount() >= 0) {

            if (Integer.parseInt(jLabel_contador.getText()) > 1) {
                DefaultTableModel model = (DefaultTableModel) jTable_pokedex.getModel();
                model.setRowCount(0);
                int add_cont = Integer.parseInt(jLabel_contador.getText()) - 1;
                jLabel_contador.setText(String.valueOf(add_cont));

                int pagination_number = Integer.parseInt(jLabel_contador.getText());
                //    System.out.println(cantidad_total);
                //  System.out.println(pagination_number);

                md_resultsarray[] md_resultarray = md_pokemon.getResults();
                int validate_count = this.md_pokemon.getCount() - (28 * pagination_number);

                //    System.out.println("->" + String.valueOf(validate_count));
                if (validate_count > 28) {
                    System.out.println("pasa");

                    for (int i = (28 * pagination_number) - 28; i < 28 * pagination_number; i++) {

                        model.addRow(new Object[]{
                            i,
                            md_resultarray[i].getName()

                        });

                    }
                } else if (validate_count > 0) {
                    for (int i = (28 * pagination_number); i < (28 * pagination_number) + validate_count; i++) {

                        model.addRow(new Object[]{
                            i,
                            md_resultarray[i].getName()

                        });

                    }

                }

            }

        }
    }

    public void pagination_next() {

        if (jTable_pokedex.getRowCount() >= 28) {
            DefaultTableModel model = (DefaultTableModel) jTable_pokedex.getModel();
            model.setRowCount(0);

            int add_cont = Integer.parseInt(jLabel_contador.getText()) + 1;
            jLabel_contador.setText(String.valueOf(add_cont));

            int pagination_number = Integer.parseInt(jLabel_contador.getText());
            //    System.out.println(cantidad_total);
            //  System.out.println(pagination_number);

            md_resultsarray[] md_resultarray = md_pokemon.getResults();
            int validate_count = this.md_pokemon.getCount() - (28 * pagination_number);

            //    System.out.println("->" + String.valueOf(validate_count));
            if (validate_count > 28) {
                // System.out.println("pasa");

                for (int i = (28 * pagination_number) - 28; i < 28 * pagination_number; i++) {

                    model.addRow(new Object[]{
                        i,
                        md_resultarray[i].getName()

                    });

                }
            } else if (validate_count > 0) {
                for (int i = (28 * pagination_number); i < (28 * pagination_number) + validate_count; i++) {

                    model.addRow(new Object[]{
                        i,
                        md_resultarray[i].getName()

                    });

                }

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_mainpokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_mainpokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_mainpokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_mainpokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_mainpokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_color;
    private javax.swing.JLabel jLabel_contador;
    private javax.swing.JLabel jLabel_forma;
    private javax.swing.JLabel jLabel_generacion;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_habitat;
    private javax.swing.JLabel jLabel_legendario;
    private javax.swing.JLabel jLabel_main_picture;
    private javax.swing.JLabel jLabel_pokemonname;
    private javax.swing.JLabel jLabel_rango_captura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_pokedex;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
