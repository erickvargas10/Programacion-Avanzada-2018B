package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    
    public static void newCliente(String a, String b, String c,String d,String e,String f,String g)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call newCliente(?,?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
         entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);
         entrada.setString(7, g);
       
        entrada.execute();
    }
    
     public static void EliminarCliente(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarCli(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
        public static void BuscarCliente(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarCli(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
        
 
    
     public static void newProd(String a, String b, String c,String d,String e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call newProducto(?,?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
         entrada.setString(4, d);
        entrada.setString(5, e);  
      
        entrada.execute();
    }
     public static void EliminarProducto(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarProduc(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
        public static void BuscarProducto(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarProduc(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
        
            
     public static void newFactura(String a, String b, String c,String d,String e,String f,String g)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call newVenta(?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
         entrada.setString(4, d);
        entrada.setString(5, e); 
        entrada.setString(6, f);  
         entrada.setString(7, g); 
        entrada.execute();
    }

 

   

    
}
