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
public class pnlEliminarJuego extends javax.swing.JPanel {

    /**
     * Creates new form pnlEliminarJuego
     */
    public pnlEliminarJuego() {
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

        btnBuscarJuego = new javax.swing.JButton();
        txtIngresarNombre = new javax.swing.JTextField();
        lblEliminarJuego = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarJuego.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarJuego.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        btnBuscarJuego.setForeground(new java.awt.Color(255, 255, 51));
        btnBuscarJuego.setText("Eliminar");
        btnBuscarJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarJuego.setContentAreaFilled(false);
        btnBuscarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnBuscarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, -1));

        txtIngresarNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtIngresarNombre.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        txtIngresarNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtIngresarNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtIngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 23, 170, -1));

        lblEliminarJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarJuego.jpg"))); // NOI18N
        add(lblEliminarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJuego;
    private javax.swing.JLabel lblEliminarJuego;
    private javax.swing.JTextField txtIngresarNombre;
    // End of variables declaration//GEN-END:variables
}
