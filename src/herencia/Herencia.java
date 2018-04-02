
package herencia;


public class Herencia {

    
    public static void main(String[] args) {
        
        Humano mujer1 = new Mujer("Laura", "Munoz", 20);
        Humano mujer2 = new Mujer("Nikoll", "Sarmiento", 10);
        Humano hombre1 = new Hombre("Nelson", "Porras", 19, "Ciclismo");
        Humano hombre2 = new Hombre("Oscar", "Porras", 21, "Ciclismo");
       
        hombre2.setCasadoCon(mujer1);
        
        
    
        
    }
    
}
