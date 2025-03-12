
package programa;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ventana1 extends javax.swing.JFrame {


    public ventana1() {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        vent1_pg1_PosFinal pg1_PosFinal= new vent1_pg1_PosFinal();
        showPanel(pg1_PosFinal);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Padre_ventana1 = new javax.swing.JPanel();
        jPanel_ColumnaBoton_vent1 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        boton_PosFinal = new javax.swing.JButton();
        boton_Tiempo = new javax.swing.JButton();
        boton_tAlcance = new javax.swing.JButton();
        boton_tEncuentro = new javax.swing.JButton();
        boton_VelocidadMed = new javax.swing.JButton();
        jPanelContent_vent1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel_ColumnaBoton_vent1.setBackground(new java.awt.Color(18, 102, 126));
        jPanel_ColumnaBoton_vent1.setPreferredSize(new java.awt.Dimension(380, 800));

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

        boton_PosFinal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boton_PosFinal.setForeground(new java.awt.Color(255, 255, 255));
        boton_PosFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Posicion_32.png"))); // NOI18N
        boton_PosFinal.setText("Posicion Final");
        boton_PosFinal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        boton_PosFinal.setBorderPainted(false);
        boton_PosFinal.setContentAreaFilled(false);
        boton_PosFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_PosFinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_PosFinal.setIconTextGap(15);
        boton_PosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PosFinalActionPerformed(evt);
            }
        });

        boton_Tiempo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton_Tiempo.setForeground(new java.awt.Color(255, 255, 255));
        boton_Tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Tiempo_32.png"))); // NOI18N
        boton_Tiempo.setText("Tiempo");
        boton_Tiempo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        boton_Tiempo.setBorderPainted(false);
        boton_Tiempo.setContentAreaFilled(false);
        boton_Tiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Tiempo.setIconTextGap(30);
        boton_Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_TiempoActionPerformed(evt);
            }
        });

        boton_tAlcance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton_tAlcance.setForeground(new java.awt.Color(255, 255, 255));
        boton_tAlcance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/TiempoAlcance_32.png"))); // NOI18N
        boton_tAlcance.setText("Tiempo de Alcance");
        boton_tAlcance.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        boton_tAlcance.setBorderPainted(false);
        boton_tAlcance.setContentAreaFilled(false);
        boton_tAlcance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_tAlcance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_tAlcance.setIconTextGap(30);
        boton_tAlcance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tAlcanceActionPerformed(evt);
            }
        });

        boton_tEncuentro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton_tEncuentro.setForeground(new java.awt.Color(255, 255, 255));
        boton_tEncuentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/TiempoEncuentro_32.png"))); // NOI18N
        boton_tEncuentro.setText("Tiempo de Encuentro");
        boton_tEncuentro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        boton_tEncuentro.setBorderPainted(false);
        boton_tEncuentro.setContentAreaFilled(false);
        boton_tEncuentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_tEncuentro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_tEncuentro.setIconTextGap(30);
        boton_tEncuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tEncuentroActionPerformed(evt);
            }
        });

        boton_VelocidadMed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton_VelocidadMed.setForeground(new java.awt.Color(255, 255, 255));
        boton_VelocidadMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/velocidadMedia_32.png"))); // NOI18N
        boton_VelocidadMed.setText("Velocidad Media");
        boton_VelocidadMed.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        boton_VelocidadMed.setBorderPainted(false);
        boton_VelocidadMed.setContentAreaFilled(false);
        boton_VelocidadMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_VelocidadMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_VelocidadMed.setIconTextGap(30);
        boton_VelocidadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VelocidadMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ColumnaBoton_vent1Layout = new javax.swing.GroupLayout(jPanel_ColumnaBoton_vent1);
        jPanel_ColumnaBoton_vent1.setLayout(jPanel_ColumnaBoton_vent1Layout);
        jPanel_ColumnaBoton_vent1Layout.setHorizontalGroup(
            jPanel_ColumnaBoton_vent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ColumnaBoton_vent1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_ColumnaBoton_vent1Layout.createSequentialGroup()
                .addGroup(jPanel_ColumnaBoton_vent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_PosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_VelocidadMed, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_tAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_tEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_ColumnaBoton_vent1Layout.setVerticalGroup(
            jPanel_ColumnaBoton_vent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ColumnaBoton_vent1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(boton_PosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(boton_VelocidadMed, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(boton_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(boton_tAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(boton_tEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanelContent_vent1.setBackground(new java.awt.Color(26, 160, 179));

        javax.swing.GroupLayout jPanelContent_vent1Layout = new javax.swing.GroupLayout(jPanelContent_vent1);
        jPanelContent_vent1.setLayout(jPanelContent_vent1Layout);
        jPanelContent_vent1Layout.setHorizontalGroup(
            jPanelContent_vent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
        );
        jPanelContent_vent1Layout.setVerticalGroup(
            jPanelContent_vent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_Padre_ventana1Layout = new javax.swing.GroupLayout(jPanel_Padre_ventana1);
        jPanel_Padre_ventana1.setLayout(jPanel_Padre_ventana1Layout);
        jPanel_Padre_ventana1Layout.setHorizontalGroup(
            jPanel_Padre_ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Padre_ventana1Layout.createSequentialGroup()
                .addComponent(jPanel_ColumnaBoton_vent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContent_vent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Padre_ventana1Layout.setVerticalGroup(
            jPanel_Padre_ventana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ColumnaBoton_vent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContent_vent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Padre_ventana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Padre_ventana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Proyecto inicio = new Proyecto();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void boton_PosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PosFinalActionPerformed
        vent1_pg1_PosFinal pg1_PosFinal= new vent1_pg1_PosFinal();
        showPanel(pg1_PosFinal);
    }//GEN-LAST:event_boton_PosFinalActionPerformed

    private void boton_TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_TiempoActionPerformed
        vent1_pg3_Tiempo pg4_Tiempo = new vent1_pg3_Tiempo();
        showPanel(pg4_Tiempo);
    }//GEN-LAST:event_boton_TiempoActionPerformed

    private void boton_tAlcanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tAlcanceActionPerformed
        vent1_pg4_tAlcance pg5_tAlcance= new vent1_pg4_tAlcance();
        showPanel(pg5_tAlcance);
    }//GEN-LAST:event_boton_tAlcanceActionPerformed

    private void boton_tEncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tEncuentroActionPerformed
        vent1_pg5_tEncuentro pg6_tEncuentro= new vent1_pg5_tEncuentro();
        showPanel(pg6_tEncuentro);
    }//GEN-LAST:event_boton_tEncuentroActionPerformed

    private void boton_VelocidadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VelocidadMedActionPerformed
        vent1_pg2_VelocidadMed pg2_VelocidadMed= new vent1_pg2_VelocidadMed();
        showPanel(pg2_VelocidadMed);
    }//GEN-LAST:event_boton_VelocidadMedActionPerformed

    
    //CRACION DE NUESTRO METODO PRIVADO DE VENTANA 1
    private void showPanel(JPanel vent1_pg){
    vent1_pg.setSize(1140, 800);
    vent1_pg.setLocation(0, 0);
    jPanelContent_vent1.removeAll();
    jPanelContent_vent1.add(vent1_pg,BorderLayout.CENTER);
    jPanelContent_vent1.revalidate();
    jPanelContent_vent1.repaint();
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton boton_PosFinal;
    private javax.swing.JButton boton_Tiempo;
    private javax.swing.JButton boton_VelocidadMed;
    private javax.swing.JButton boton_tAlcance;
    private javax.swing.JButton boton_tEncuentro;
    private javax.swing.JPanel jPanelContent_vent1;
    private javax.swing.JPanel jPanel_ColumnaBoton_vent1;
    private javax.swing.JPanel jPanel_Padre_ventana1;
    // End of variables declaration//GEN-END:variables
}
