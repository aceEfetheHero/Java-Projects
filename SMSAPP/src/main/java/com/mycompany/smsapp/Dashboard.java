/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.smsapp;

import java.awt.image.BufferedImage;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JPanel {
    
     private BufferedImage image;
    private static final Logger LOG = Logger.getLogger(Dashboard.class.getName());
    protected BufferedImage background;
 
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
         super(true);
        initComponents();
           }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 255, 255));
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
