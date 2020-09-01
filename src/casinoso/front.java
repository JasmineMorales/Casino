package casinoso;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;


public class front extends javax.swing.JFrame {
    public boolean es1 = true;
    public boolean es2 = true;
    public boolean es3 = true;
    public int cont=0;
    public int var1;
    public int var2;
    public int var3;
    
    @Override
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagenes/ico.png"));
  return retValue;
}
    
    public front() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon sunflo = new ImageIcon(getClass().getResource("/imagenes/sunflower.png"));
        ImageIcon icon1 = new ImageIcon(sunflo.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon lanzagui = new ImageIcon(getClass().getResource("/imagenes/Lanzagisantes.png"));
        ImageIcon icon2 = new ImageIcon(lanzagui.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon walnut = new ImageIcon(getClass().getResource("/imagenes/walnut.png"));
        ImageIcon icon3 = new ImageIcon(walnut.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        String nombreSonido = "Audios/mp3.wav";
        try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido.");
       }       
               
        jLabel2.setIcon(icon1);        
        jLabel3.setIcon(icon2);        
        jLabel4.setIcon(icon3); 
             
            
    }
        
    public class Hilo1 extends Thread {
        ImageIcon sunflo = new ImageIcon(getClass().getResource("/imagenes/sunflower.png"));
        ImageIcon icon1 = new ImageIcon(sunflo.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon lanzagui = new ImageIcon(getClass().getResource("/imagenes/Lanzagisantes.png"));
        ImageIcon icon2 = new ImageIcon(lanzagui.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon walnut = new ImageIcon(getClass().getResource("/imagenes/walnut.png"));
        ImageIcon icon3 = new ImageIcon(walnut.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        
        public void run(){
            while(es1 == true)
            {
                jLabel2.setIcon(icon2);
                var1=2;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel2.setIcon(icon3);
                var1=3;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel2.setIcon(icon1);
                var1=1;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public class Hilo2 extends Thread {
        ImageIcon sunflo = new ImageIcon(getClass().getResource("/imagenes/sunflower.png"));
        ImageIcon icon1 = new ImageIcon(sunflo.getImage().getScaledInstance(jLabel3.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon lanzagui = new ImageIcon(getClass().getResource("/imagenes/Lanzagisantes.png"));
        ImageIcon icon2 = new ImageIcon(lanzagui.getImage().getScaledInstance(jLabel3.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon walnut = new ImageIcon(getClass().getResource("/imagenes/walnut.png"));
        ImageIcon icon3 = new ImageIcon(walnut.getImage().getScaledInstance(jLabel3.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        
        public void run(){
            while(es2 == true)
            {
                jLabel3.setIcon(icon3);
                var2=3;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel3.setIcon(icon1);
                var2=2;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel3.setIcon(icon2);
                var2=1;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public class Hilo3 extends Thread {
        ImageIcon sunflo = new ImageIcon(getClass().getResource("/imagenes/sunflower.png"));
        ImageIcon icon1 = new ImageIcon(sunflo.getImage().getScaledInstance(jLabel4.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon lanzagui = new ImageIcon(getClass().getResource("/imagenes/Lanzagisantes.png"));
        ImageIcon icon2 = new ImageIcon(lanzagui.getImage().getScaledInstance(jLabel4.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon walnut = new ImageIcon(getClass().getResource("/imagenes/walnut.png"));
        ImageIcon icon3 = new ImageIcon(walnut.getImage().getScaledInstance(jLabel4.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        
        public void run(){
            while(es3 == true)
            {
                jLabel4.setIcon(icon1);
                var3=2;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel4.setIcon(icon2);
                var3=1;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel4.setIcon(icon3);
                var3=3;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Parar1 = new javax.swing.JButton();
        Parar2 = new javax.swing.JButton();
        Parar3 = new javax.swing.JButton();
        PararTodos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        NuevoJuego = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Repetir = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plantas vs Zombies Casino!");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 90));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, 90));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel8.setText("    PARAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 80, 40));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 70, 90));

        Parar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botón1.png"))); // NOI18N
        Parar1.setBorderPainted(false);
        Parar1.setContentAreaFilled(false);
        Parar1.setFocusPainted(false);
        Parar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Parar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, 120));

        Parar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parar2.png"))); // NOI18N
        Parar2.setBorderPainted(false);
        Parar2.setContentAreaFilled(false);
        Parar2.setFocusPainted(false);
        Parar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Parar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 100, 110));

        Parar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parar3.png"))); // NOI18N
        Parar3.setBorderPainted(false);
        Parar3.setContentAreaFilled(false);
        Parar3.setFocusPainted(false);
        Parar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Parar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 280, 90, 100));

        PararTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lechuga.png"))); // NOI18N
        PararTodos.setBorderPainted(false);
        PararTodos.setContentAreaFilled(false);
        PararTodos.setFocusPainted(false);
        PararTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararTodosActionPerformed(evt);
            }
        });
        getContentPane().add(PararTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 80, 90));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel7.setText("NUEVO JUEGO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 80, 40));

        NuevoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jalapeño.png"))); // NOI18N
        NuevoJuego.setBorderPainted(false);
        NuevoJuego.setContentAreaFilled(false);
        NuevoJuego.setFocusPainted(false);
        NuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 80, 120));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel9.setText("PARAR TODOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 90, 40));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel10.setText("   PARAR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 70, 40));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 67, 30, 10));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel11.setText("    PARAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cont.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        Repetir.setText("reiniciar");
        Repetir.setBorderPainted(false);
        Repetir.setContentAreaFilled(false);
        Repetir.setEnabled(false);
        Repetir.setFocusPainted(false);
        Repetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepetirActionPerformed(evt);
            }
        });
        getContentPane().add(Repetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, 30));

        Menu.setBorderPainted(false);
        Menu.setContentAreaFilled(false);
        Menu.setFocusPainted(false);
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 100, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Parar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parar3ActionPerformed
       es3 = false;
       if(es2==false && es1==false)
        {
            if(var1==var2 && var2==var3)
            {
                cont= cont+1;
                jLabel6.setText(Integer.toString(cont));
            }
        }
       ImageIcon pres = new ImageIcon(getClass().getResource("/imagenes/Selec3.png"));
       Parar3.setIcon(pres);       
       jLabel11.setText("");
    }//GEN-LAST:event_Parar3ActionPerformed

    private void PararTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararTodosActionPerformed
        es1=false;              
        es2=false;              
        es3=false;
        if(jLabel1.getIcon() == jLabel2.getIcon() && jLabel2.getIcon() == jLabel3.getIcon())
        {
            cont= cont+1;           
            jLabel6.setText(Integer.toString(cont));
        }
        ImageIcon pres = new ImageIcon(getClass().getResource("/imagenes/boton1pres.png"));
        Parar1.setIcon(pres);  
        ImageIcon pres2 = new ImageIcon(getClass().getResource("/imagenes/Selec2.png"));
        Parar2.setIcon(pres2); 
        ImageIcon pres3 = new ImageIcon(getClass().getResource("/imagenes/Selec3.png"));
        Parar3.setIcon(pres3);
        jLabel11.setText("");
        jLabel10.setText("");
        jLabel8.setText("");
    }//GEN-LAST:event_PararTodosActionPerformed
        
    
    
    private void NuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoJuegoActionPerformed
       es1=true;
       es2=true;
       es3=true;
       jLabel10.setText("   PARAR");
       jLabel8.setText("   PARAR");
       jLabel11.setText("   PARAR");
       ImageIcon pres = new ImageIcon(getClass().getResource("/imagenes/botón1.png"));
       Parar1.setIcon(pres);
       ImageIcon pres2 = new ImageIcon(getClass().getResource("/imagenes/Parar2.png"));
       Parar2.setIcon(pres2);
       ImageIcon pres3 = new ImageIcon(getClass().getResource("/imagenes/Parar3.png"));
       Parar3.setIcon(pres3);
       Hilo1 h1 = new Hilo1();
       Hilo2 h2 = new Hilo2();
       Hilo3 h3 = new Hilo3();
       h1.start();
       h2.start();
       h3.start();
    }//GEN-LAST:event_NuevoJuegoActionPerformed

    private void Parar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parar1ActionPerformed
        es1 = false;
        if(es2==false && es3==false)
        {
            if(var1==var2 && var2==var3)
            {
                cont= cont+1;
                jLabel6.setText(Integer.toString(cont));
            }
        }
        jLabel10.setText("");
        ImageIcon pres = new ImageIcon(getClass().getResource("/imagenes/boton1pres.png"));
        Parar1.setIcon(pres);        
    }//GEN-LAST:event_Parar1ActionPerformed

    private void Parar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parar2ActionPerformed
        es2= false;
        if(es1==false && es3==false)
        {
            if(var1==var2 && var2==var3)
            {
                cont= cont+1;
                jLabel6.setText(Integer.toString(cont));
            }
        }
        ImageIcon pres = new ImageIcon(getClass().getResource("/imagenes/Selec2.png"));
        Parar2.setIcon(pres);        
        jLabel8.setText("");
    }//GEN-LAST:event_Parar2ActionPerformed

    private void RepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepetirActionPerformed
        es1=true;
        es2=true;
        es3=true;
    }//GEN-LAST:event_RepetirActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        menu m = new menu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton NuevoJuego;
    private javax.swing.JButton Parar1;
    private javax.swing.JButton Parar2;
    private javax.swing.JButton Parar3;
    private javax.swing.JButton PararTodos;
    private javax.swing.JButton Repetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
