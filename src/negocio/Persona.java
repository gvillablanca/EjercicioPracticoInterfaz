package negocio;

public class Persona {
    String nombre;
    String apellido;
    String genero;
    int rut;
    String dv;
    Nacionalidad nacionalidad; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", genero=" + genero 
                + ", rut=" + rut 
                + ", dv=" + dv 
                + ", nacionalidad=" + nacionalidad 
                + '}';
    }
    
    
}
