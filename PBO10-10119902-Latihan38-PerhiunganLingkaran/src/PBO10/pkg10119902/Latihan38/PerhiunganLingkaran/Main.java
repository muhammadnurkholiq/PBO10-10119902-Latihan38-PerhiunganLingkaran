/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10.pkg10119902.Latihan38.PerhiunganLingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Program Perhitungan Lingkaran
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        
        System.out.println("======Perhitungan Lingkaran====");
        System.out.println("Masukkan nilai diameter lingkaran : ");
        while(true) 
        {
            try {
                l.diameter = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
            }
        }
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        l.hitungJariJari();
        l.hitungLuas();
        l.hitungKeliling();
    }
}