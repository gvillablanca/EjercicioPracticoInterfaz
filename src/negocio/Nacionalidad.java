package negocio;

public class Nacionalidad {
    String nombre;
    String pais;
    String colorPiel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    @Override
    public String toString() {
        return "Nacionalidad{" 
                + "nombre=" + nombre 
                + ", pais=" + pais 
                + ", colorPiel=" + colorPiel 
                + '}';
    }
}
