public class Bird extends Animal {
    
    public Bird (String nombre, int edad) {
        super (nombre, edad);
    }
    
    @Override
    public void hacerSonido () {
        System.out.println("El pajaro canta: pio pio!");
    }
    
    public void volar() {
        System.out.println("Vuela sobre la jaula.");
    }
    
}