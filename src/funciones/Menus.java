package funciones;

import java.util.ArrayList;
import negocio.Persona;
import ui.GenerarPersona;
import ui.Menu;
import ui.VerPersona;

public class Menus {
    public void menu(){
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setTitle("Menu");
        menu.setResizable(true);
        menu.setLocationRelativeTo(null);
    }
    
    public void menu(ArrayList<Persona> persona){
        Menu menu = new Menu(persona);
        menu.setVisible(true);
        menu.setTitle("Menu");
        menu.setResizable(true);
        menu.setLocationRelativeTo(null);
    }
    
    public void generarPersona(ArrayList<Persona> persona){
        GenerarPersona generarPersona = new GenerarPersona(persona);
        generarPersona.setVisible(true);
        generarPersona.setTitle("Generar Persona");
        generarPersona.setResizable(true);
        generarPersona.setLocationRelativeTo(null);
    }
    
    public void verPersona(ArrayList<Persona> persona){
        VerPersona verPersona = new VerPersona(persona);
        verPersona.setVisible(true);
        verPersona.setTitle("Ver Persona");
        verPersona.setResizable(true);
        verPersona.setLocationRelativeTo(null);
    }
}
