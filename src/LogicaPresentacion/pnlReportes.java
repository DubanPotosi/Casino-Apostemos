/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaPresentacion;

/**
 *
 * @author dcast
 */
public class pnlReportes extends javax.swing.JPanel {

    /**
     * Creates new form pnlReportes
     */
    public pnlReportes() {
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

        jButton2 = new javax.swing.JButton();
        txtFechaRep = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        btnGenerarReporte = new javax.swing.JButton();
        lblHomeRep = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 0));
        jButton2.setText("Gestionar Reportes");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        txtFechaRep.setBackground(new java.awt.Color(51, 51, 51));
        txtFechaRep.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtFechaRep.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaRep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtFechaRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, -1));

        txtIdentificacion.setBackground(new java.awt.Color(51, 51, 51));
        txtIdentificacion.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, -1));

        btnGenerarReporte.setBackground(new java.awt.Color(51, 51, 51));
        btnGenerarReporte.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        btnGenerarReporte.setForeground(new java.awt.Color(255, 255, 51));
        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 140, 30));

        lblHomeRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GenerarReporte.jpg"))); // NOI18N
        add(lblHomeRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 124, 720, 330));

        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Panel.jpg"))); // NOI18N
        add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblHomeRep;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JTextField txtFechaRep;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
