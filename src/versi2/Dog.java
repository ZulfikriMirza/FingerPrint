package versi2;

/**
 *
 * @author USER
 */
public class Dog extends NewClass implements PetOut, PetInfo {

    public Dog() {
    }

    public Dog(String nama, String breed) {
        super(nama, breed);
    }
    
    
    @Override
    public void sound() {
        System.out.println("gong...gonggg...gonggggg......");
    }

    @Override
    public void info() {
        System.out.println("info dog...");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", umur =" + AGE_DOG + '}';
    }
    
    
    
    
}
