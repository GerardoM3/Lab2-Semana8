
package estudiante;

import java.sql.SQLException;
import java.util.Scanner;
 //Gerardo Misael Monroy Moza
public class Create {
    Create() throws SQLException{
        Scanner leer = new Scanner(System.in);
        Estudiante est = new Estudiante();
        System.out.println("<< CREAR REGISTRO >>");
        
        System.out.println("Carnet del estudiante: ");
        est.setCarnetEstudiante(leer.nextLine());
        
        System.out.println("Nombre del estudiante: ");
        est.setNombreEstudiante(leer.nextLine());
        
        System.out.println("Apellidos del estudiante: ");
        est.setApellidoEstudiante(leer.nextLine());
        
        System.out.println("Edad del estudiante: ");
        est.setEdadEstudiante(leer.nextLine());
        
        String tabla = "tb_estudiante";
        String camposTabla = "carnet, nombre, apellido, edad";
        String valoresCampos = "'" + est.getCarnetEstudiante() + "','" + est.getNombreEstudiante()+ "','" + est.getApellidoEstudiante()+ "','" + est.getEdadEstudiante() + "'";
        
        ConexionCRUD utilerias = new ConexionCRUD();
        utilerias.guardaeRegistros(tabla, camposTabla, valoresCampos);
        
        MenuPrincipal.desplegarMenu();
    }
}
