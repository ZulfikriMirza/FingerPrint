package versi2;

/**
 *
 * @author USER
 */
public class Duck extends NewClass implements PetOut {

    public Duck() {
    }

    public Duck(String nama, String breed) {
        super(nama, breed);
    }
   
    @Override
    public String toString() {
        return "Duck{" + super.toString() +
                ", umur ="+ AGE_DUCK +'}';
    }
    
    @Override
    public void sound() {
        System.out.println("wekk...wekkkk...wekkkkk......");
    }
}
