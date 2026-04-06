package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float p_makan, p_transport, p_belanja;

        // Input data
        System.out.println("=== PROGRAM PERSENTASE PENGELUARAN ===");
        System.out.print("Masukkan biaya Makan     : Rp ");
        makan = input.nextFloat();
        
        System.out.print("Masukkan biaya Transport : Rp ");
        transport = input.nextFloat();
        
        System.out.print("Masukkan biaya Belanja   : Rp ");
        belanja = input.nextFloat();

        // Proses Hitung Total
        total = makan + transport + belanja;

        // Proses Hitung Persentase
        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        // Output Hasil
        System.out.println("\n=== HASIL PERSENTASE ===");
        System.out.println("Total Pengeluaran : Rp " + total);
        System.out.println("Persentase Makan  : " + p_makan + "%");
        System.out.println("Persentase Trans. : " + p_transport + "%");
        System.out.println("Persentase Belanja: " + p_belanja + "%");
        
        input.close();
    }
}