/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Mixer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author BLOUH
 */
public class GuessingGame extends javax.swing.JFrame {

    /**
     * Creates new form GuessingGame
     */
    private static Mixer mixer;
    private static Mixer mixer2;
    private static Clip clip;
    private static Clip clip1;
    private static JFrame HowTo;
private static JPanel HowToPanel;
private static JLabel  HowToLabel;
private static JTextPane HowToPane;
     public GuessingGame(){
         super("Guezzer v1.0.0");
         initComponents();
 setBounds(500, 100, 350, 400);
              setResizable(false);
              setFocusable(true);
         jButton_guess.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_howToPlay = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jButton_guess = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setIconImages(getIconImages());
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("             GUEZZER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 196, 27);

        jButton_howToPlay.setBackground(jLabel2.getBackground());
        jButton_howToPlay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_howToPlay.setForeground(new java.awt.Color(102, 153, 0));
        jButton_howToPlay.setMnemonic(jButton_howToPlay.getIconTextGap());
        jButton_howToPlay.setText("How to Play Guezzer");
        jButton_howToPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_howToPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_howToPlayMouseExited(evt);
            }
        });
        jButton_howToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_howToPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_howToPlay);
        jButton_howToPlay.setBounds(60, 150, 215, 38);

        jButton_exit.setBackground(new java.awt.Color(102, 204, 0));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(51, 0, 255));
        jButton_exit.setText("Exit Game");
        jButton_exit.setAutoscrolls(true);
        jButton_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_exitMouseExited(evt);
            }
        });
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_exit);
        jButton_exit.setBounds(100, 200, 130, 38);

        jButton_guess.setBackground(new java.awt.Color(0, 153, 153));
        jButton_guess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_guess.setForeground(new java.awt.Color(102, 255, 102));
        jButton_guess.setText("Play");
        jButton_guess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_guessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_guessMouseExited(evt);
            }
        });
        jButton_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guessActionPerformed(evt);
            }
        });
        jButton_guess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_guessKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton_guessKeyTyped(evt);
            }
        });
        getContentPane().add(jButton_guess);
        jButton_guess.setBounds(130, 100, 68, 38);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Images/image-1.jpeg"))); // NOI18N
        jLabel3.setAutoscrolls(true);
        jLabel3.setPreferredSize(getPreferredSize());
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-90, -30, 450, 490);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 280, 110, 20);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 50, 41, 16);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void Play(){
                   clip.stop();
       dispose(); 
new Thread(new Runnable() {
           @Override
           public void run() {
               clip.stop();     
           //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Playgame P = new Playgame();
               P.setVisible(true);
               P.setBounds(400, 150, 320, 250);
               P.setAlwaysOnTop(true);
               P.setResizable(false);
               P.setDefaultCloseOperation(GuessingGame.EXIT_ON_CLOSE);
           }
       }).start();

    }
    private void jButton_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guessActionPerformed
        // TODO add your handling code here:
       // String guessText1 = jTextField_numberGuess1.getText();
       // String guessText2 = jLabel_numberGuess2.getText();
    Play();
        
    }//GEN-LAST:event_jButton_guessActionPerformed

    private void jButton_howToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_howToPlayActionPerformed

        validate();
        repaint();

        HowTo = new JFrame("How to play Guezzer");
HowTo.setBounds(400, 200, 400, 200);
HowTo.setVisible(true);
//HowTo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

HowToPanel = new JPanel(new BorderLayout());
HowToPanel.setBackground(new Color(Integer.decode("#dada8f")));
HowToPanel.setBounds(5,10,400,200);
HowToPanel.setVisible(true);
HowToPanel.setOpaque(true);
//set how to texxt
HowToPane = new JTextPane();

HowToPane.setText("\n\t\t GUEZZER HINTS \n\n\n Player are only allowed to a Pick number from the range of 0 - 10. \n"
       
        + " Player is given 50 Gpts has a Headstart \n A correct guezzed number is awarded a 15 Gpts win  \n And a wrong guezzed number is a lose with 3 Gpts lost."
        + "\n\n A straight 3 wins will grant you a 50 point win and a straight 6 Gpts lost will grant you a 10 point lost \n"
         + " Player got only 5 Rounds to play "
        + "\n Player with the highest score of 200 Gpts wins that round flawlessly with a bonus point of 50 Gpts added to next round \n"
        + " And Play with the lowest score of 0 Gpts lose the Game\n\n"
        + " At the end of all Rounds Gpts are gather to give Player Total score."
        + "\n\n\t GUEZZ YOUR BRAINS OUT!!!");
