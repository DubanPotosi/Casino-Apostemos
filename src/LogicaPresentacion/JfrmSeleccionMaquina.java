/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaPresentacion;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import LogicaNegocios.Casino;
import javax.swing.JOptionPane;
/**
 *
 * @author dcast
 */
public class JfrmSeleccionMaquina extends javax.swing.JFrame {

    /**
     * Creates new form JfrmSeleccionMaquina
     */
    Casino miCasino;
    
    public JfrmSeleccionMaquina() {
        miCasino = new Casino("BlackJack");
        initComponents();
        listar();
        setLocationRelativeTo(null);
        
    }

    private void listar(){
        ArrayList <Object[]> maquinas;
        Object[] columnas;
        DefaultTableModel datos = new DefaultTableModel();
        tblListaMaquinas.setModel(datos);
        
        maquinas = miCasino.listarMaquinas();
        columnas = maquinas.get(0);
        for(int i=0; i<columnas.length; i++)
            datos.addColumn(columnas[i]);
        
        for(int i=1; i<maquinas.size(); i++)
               datos.addRow(maquinas.get(i));
        
        tblListaMaquinas.setSelectionMode(0);
    }    
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaMaquinas = new javax.swing.JTable();
        lblSeleccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnJugar.png"))); // NOI18N
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 110, 100));

        tblListaMaquinas.setSelectionMode(0);
        tblListaMaquinas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblListaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Maquina (Serial)", "Juego Instalado", "Tipo Dinero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaMaquinas.setSelectionBackground(new java.awt.Color(9, 11, 11));
        jScrollPane2.setViewportView(tblListaMaquinas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 330, 360));

        lblSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SeleccionMaquina.jpg"))); // NOI18N
        lblSeleccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSeleccion.setIconTextGap(0);
        getContentPane().add(lblSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        JfrmJuego juego= new JfrmJuego();;                  
        try {
            int fila = this.tblListaMaquinas.getSelectedRow();
            String serial = tblListaMaquinas.getValueAt(fila, 0).toString();
            //String juegoInstalado = tblListaMaquinas.getValueAt(fila, 1).toString();
            //String tipoDinero = tblListaMaquinas.getValueAt(fila, 2).toString();  
            //juego.setSerial(serial);
            juego.setVisible(true);
            this.dispose();                
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Maquina para Jugar");
        }
        
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmSeleccionMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmSeleccionMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmSeleccionMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmSeleccionMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmSeleccionMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JTable tblListaMaquinas;
    // End of variables declaration//GEN-END:variables
}
