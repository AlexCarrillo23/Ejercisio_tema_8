public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setNombre("José Alejandro");
        persona.setEdad(44);
        persona.setTelefono("321-841-3456");
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
}