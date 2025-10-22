import java.util.ArrayList;

public class Veterinaria {
     private final ArrayList<Animal> animales;

    public Veterinaria() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        animales.add(a);
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();

            switch (a) {
                case Dog dog -> dog.correr();
                case Cat cat -> cat.araniar();
                case Bird bird -> bird.volar();
                case Fish fish -> fish.nadar();
                default -> {
                }
            } 
            System.out.println();

        }
        
    } 
}