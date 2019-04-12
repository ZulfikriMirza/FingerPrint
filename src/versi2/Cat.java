package versi2;

/**
 *
 * @author USER
 */
public class Cat extends NewClass implements PetOut {

    public Cat() {
    }


    public Cat(String nama, String breed) {
        super(nama, breed);
    }
   
    
    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                ", umur ="+ AGE_CAT +'}';
    }

    @Override
    public void sound() {
        System.out.println("meong...meonggg...meonggggg......");
    }
    
    
}
