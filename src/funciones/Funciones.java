package funciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Nacionalidad;
import negocio.Persona;

public class Funciones {
    public static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} 
        catch (NumberFormatException e){
            System.out.println("INGRESE VALOR NUMERICO...");
            return false;
	}
    }
    
    public static void crearPersona(ArrayList<Persona> persona, String nombre, String apellido, String genero,
           String rut, String dv, String nacionalidad, String colorPiel, String pais){
           Persona p = new Persona();
           Nacionalidad n = new Nacionalidad();
           
           p.setNombre(nombre);
           p.setApellido(apellido);
           p.setGenero(genero);
           if(Funciones.isNumeric(rut)){
               p.setRut(Integer.parseInt(rut));
           }else{
               JOptionPane.showMessageDialog(null, "ingrese rut numerico", "validacion", JOptionPane.ERROR);
           }
           p.setDv(dv);
           n.setColorPiel(colorPiel);
           n.setNombre(nacionalidad);
           n.setPais(pais);
           p.setNacionalidad(n);
           persona.add(p);
    }
}
