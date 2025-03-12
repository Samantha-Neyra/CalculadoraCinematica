/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programa;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author Kris
 */
public class ventana4 extends javax.swing.JFrame {

    int x,y;
    private Object content;
    
    public ventana4() {
          initComponents();
         panel.setFocusable(true);
         
        Diapo_1 D1= new Diapo_1();
        MostrarPanel(D1);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        carrito = new javax.swing.JLabel();
        jPanelContent_vent4 = new javax.swing.JPanel();
        Pg_btn_1 = new javax.swing.JButton();
        Pg_btn_2 = new javax.swing.JButton();
        Pg_btn_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        panel.setBackground(new java.awt.Color(18, 102, 126));
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver_64.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setContentAreaFilled(false);
        Regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver_64.png"))); // NOI18N
        Regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver_96.png"))); // NOI18N
        Regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        panel.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 134, 115));

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carrito.png"))); // NOI18N
        panel.add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, 214));

        jPanelContent_vent4.setBackground(new java.awt.Color(204, 255, 204));
        jPanelContent_vent4.setPreferredSize(new java.awt.Dimension(520, 520));

        javax.swing.GroupLayout jPanelContent_vent4Layout = new javax.swing.GroupLayout(jPanelContent_vent4);
        jPanelContent_vent4.setLayout(jPanelContent_vent4Layout);
        jPanelContent_vent4Layout.setHorizontalGroup(
            jPanelContent_vent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanelContent_vent4Layout.setVerticalGroup(
            jPanelContent_vent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        panel.add(jPanelContent_vent4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 1100, 488));
        jPanelContent_vent4.getAccessibleContext().setAccessibleName("");

        Pg_btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/botonSgt_rojoOscuro.png"))); // NOI18N
        Pg_btn_1.setBorderPainted(false);
        Pg_btn_1.setContentAreaFilled(false);
        Pg_btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pg_btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pg_btn_1ActionPerformed(evt);
            }
        });
        panel.add(Pg_btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 90));

        Pg_btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/botonSgt_rojoClaro.png"))); // NOI18N
        Pg_btn_2.setBorderPainted(false);
        Pg_btn_2.setContentAreaFilled(false);
        Pg_btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pg_btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pg_btn_2ActionPerformed(evt);
            }
        });
        panel.add(Pg_btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        Pg_btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/botonSgt_verde.png"))); // NOI18N
        Pg_btn_3.setBorderPainted(false);
        Pg_btn_3.setContentAreaFilled(false);
        Pg_btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pg_btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pg_btn_3ActionPerformed(evt);
            }
        });
        panel.add(Pg_btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
       x=carrito.getX();
       y=carrito.getY();
       System.out.println(carrito.getLocation());
       
       switch(evt.getExtendedKeyCode()){
           
           case KeyEvent.VK_UP:
               if(carrito.getY()>=-5){
                   carrito.setLocation(x,y-7);
               }
               break;
               
               case KeyEvent.VK_DOWN:
                    if(carrito.getY()<=401){
               carrito.setLocation(x,y+7);
                    }
               break;
               
               case KeyEvent.VK_LEFT:
                    if(carrito.getX()>=1){
               carrito.setLocation(x-7,y);
                    }
               break;
               
               case KeyEvent.VK_RIGHT:
                    if(carrito.getX()<=1171){
               carrito.setLocation(x+7,y);
                    }
               break;
       }
    }//GEN-LAST:event_panelKeyPressed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
       Proyecto inicio = new Proyecto();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void Pg_btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pg_btn_1ActionPerformed
         Diapo_1 D1= new Diapo_1();
         MostrarPanel(D1);
    }//GEN-LAST:event_Pg_btn_1ActionPerformed

    private void Pg_btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pg_btn_2ActionPerformed
        Diapo_2 D2= new Diapo_2();
        MostrarPanel(D2 );
    }//GEN-LAST:event_Pg_btn_2ActionPerformed

    private void Pg_btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pg_btn_3ActionPerformed
         Diapo_3 D3= new Diapo_3();
        MostrarPanel(D3);
    }//GEN-LAST:event_Pg_btn_3ActionPerformed

   
    
    
    //CRACION DE NUESTRO METODO PRIVADO
    private void MostrarPanel(JPanel vent4_pg){
    vent4_pg.setSize(1140, 800);
    vent4_pg.setLocation(0, 0);
    jPanelContent_vent4.removeAll();
    jPanelContent_vent4.add(vent4_pg,BorderLayout.CENTER);
    jPanelContent_vent4.revalidate();
    jPanelContent_vent4.repaint();
    
    }
    
   
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
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and displVolverorm */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pg_btn_1;
    private javax.swing.JButton Pg_btn_2;
    private javax.swing.JButton Pg_btn_3;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel carrito;
    private javax.swing.JPanel jPanelContent_vent4;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
