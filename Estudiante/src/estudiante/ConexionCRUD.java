
package estudiante;

import java.sql.*;

public class ConexionCRUD {
    
    // Morena Guadalupe Peña Flores
    public void guardaeRegistros(String tabla, String camposTabla, String valoresCampos) {
        
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try{
            
            String sqlQueryStmt = "INSERT INFO " + tabla + " (" + camposTabla + ") VALUE (" +valoresCampos + "); ";
            
            Statement stmt;
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            
            stmt.close();
            stmt.close();
            System.out.println("Registro guadado correctamente!");
        }catch(Exception e){
            System.out.println(e.getMessage());
                       
        }  
    }
    
    // Morena Guadalupe Peña Flores
    public void actualizarEliminarRegistro(String tabla, String valoresCamposNuevos, String condicion){
        
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try{
            Statement stmt;
            String sqlQueryStmt;
            
            if(valoresCamposNuevos.isEmpty()){
                sqlQueryStmt = "DELETE FROM " + " WHERE " + condicion + ";";
            }else{
              sqlQueryStmt = " UPDATE " +tabla + " SET " + valoresCamposNuevos + " WHERE " + condicion +";";
            }
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            stmt.close();
            stmt.close();
        }catch(SQLException ex) {
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
            
            
        }
    }
    
    //Gerardo Misael Monroy Moza
    
    
}
