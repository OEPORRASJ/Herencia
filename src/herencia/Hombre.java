
package herencia;

public class Hombre extends Humano {
    private String hobbies;

    public Hombre(String nombre, String apellido, int edad, String hobbies) {
        super(nombre, apellido, edad);
        this.hobbies = hobbies;
    }
    
}
