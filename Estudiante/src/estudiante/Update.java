
package estudiante;
import java.sql.SQLException;
import java.util.Scanner;
public class Update {
    Update() throws SQLException{
        Scanner leer = new Scanner(System.in);
        Estudiante est = new Estudiante();
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ACTUALIZAR REGISTROS >>");
        
        System.out.println("Ingresar el id del estudiante a modificar: ");
        est.setIdPersona(leer.nextInt());
        
        String tablaBuscar = "tb_estudiante";
        String camposBuscar = "id_estudiante, carnet, nombre, apellido, edad";
        String condicionBuscar = "id_estudiante = " + est.getIdEstudiante();
        utilerias.desplegarRegistros(tablaBuscar, camposBuscar, condicionBuscar);
        
        System.out.println("Nombre del alumno: ");
        est.setNombreEstudiante(leer.next());
        
        System.out.println("Apellidos del estudiante: ");
        est.setApellidoEstudiante();
        
        System.out.println("Edad del estudiante: ");
        est.setEdadEstudiante();
        
        String tabla = "tb_estudiante";
        String camposValoresNuevos
    }
}
