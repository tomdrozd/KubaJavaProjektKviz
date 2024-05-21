/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projektjakubdrozdide16;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;

/**
 *JFRAME ve kerém se zobrazují otázky
 * @author drozd19100
 */
public class Kviz extends javax.swing.JFrame {
    ArrayList<Otazka> list;
    int indexAktOtazky=0; //index otázky, aby kdyz dojdou otázky tak se zobrazila obrazovka s vysledky, viz. DalsiActionPerformed
    int skore=0;
    boolean otazkaspravneDalsi = false;
    String nazevKvizu;
    FileReader fr = new FileReader();


    
    /**
     * Nacteni souboru text ktery je predany z tridy UvodniObrazovka.java
     * @param Text 
     */
     
/**
 * setter na skore
 * @param skore 
 */
    public void setSkore(int skore) {
        this.skore = skore;
    }
    /**
     * Creates new form Kviz
     * @param data
     */
    public Kviz(ArrayList<Otazka> data) {
        initComponents();
        list = data;
        Collections.shuffle(list);
        ProgressBarKviz.setMaximum(list.size());
        this.ZapisPomDoGUI(list.get(0));
    }
    
    
    /**
     * tato funkce zapisuje otazky ze seznamu do GUI
     * @param o 
     */
     public void ZapisPomDoGUI(Otazka o) {
         Collections.shuffle(o.odpovedi);
         TextOtazky.setText(o.otazka);
         Odpoved1.setText(o.odpovedi.get(0).textOdpovedi);
         Odpoved2.setText(o.odpovedi.get(1).textOdpovedi);
         Odpoved3.setText(o.odpovedi.get(2).textOdpovedi);
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TextOtazky = new javax.swing.JLabel();
        Odpoved1 = new javax.swing.JRadioButton();
        Odpoved2 = new javax.swing.JRadioButton();
        Odpoved3 = new javax.swing.JRadioButton();
        NazevKvizu = new javax.swing.JLabel();
        odpovedOtevrenaOtazka = new javax.swing.JTextField();
        ProgressBarKviz = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(Odpoved1);
        Odpoved1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Odpoved1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Odpoved2);
        Odpoved2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Odpoved2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Odpoved3);
        Odpoved3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Odpoved3ActionPerformed(evt);
            }
        });

        odpovedOtevrenaOtazka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odpovedOtevrenaOtazkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NazevKvizu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Odpoved3, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(Odpoved2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Odpoved1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextOtazky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(185, 185, 185)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(odpovedOtevrenaOtazka, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ProgressBarKviz, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NazevKvizu, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextOtazky, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Odpoved1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Odpoved2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Odpoved3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odpovedOtevrenaOtazka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ProgressBarKviz, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Funkce která reaguje na zmáčknutí tlačítka 1
 * @param evt 
 */
    private void Odpoved1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Odpoved1ActionPerformed
        otazkaspravneDalsi = list.get(indexAktOtazky).odpovedi.get(0).spravne;
      try {
            if(otazkaspravneDalsi) {
                skore += list.get(indexAktOtazky).getHodnota();
            }
            indexAktOtazky += 1;
            ZapisPomDoGUI(list.get(indexAktOtazky));
            buttonGroup1.clearSelection();
        } catch (IndexOutOfBoundsException e) {
            ZobrazVysledky(skore); // Při vyčerpání otázek předejte celkové skóre
        }
        }
    
        static { //toto mi ze záhadného důvodu nejde smazat
    }//GEN-LAST:event_Odpoved1ActionPerformed

    private void ZobrazVysledky(int skore) {
        gui.vysledkyFrame(this, "Vysledky", skore);
    }                                     
    
    
    /**
 * Funkce která reaguje na zmáčknutí tlačítka 2
 * @param evt 
 */
    private void Odpoved2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Odpoved2ActionPerformed
        otazkaspravneDalsi = list.get(indexAktOtazky).odpovedi.get(1).spravne;
       try {
            if(otazkaspravneDalsi) {
                skore += list.get(indexAktOtazky).getHodnota();
            }
            indexAktOtazky += 1;
            ZapisPomDoGUI(list.get(indexAktOtazky));
            buttonGroup1.clearSelection();
        } catch (IndexOutOfBoundsException e) {
            ZobrazVysledky(skore); // Při vyčerpání otázek předejte celkové skóre
        }
        }
        static { //toto mi ze záhadného důvodu nejde smazat
    }//GEN-LAST:event_Odpoved2ActionPerformed

        /**
 * Funkce která reaguje na zmáčknutí tlačítka 3
 * @param evt 
 */
    private void Odpoved3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Odpoved3ActionPerformed
        otazkaspravneDalsi = list.get(indexAktOtazky).odpovedi.get(2).spravne;
        try {
            if(otazkaspravneDalsi) {
                skore += list.get(indexAktOtazky).getHodnota();
            }
            indexAktOtazky += 1;
            ProgressBarKviz.setValue(indexAktOtazky);
            
            ZapisPomDoGUI(list.get(indexAktOtazky));
            buttonGroup1.clearSelection();
        } catch (IndexOutOfBoundsException e) {
            ZobrazVysledky(skore); // Při vyčerpání otázek předejte celkové skóre
        }
        }
        static { //toto mi ze záhadného důvodu nejde smazat
    }//GEN-LAST:event_Odpoved3ActionPerformed
        
    private void odpovedOtevrenaOtazkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odpovedOtevrenaOtazkaActionPerformed
       
    }//GEN-LAST:event_odpovedOtevrenaOtazkaActionPerformed

    GUImanager gui = new GUImanager();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NazevKvizu;
    private javax.swing.JRadioButton Odpoved1;
    private javax.swing.JRadioButton Odpoved2;
    private javax.swing.JRadioButton Odpoved3;
    private javax.swing.JProgressBar ProgressBarKviz;
    private javax.swing.JLabel TextOtazky;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField odpovedOtevrenaOtazka;
    // End of variables declaration//GEN-END:variables
}
