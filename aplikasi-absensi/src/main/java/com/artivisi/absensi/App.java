package com.artivisi.absensi;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	Karyawan.setJumlahKaryawan(15);

        Karyawan k = new Karyawan(); // menjalankan constructor tanpa argumen
        k.setNip("123");
        k.setNama("Endy");
        //k.setJumlahKaryawan(5);

        Karyawan k2 = new Karyawan("456", "Adi", new Date());
        //k2.setNip("456");
        //k2.setNama("Adi");
        //k2.setJumlahKaryawan(7);

        System.out.println("Nama k : "+k.getNama());
        // System.out.println("Jumlah k : "+k.getJumlahKaryawan());
        System.out.println("Nama k2 : "+k2.getNama());
        // System.out.println("Jumlah k2 : "+k2.getJumlahKaryawan());
        System.out.println("Jumlah Karyawan : "+Karyawan.getJumlahKaryawan());
    }
}
