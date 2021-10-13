/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaAccesoDatos;

/**
 *
 * @author dcast
 */
import java.sql.*;
import java.util.ArrayList;

public class GestorBD {
    static Connection miConexion;
    static Statement miSt;
    static ResultSet miRs;
    
    
    public static void conectar(){
        try{ 
           miConexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "AdminBDCasino", "casino");
           miSt = miConexion.createStatement();            
        }
        catch(SQLException e)
        {
            System.out.println("Error al abrir conexión -> " + e.getMessage());
        }        
    }
    
    public static void desconectar(){
        try{
            miConexion.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error al cerrar conexión -> " + e.getMessage());
        }        
    }
    
    public static int ejecutarDML(String sql){
        try{
            conectar();
            int res = miSt.executeUpdate(sql);
            desconectar();
            return res;
        }
        catch(SQLException e)
        {
            System.out.println("Error al ejecutar DML -> " + e.getMessage());
            return 0;
        } 
    }
    
    public static ArrayList <Object[]> ejecutarSELECT (String sql){
        try{
            conectar();
            ArrayList<Object[]> registros = new ArrayList <>();
            Object[] registro;
            int numCols;
            miRs = miSt.executeQuery(sql);
            numCols = miRs.getMetaData().getColumnCount();
            
            registro = new Object[numCols];
            for(int i=0; i<numCols; i++)
                registro[i] = miRs.getMetaData().getColumnLabel(i+1);
                 
            registros.add(registro);
            
            while( miRs.next() ){
                registro = new Object[numCols];
                for(int i=0; i<numCols; i++)
                    registro[i] = miRs.getObject(i+1);
                registros.add(registro);
            }
            desconectar();
            return registros;                       
        }        
        
        catch(SQLException e){
            System.out.println("Error al ejecutar SELECT -> "+ e.getMessage());
            return null;
        }   
    } 
    
    
    
}
