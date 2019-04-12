package versi2;

/**
 *
 * @author USER
 */
public class NewClass {
    private String nama;
    private String breed;

    public NewClass() {
    }

    public NewClass(String nama, String breed) {
        this.nama = nama;
        this.breed = breed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "NewClass{" + "nama=" + nama + ", breed=" + breed + '}';
    }
    
    
}
