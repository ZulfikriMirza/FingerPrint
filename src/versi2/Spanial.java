package versi2;

/**
 *
 * @author USER
 */
public class Spanial extends Dog {
    private String asal;

    public Spanial() {
    }

    public Spanial(String asal, String nama, String breed) {
        super(nama, breed);
        this.asal = asal;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Override
    public String toString() {
        return "Spanial{" + super.toString() + "asal=" + asal +
                ", umur " + AGE_SPANIE + '}';
    }
    
    
}
