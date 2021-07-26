/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keluar;

/**
 *
 * @author Dan
 */
public class Karyawan11 extends Karyawan2 {
    public void setnama(String nama){
   super.nama2=nama;
   
   }
   public void setgender (String Gender){
       super.Gender2=Gender;
   }
   public void cetak(){
       super.id();
   }
   public void officer(){
       System.out.print("Bekerja di bagian = ");
   }
}
