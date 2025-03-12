
package programa;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class ventana2 extends javax.swing.JFrame {

   
    public ventana2() {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        vent2_pg1_PosFinal pg1_PosFinal= new vent2_pg1_PosFinal();
        showPanel2(pg1_PosFinal);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Padre_ventana2 = new javax.swing.JPanel();
        jPanel_ColumnaBoton_vent2 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        boton_PosFinal = new javax.swing.JButton();
        boton_VelocidadFinal = new javax.swing.JButton();
        boton_VelocidadInts = new javax.swing.JButton();
        boton_AceleracionMed = new javax.swing.JButton();
        boton_AceleracionInst = new javax.swing.JButton();
        boton_Tiempo = new javax.swing.JButton();
        boton_DistancianSegundo = new javax.swing.JButton();
        jPanelContent_vent2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel_ColumnaBoton_vent2.setBackground(new java.awt.Color(18, 102, 126));
        jPanel_ColumnaBoton_vent2.setPreferredSize(new java.awt.Dimension(380, 800));

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

        boton_PosFinal.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_PosFinal.setForeground(new java.awt.Color(255, 255, 255));
        boton_PosFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Meta_48.png"))); // NOI18N
        boton_PosFinal.setText("Posicion Final");
        boton_PosFinal.setContentAreaFilled(false);
        boton_PosFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_PosFinal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        boton_PosFinal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton_PosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PosFinalActionPerformed(evt);
            }
        });

        boton_VelocidadFinal.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_VelocidadFinal.setForeground(new java.awt.Color(255, 255, 255));
        boton_VelocidadFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limite.png"))); // NOI18N
        boton_VelocidadFinal.setText("Velocidad Final");
        boton_VelocidadFinal.setContentAreaFilled(false);
        boton_VelocidadFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_VelocidadFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VelocidadFinalActionPerformed(evt);
            }
        });

        boton_VelocidadInts.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_VelocidadInts.setForeground(new java.awt.Color(255, 255, 255));
        boton_VelocidadInts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rapido.png"))); // NOI18N
        boton_VelocidadInts.setText("Velocidad Instantanea");
        boton_VelocidadInts.setContentAreaFilled(false);
        boton_VelocidadInts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_VelocidadInts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VelocidadIntsActionPerformed(evt);
            }
        });

        boton_AceleracionMed.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_AceleracionMed.setForeground(new java.awt.Color(255, 255, 255));
        boton_AceleracionMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceleracion_media.png"))); // NOI18N
        boton_AceleracionMed.setText("Aceleracion Media");
        boton_AceleracionMed.setContentAreaFilled(false);
        boton_AceleracionMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_AceleracionMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AceleracionMedActionPerformed(evt);
            }
        });

        boton_AceleracionInst.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_AceleracionInst.setForeground(new java.awt.Color(255, 255, 255));
        boton_AceleracionInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tren-de-alta-velocidad.png"))); // NOI18N
        boton_AceleracionInst.setText("Aceleracion Instantanea");
        boton_AceleracionInst.setContentAreaFilled(false);
        boton_AceleracionInst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_AceleracionInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AceleracionInstActionPerformed(evt);
            }
        });

        boton_Tiempo.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_Tiempo.setForeground(new java.awt.Color(255, 255, 255));
        boton_Tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiempo_48.png"))); // NOI18N
        boton_Tiempo.setText("Tiempo");
        boton_Tiempo.setContentAreaFilled(false);
        boton_Tiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_TiempoActionPerformed(evt);
            }
        });

        boton_DistancianSegundo.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        boton_DistancianSegundo.setForeground(new java.awt.Color(255, 255, 255));
        boton_DistancianSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enesimo.png"))); // NOI18N
        boton_DistancianSegundo.setText("Distancia Enesimo Segundo");
        boton_DistancianSegundo.setContentAreaFilled(false);
        boton_DistancianSegundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_DistancianSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_DistancianSegundoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ColumnaBoton_vent2Layout = new javax.swing.GroupLayout(jPanel_ColumnaBoton_vent2);
        jPanel_ColumnaBoton_vent2.setLayout(jPanel_ColumnaBoton_vent2Layout);
        jPanel_ColumnaBoton_vent2Layout.setHorizontalGroup(
            jPanel_ColumnaBoton_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_ColumnaBoton_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addComponent(boton_DistancianSegundo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
            .addGroup(jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                .addGroup(jPanel_ColumnaBoton_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel_ColumnaBoton_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_AceleracionInst, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_AceleracionMed)
                            .addComponent(boton_Tiempo)))
                    .addGroup(jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(boton_VelocidadInts, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_VelocidadFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(boton_PosFinal)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_ColumnaBoton_vent2Layout.setVerticalGroup(
            jPanel_ColumnaBoton_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ColumnaBoton_vent2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(boton_PosFinal)
                .addGap(50, 50, 50)
                .addComponent(boton_VelocidadFinal)
                .addGap(39, 39, 39)
                .addComponent(boton_VelocidadInts)
                .addGap(46, 46, 46)
                .addComponent(boton_Tiempo)
                .addGap(42, 42, 42)
                .addComponent(boton_AceleracionMed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(boton_AceleracionInst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(boton_DistancianSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanelContent_vent2.setBackground(new java.awt.Color(204, 255, 204));
        jPanelContent_vent2.setPreferredSize(new java.awt.Dimension(1140, 800));

        javax.swing.GroupLayout jPanelContent_vent2Layout = new javax.swing.GroupLayout(jPanelContent_vent2);
        jPanelContent_vent2.setLayout(jPanelContent_vent2Layout);
        jPanelContent_vent2Layout.setHorizontalGroup(
            jPanelContent_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanelContent_vent2Layout.setVerticalGroup(
            jPanelContent_vent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_Padre_ventana2Layout = new javax.swing.GroupLayout(jPanel_Padre_ventana2);
        jPanel_Padre_ventana2.setLayout(jPanel_Padre_ventana2Layout);
        jPanel_Padre_ventana2Layout.setHorizontalGroup(
            jPanel_Padre_ventana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Padre_ventana2Layout.createSequentialGroup()
                .addComponent(jPanel_ColumnaBoton_vent2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent_vent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_Padre_ventana2Layout.setVerticalGroup(
            jPanel_Padre_ventana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Padre_ventana2Layout.createSequentialGroup()
                .addGroup(jPanel_Padre_ventana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelContent_vent2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_ColumnaBoton_vent2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Padre_ventana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Padre_ventana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Proyecto inicio = new Proyecto();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void boton_VelocidadFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VelocidadFinalActionPerformed
        vent2_pg2_VelocidadFinal pg2_VelocidadFinal= new vent2_pg2_VelocidadFinal();
        showPanel2(pg2_VelocidadFinal);
    }//GEN-LAST:event_boton_VelocidadFinalActionPerformed

    private void boton_PosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PosFinalActionPerformed
        vent2_pg1_PosFinal pg1_PosFinal= new vent2_pg1_PosFinal();
        showPanel2(pg1_PosFinal);
    }//GEN-LAST:event_boton_PosFinalActionPerformed

    private void boton_VelocidadIntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VelocidadIntsActionPerformed
        vent2_pg3_VelocidadInst pg3_VelocidadInst= new vent2_pg3_VelocidadInst();
        showPanel2(pg3_VelocidadInst);
    }//GEN-LAST:event_boton_VelocidadIntsActionPerformed

    private void boton_TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_TiempoActionPerformed
        vent2_pg4_Tiempo pg4_Tiempo= new vent2_pg4_Tiempo();
        showPanel2(pg4_Tiempo);
    }//GEN-LAST:event_boton_TiempoActionPerformed

    private void boton_AceleracionMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AceleracionMedActionPerformed
        vent2_pg5_AceleracionMed pg5_AceleracionMed= new vent2_pg5_AceleracionMed();
        showPanel2(pg5_AceleracionMed);
    }//GEN-LAST:event_boton_AceleracionMedActionPerformed

    private void boton_AceleracionInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AceleracionInstActionPerformed
        vent2_pg6_AceleracionInst pg6_AceleracionInst= new vent2_pg6_AceleracionInst();
        showPanel2(pg6_AceleracionInst);
    }//GEN-LAST:event_boton_AceleracionInstActionPerformed

    private void boton_DistancianSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_DistancianSegundoActionPerformed
        vent2_pg7_DistancianSeg pg7_DistancianSeg= new vent2_pg7_DistancianSeg();
        showPanel2(pg7_DistancianSeg);
    }//GEN-LAST:event_boton_DistancianSegundoActionPerformed

    
     private void showPanel2(JPanel vent2_pg){
    vent2_pg.setSize(1140, 800);
    vent2_pg.setLocation(0, 0);
    jPanelContent_vent2.removeAll();
    jPanelContent_vent2.add(vent2_pg,BorderLayout.CENTER);
    jPanelContent_vent2.revalidate();
    jPanelContent_vent2.repaint();
    
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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton boton_AceleracionInst;
    private javax.swing.JButton boton_AceleracionMed;
    private javax.swing.JButton boton_DistancianSegundo;
    private javax.swing.JButton boton_PosFinal;
    private javax.swing.JButton boton_Tiempo;
    private javax.swing.JButton boton_VelocidadFinal;
    private javax.swing.JButton boton_VelocidadInts;
    private javax.swing.JPanel jPanelContent_vent2;
    private javax.swing.JPanel jPanel_ColumnaBoton_vent2;
    private javax.swing.JPanel jPanel_Padre_ventana2;
    // End of variables declaration//GEN-END:variables
}
