
package Frame;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;


public class PiedraPapelTijera extends javax.swing.JFrame {

   //Declaro las variables que voy a usar
    int con1 = 0;
    int con2 = 0;
    
    
    public PiedraPapelTijera() {
        initComponents();   
        //Desactivo maximizar
        this.setResizable(false);
    }

   
    //Cambio Icono de jframe
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/84663577-iconos-de-piedra-papel-tijeras-ilustración-de-vector-aislado-.jpg"));
        return retValue;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PiedraPapelTijera");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra0000000000000000.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 200, 180, 210);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel000000000000000.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 200, 190, 210);

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tijera0000000000000.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 200, 180, 210);

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 150, 60, 50);

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("0");
        jLabel7.setMaximumSize(new java.awt.Dimension(39, 23));
        jLabel7.setMinimumSize(new java.awt.Dimension(39, 23));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 150, 70, 50);

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PC:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 150, 40, 50);

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usiario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 100, 50);

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 450, 520, 40);

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡A JUGAR!");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 70, 250, 46);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Restablecer");
        jButton4.setActionCommand("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(510, 480, 160, 80);
        jButton4.getAccessibleContext().setAccessibleName("\n");

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/thumb-1920-1153857.png"))); // NOI18N
        jLabel1.setText("Restablecer");
        jLabel1.setToolTipText("Restablecer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-790, 0, 1490, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        int pcJuega = (int) Math.round(Math.random()*2);
        
        if(pcJuega==0){
            jLabel3.setText(" PC eligió Piedra. EMPATE!");
           try {
            new JFXPanel();
            String pon = new File("la-cuchilla_1.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        if(pcJuega==1){
            jLabel3.setText("PC eligió Papel. PC GANA!");
            con2 = con2+1;
             try {
            new JFXPanel();
            String pon = new File("Pierde.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
            
        }
        
        if(pcJuega==2){
            jLabel3.setText("PC eligió Tijera. USTED GANA!");
            con1 = con1+1;
                try {
            new JFXPanel();
            String pon = new File("bites-ta-da-winner.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
        jLabel7.setText(con2+"");
        jLabel9.setText(con1+"");
        
        
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setText("PIEDRA");  
         try {
            new JFXPanel();
            String pon = new File("ES_Suction Pop 3 - SFX Producer.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setText("");            
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setText("PAPEL");
        
         try {
            new JFXPanel();
            String pon = new File("ES_Suction Pop 3 - SFX Producer.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setText("");
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setText("");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setText("TIJERA");
         try {
            new JFXPanel();
            String pon = new File("ES_Suction Pop 3 - SFX Producer.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        int pcJuega = (int) Math.round(Math.random()*2);
        
        if(pcJuega==0){
            jLabel3.setText("PC eligió piedra. USTED GANA!");
            con1 = con1+1;
                try {
            new JFXPanel();
            String pon = new File("bites-ta-da-winner.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        if(pcJuega==1){
            jLabel3.setText("PC eligió Papel. EMPATE!");
              try {
            new JFXPanel();
            String pon = new File("la-cuchilla_1.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        if(pcJuega==2){
            jLabel3.setText("PC eligió Tijera. PC GANA!");
            con2 = con2+1;
             try {
            new JFXPanel();
            String pon = new File("Pierde.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        jLabel7.setText(con2+"");
        jLabel9.setText(con1+"");
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   
        int pcJuega = (int) Math.round(Math.random()*2);
        
        if(pcJuega==0){
            jLabel3.setText("PC eligió Piedra. PC GANA!");
            con2=con2+1;
            try {
            new JFXPanel();
            String pon = new File("Pierde.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        if(pcJuega==1){
            jLabel3.setText("PC eligió Papel. USTED GANA!");
            con1=con1+1;
            try {
            new JFXPanel();
            String pon = new File("bites-ta-da-winner.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        if(pcJuega==2){
            jLabel3.setText("PC eligió Tijera. EMPATE!");
              try {
            new JFXPanel();
            String pon = new File("la-cuchilla_1.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        jLabel7.setText(con2+"");
        jLabel9.setText(con1+"");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        con2 = 0;
        con1 = 0;
        jLabel7.setText(con2+"");
        jLabel9.setText(con1+"");
        jLabel3.setText("");
        try {
            new JFXPanel();
            String pon = new File("ES_Bubble Blip 1 - SFX Producer.mp3").toURI().toString();
            new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PiedraPapelTijera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
