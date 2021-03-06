/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaPresentacion;


import java.awt.BorderLayout;
/**
 *
 * @author dcast
 */
public class pnlGMaquinas extends javax.swing.JPanel {

    /**
     * Creates new form PanelTwo
     */
    public pnlGMaquinas() {
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

        btnAgregarMaquina = new javax.swing.JButton();
        btnBuscarMaquina = new javax.swing.JButton();
        btnEliminarMaquina = new javax.swing.JButton();
        btnListarMaquina = new javax.swing.JButton();
        lblHomeMaq = new javax.swing.JLabel();
        lblFondoMaq = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarMaquina.setBorder(null);
        btnAgregarMaquina.setBorderPainted(false);
        btnAgregarMaquina.setContentAreaFilled(false);
        btnAgregarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMaquinaActionPerformed(evt);
            }
        });
        add(btnAgregarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 40));

        btnBuscarMaquina.setBorder(null);
        btnBuscarMaquina.setBorderPainted(false);
        btnBuscarMaquina.setContentAreaFilled(false);
        btnBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMaquinaActionPerformed(evt);
            }
        });
        add(btnBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 40, 40));

        btnEliminarMaquina.setBorder(null);
        btnEliminarMaquina.setBorderPainted(false);
        btnEliminarMaquina.setContentAreaFilled(false);
        btnEliminarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMaquinaActionPerformed(evt);
            }
        });
        add(btnEliminarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, 40));

        btnListarMaquina.setBorder(null);
        btnListarMaquina.setBorderPainted(false);
        btnListarMaquina.setContentAreaFilled(false);
        btnListarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarMaquinaActionPerformed(evt);
            }
        });
        add(btnListarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 40, 40));
        add(lblHomeMaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 124, 720, 330));

        lblFondoMaq.setBackground(new java.awt.Color(255, 255, 255));
        lblFondoMaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GestionarMaquinas.jpg"))); // NOI18N
        add(lblFondoMaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMaquinaActionPerformed
        pnlAgregarMaquina p1 = new pnlAgregarMaquina();
        p1.setSize(720,330);
        p1.setLocation(-1,2);

        lblHomeMaq.removeAll();
        lblHomeMaq.add(p1,BorderLayout.CENTER);
        lblHomeMaq.revalidate();
        lblHomeMaq.repaint();       
        
        
    }//GEN-LAST:event_btnAgregarMaquinaActionPerformed

    private void btnBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMaquinaActionPerformed
        pnlBuscarMaquina p1 = new pnlBuscarMaquina();
        p1.setSize(720,330);
        p1.setLocation(-1,2);

        lblHomeMaq.removeAll();
        lblHomeMaq.add(p1,BorderLayout.CENTER);
        lblHomeMaq.revalidate();
        lblHomeMaq.repaint();
    }//GEN-LAST:event_btnBuscarMaquinaActionPerformed

    private void btnEliminarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMaquinaActionPerformed
        pnlEliminarMaquina p1 = new pnlEliminarMaquina();
        p1.setSize(720,330);
        p1.setLocation(-1,2);

        lblHomeMaq.removeAll();
        lblHomeMaq.add(p1,BorderLayout.CENTER);
        lblHomeMaq.revalidate();
        lblHomeMaq.repaint();
    }//GEN-LAST:event_btnEliminarMaquinaActionPerformed

    private void btnListarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarMaquinaActionPerformed
        pnlListarMaquina p1 = new pnlListarMaquina();
        p1.setSize(720,330);
        p1.setLocation(-1,2);

        lblHomeMaq.removeAll();
        lblHomeMaq.add(p1,BorderLayout.CENTER);
        lblHomeMaq.revalidate();
        lblHomeMaq.repaint();
    }//GEN-LAST:event_btnListarMaquinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMaquina;
    private javax.swing.JButton btnBuscarMaquina;
    private javax.swing.JButton btnEliminarMaquina;
    private javax.swing.JButton btnListarMaquina;
    private javax.swing.JLabel lblFondoMaq;
    private javax.swing.JLabel lblHomeMaq;
    // End of variables declaration//GEN-END:variables
}
