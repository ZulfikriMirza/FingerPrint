/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versi1;

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
