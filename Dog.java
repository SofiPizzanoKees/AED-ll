public class Dog  extends Animal {
    
    public Dog (String nombre, int edad) {
        super (nombre, edad);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: guau guau!");
    }
    
    public void correr (){
        System.out.println("Corre felizmente.");
    }
    
}