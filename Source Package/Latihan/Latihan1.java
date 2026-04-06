package Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        // S1: Statement Perintah (Input Data)
        System.out.println("=== PROGRAM MENGHITUNG NILAI AKHIR ===");
        System.out.print("Masukkan realisasi pertemuan: ");
        realisasi = input.nextFloat();
        
        System.out.print("Masukkan kehadiran mahasiswa: ");
        kehadiran = input.nextFloat(); 
        
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextFloat();     
        
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextFloat();       
        
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextFloat();       

        // P1: Proses Perhitungan
        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = (tugas * 20) / 100;
        b_uts = (uts * 30) / 100;
        b_uas = (uas * 40) / 100;
        
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        // S2: Statement Informasi (Menampilkan Output)
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Realisasi  : " + realisasi);
        System.out.println("Kehadiran  : " + kehadiran + " (Bobot: " + b_kehadiran + ")");
        System.out.println("Tugas      : " + tugas + " (Bobot: " + b_tugas + ")");
        System.out.println("UTS        : " + uts + " (Bobot: " + b_uts + ")");
        System.out.println("UAS        : " + uas + " (Bobot: " + b_uas + ")");
        System.out.println("---------------------------------");
        System.out.println("Total Nilai: " + total);
        
        input.close();
    }
}