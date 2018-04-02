/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Mujer extends Humano{

    public Mujer(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    
    
    public int diferenciaEdad(Humano humano){
        return Math.abs(humano.getEdad() - this.edad);
        
    }
}
