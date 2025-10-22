public class Fish extends Animal {
    
    public Fish (String nombre, int edad) {
        super (nombre,edad);
    }
    
    @Override
    
    public void hacerSonido () {
        System.out.println("El pez hace burbujas.");
    }
    
    public void nadar () {
        System.out.println("Nada en las plantas.");
    }
} 
