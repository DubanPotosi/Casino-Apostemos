/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocios;

import java.util.ArrayList;
import LogicaAccesoDatos.GestorBD;
/**
 *
 * @author dcast
 */
public class Maquina {
    private String serial, juegoInstalado, tipoDinero;
    private long dineroRecaudado, dineroEntregado, utilidad;

    public Maquina(String serial, String juegoInstalado, String tipoDinero, long dineroRecaudado, long dineroEntregado, long utilidad) {
        this.serial = serial;
        this.juegoInstalado = juegoInstalado;
        this.tipoDinero = tipoDinero;
        this.dineroRecaudado = dineroRecaudado;
        this.dineroEntregado = dineroEntregado;
        this.utilidad = utilidad;
    }
    
    public Maquina() {
        this.serial = "";
        this.juegoInstalado = "";
        this.tipoDinero = "";
        this.dineroRecaudado = 0;
        this.dineroEntregado = 0;
        this.utilidad = 0;
    }
    
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getJuegoInstalado() {
        return juegoInstalado;
    }

    public void setJuegoInstalado(String juegoInstalado) {
        this.juegoInstalado = juegoInstalado;
    }

    public String getTipoDinero() {
        return tipoDinero;
    }

    public void setTipoDinero(String tipoDinero) {
        this.tipoDinero = tipoDinero;
    }

    public long getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(long dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public long getDineroEntregado() {
        return dineroEntregado;
    }

    public void setDineroEntregado(long dineroEntregado) {
        this.dineroEntregado = dineroEntregado;
    }

    public long getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(long utilidad) {
        this.utilidad = utilidad;
    }
    
    public int registrar (){        
        String sql = "INSERT INTO Maquina VALUES ('" +serial+ "', '" + juegoInstalado + "', '" + tipoDinero + "', 0, 0, 0)";        
        return GestorBD.ejecutarDML(sql);
    }
    
    public int actualizarDinero(long recaudo, long entrega){
        
        String sql = "UPDATE Maquina SET maqDineroRecaudado = (maqDineroRecaudado+" +recaudo+ "),"
                + " maqDineroEntregado = (maqDineroEntregado+" +entrega+ ")" 
                +" WHERE maqSerial = '" +this.serial+ "'";        
        return GestorBD.ejecutarDML(sql);
    }  
    
    
}
