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
public class pnlAgregarJuego extends javax.swing.JPanel {

    /**
     * Creates new form pnlAgregarJuego
     */
    public pnlAgregarJuego() {
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

        btnGuardarJuego = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cmbTipoJuego = new javax.swing.JComboBox<>();
        txtFechaAdq = new javax.swing.JTextField();
        txtFechaAct = new javax.swing.JTextField();
        lblAgregarJuego = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarJuego.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarJuego.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        btnGuardarJuego.setForeground(new java.awt.Color(255, 255, 51));
        btnGuardarJuego.setText("Guardar");
        btnGuardarJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarJuego.setContentAreaFilled(false);
        btnGuardarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnGuardarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, -1));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 20));

        cmbTipoJuego.setBackground(new java.awt.Color(51, 51, 51));
        cmbTipoJuego.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        cmbTipoJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azar", "Habilidad", "Azar y Habilidad" }));
        cmbTipoJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbTipoJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cmbTipoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 120, -1));

        txtFechaAdq.setBackground(new java.awt.Color(51, 51, 51));
        txtFechaAdq.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtFechaAdq.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaAdq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtFechaAdq, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, 20));

        txtFechaAct.setBackground(new java.awt.Color(51, 51, 51));
        txtFechaAct.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtFechaAct.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaAct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtFechaAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, 20));

        lblAgregarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarJuego.jpg"))); // NOI18N
        add(lblAgregarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarJuego;
    private javax.swing.JComboBox<String> cmbTipoJuego;
    private javax.swing.JLabel lblAgregarJuego;
    private javax.swing.JTextField txtFechaAct;
    private javax.swing.JTextField txtFechaAdq;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
