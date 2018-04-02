
package herencia;


public class Humano {
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    private Humano casadoCon;

    public Humano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    
   
    public void setCasadoCon(Humano casadoCon){
        this.casadoCon = casadoCon;
    }
    
    public static int diferenciaEdad(Humano humano1, Humano humano2){
        return Math.abs(humano1.getEdad() - humano2.getEdad());
    }
    
    public String mostrarInformacion(Humano humano){
        String informacion = null;
        
        if (humano.casadoCon instanceof Mujer) {
            System.out.println("La pareja es Mujer");
        } 
        if (humano.casadoCon instanceof Hombre) {
            System.out.println("La pareja es hombre");
            
        } else{
            System.out.println(informacion);
        }
        informacion = humano.nombre + " " + humano.apellido + " " + humano.edad;
        return informacion;
    }

    
}
