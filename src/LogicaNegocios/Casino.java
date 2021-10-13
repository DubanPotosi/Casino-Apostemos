/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocios;

/**
 *
 * @author dcast
 */
import LogicaAccesoDatos.GestorBD;
import java.util.ArrayList;

public class Casino {
    
    private String nombre;

    public Casino(String nombre) {
        this.nombre = nombre;
    }
    public Casino() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int registrarMaquina(String serial, String juegoInstalado, String tipoDinero){
        Maquina miMaquina = new Maquina(serial, juegoInstalado, tipoDinero, 0, 0, 0);
        return miMaquina.registrar();        
    }
    
    public ArrayList <Object[]> buscarMaquina (String serial){
        String sql = "SELECT maqSerial AS Serial, jueNombre AS Juego, maqTipoDinero AS TipoDinero,"
                + " maqDineroRecaudado AS Recaudo, maqDineroEntregado AS Entrega,"
                + " maqUtilidad AS Utilidad FROM Maquina WHERE maqSerial= '" +serial+ "'";
        return GestorBD.ejecutarSELECT(sql);
    }    
    
    public ArrayList <Object[]> listarMaquinas (){
        String sql = "SELECT maqSerial AS Maquina, jueNombre AS JuegoInstalado, maqTipoDinero AS TipoDinero FROM Maquina";
        return GestorBD.ejecutarSELECT(sql);
    } 
    
    public ArrayList <Object[]> listarMaquinasAll (){
        String sql = "SELECT * FROM Maquina";
        return GestorBD.ejecutarSELECT(sql);
    } 
    
    public ArrayList <Object[]> listarJuegos (){
        String sql = "SELECT jueNombre AS Juego, jueTipo AS TipoJuego, jueFechaAdq AS Adquisicion, jueFechaUltAct AS FechaActualizacion FROM Juego";
        return GestorBD.ejecutarSELECT(sql);
    }    
}
