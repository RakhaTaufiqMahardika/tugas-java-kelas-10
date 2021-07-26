/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author SONY
 */
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Konversi Suhu");
        byte celcius = 78;
        int reamur, fahrenheit, kelvin;
        reamur = 4*celcius/5+32;
        fahrenheit = 9*celcius/5+32;
        kelvin = celcius+273;
        System.out.println("75 derajat celcius =" +reamur+ "derajat reamur");
        System.out.println("75 derajat celcius =" +fahrenheit+ "derajat fahrenheit");
        System.out.println("75 derajat celcius =" +kelvin+ "derajat kelvin");
    }
    
}
