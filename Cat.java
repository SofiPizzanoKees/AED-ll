public class Cat extends Animal {
    
    public Cat (String nombre, int edad) {
        super (nombre, edad);
    }
    
    @Override
    
    public void hacerSonido() {
        System.out.println("El gato maulla: miau miau!");
    }
    
    public void araniar () {
        System.out.println("Arania el sillon.");
    }
}
