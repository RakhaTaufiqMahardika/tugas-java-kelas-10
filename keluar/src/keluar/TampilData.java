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
public class TampilData {
    public static void main(String[] args) {
        Karyawan1 TampilData = new Karyawan1();
        Admin keluargaji = new Admin();
        TampilData.setnama("Rakha");
        TampilData.setgender("Laki Laki");
        keluargaji.setnomorpegawai(123456);
        TampilData.cetak();
        keluargaji.setnomorpegawai(123456);
        keluargaji.cetak();
        System.out.println(keluargaji.getnomorpegawai());
        keluargaji.keterangan();
        keluargaji.gaji(12000, 100);
        keluargaji.gaji(12000, 100, 2);
        System.out.println("                 ");
        
        Karyawan11 TampilData2 = new Karyawan11();
        Admin2 keluargaji2 = new Admin2();
        TampilData2.setnama("Siti");
        TampilData2.setgender("Perempuan");
        keluargaji2.setnomorpegawai(666666);
        TampilData2.cetak();
        System.out.println(keluargaji2.getnomorpegawai());
        keluargaji2.keterangan();
        keluargaji2.gaji(12000, 100);
        keluargaji2.gaji(12000, 100, 2);
    }
        
}
