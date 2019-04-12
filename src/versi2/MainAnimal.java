package versi2;

/**
 *
 * @author USER
 */
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck duck = new Duck("Angsa", "lokal");
        Cat cat = new Cat("Si Manis", "Cianjur");
        Dog dog = new Dog("Blacky", "Bandung");
        Spanial spanial = new Spanial("Herder", "Toy", "Bandung");
        
        PetOut[] myAnimal = {duck, cat, dog, spanial};
        for(PetOut animal : myAnimal){
            System.out.println(animal);
            System.out.println("Sound :: ");
            animal.sound();
        }
        
        PetInfo[] animalInfo = {dog, spanial};
        for(PetInfo animal : animalInfo){
            System.out.println(animal);
            animal.info();
        }
    }
    
}
