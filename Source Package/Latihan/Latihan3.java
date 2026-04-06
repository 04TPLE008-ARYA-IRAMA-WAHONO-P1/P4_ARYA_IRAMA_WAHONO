package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double makan, transport, belanja;
        double totalSebelumDiskon, diskon, totalSetelahDiskon;

        System.out.println("=== PROGRAM DISKON PENGELUARAN MAHASISWA ===");
        System.out.print("Masukkan pengeluaran Makan     : Rp ");
        makan = input.nextDouble();
        
        System.out.print("Masukkan pengeluaran Transport : Rp ");
        transport = input.nextDouble();
        
        System.out.print("Masukkan pengeluaran Belanja   : Rp ");
        belanja = input.nextDouble();

        totalSebelumDiskon = makan + transport + belanja;

        diskon = totalSebelumDiskon * 0.10; // 10% = 10/100 = 0.10

        totalSetelahDiskon = totalSebelumDiskon - diskon;

        // Tampilkan hasil
        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Total Sebelum Diskon : Rp " + totalSebelumDiskon);
        System.out.println("Besar Diskon (10%)   : Rp " + diskon);
        System.out.println("Total Setelah Diskon : Rp " + totalSetelahDiskon);
        
        input.close();
    }
}