HowToPane.setBackground(HowToPanel.getBackground());
HowToPane.setLocation(0, 10);
HowToPane.setSize(400, 350);
HowToPane.setPreferredSize(new Dimension(400,350));
   HowToPane.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HowToPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 102), 2, true));
        HowToPane.setForeground(new Color(Integer.decode("#622150")));
        HowToPane.setOpaque(false);
        HowToPane.setEditable(false);
HowToPane.setVisible(true);
//HowToPane.setMaximumSize(400,250);

HowToPanel.add(HowToPane,BorderLayout.CENTER);
HowTo.add(HowToPanel,BorderLayout.CENTER);
HowTo.pack();

    }//GEN-LAST:event_jButton_howToPlayActionPerformed

    private void jButton_guessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_guessKeyTyped
        
    }//GEN-LAST:event_jButton_guessKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyTyped

    private void jButton_guessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_guessMouseEntered
        // TODO add your handling code here:
      
        jButton_guess.setBounds(128, 100, 76, 33);
    }//GEN-LAST:event_jButton_guessMouseEntered

    private void jButton_guessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_guessMouseExited
        // TODO add your handling code here:
              jButton_guess.setBounds(130, 100, 71, 30);
            
    }//GEN-LAST:event_jButton_guessMouseExited

    private void jButton_howToPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_howToPlayMouseEntered
        // TODO add your handling code here:
        
        jButton_howToPlay.setBounds(58, 149, 223, 33);
    }//GEN-LAST:event_jButton_howToPlayMouseEntered

    private void jButton_howToPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_howToPlayMouseExited
        // TODO add your handling code here:
 jButton_howToPlay.setBounds(60, 150, 217, 31);
    }//GEN-LAST:event_jButton_howToPlayMouseExited

    private void jButton_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_exitMouseExited
        // TODO add your handling code here:
        jButton_exit.setBounds(100, 203, 123, 31);
    }//GEN-LAST:event_jButton_exitMouseExited

    private void jButton_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_exitMouseEntered
        // TODO add your handling code here:
        jButton_exit.setBounds(98, 201, 128, 33);
    }//GEN-LAST:event_jButton_exitMouseEntered

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode())
        {
            case KeyEvent.VK_DOWN:
            {
           // jButton_guess.requestFocus();
            }
        
        }
                
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jButton_guessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_guessKeyPressed
if(evt.getKeyCode() == KeyEvent.VK_ENTER)
    Play();
    }//GEN-LAST:event_jButton_guessKeyPressed

    
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*         public void run() {
                */ 
                new GuessingGame().setVisible(true);
              

            }
        });

        try{
            
            DataLine.Info datainfo =new DataLine.Info(Clip.class, null);
            
            clip =(Clip)AudioSystem.getLine(datainfo);
            
        
      }catch(Exception e){
        e.printStackTrace();
        }
       
        try{
           Thread.sleep(600);
            URL soundURL = GuessingGame.class.getResource("/Audio/oniku Loop.wav");
             try{
            if(soundURL == null){
                System.err.println("Game play song missing"+soundURL);
            }
            else{
            }
            }catch(Exception e){
            e.printStackTrace();
            }
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
                      

                Thread.sleep(600);
                       clip.open(audioInput);
                       
                       clip.loop(Clip.LOOP_CONTINUOUSLY);
                       
                     
                       
                       
        }catch(Exception e){
        e.printStackTrace();}
       
            
                     clip.start();
            do
            {
            try{
            Thread.sleep(600);
            }catch(Exception e)
            {
            e.printStackTrace();}
            }while(clip.isActive());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_guess;
    private javax.swing.JButton jButton_howToPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private JButton IsEmpty() {
        return null;
         //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the mixer
     */
    public static Mixer getMixer() {
        return mixer;
    }

    /**
     * @param aMixer the mixer to set
     */
    public static void setMixer(Mixer aMixer) {
        mixer = aMixer;
    }
}
