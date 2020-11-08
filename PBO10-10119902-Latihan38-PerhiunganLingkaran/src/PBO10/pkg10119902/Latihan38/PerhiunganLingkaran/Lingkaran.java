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
 * @author korik
 */
class Lingkaran{
    DecimalFormat decimalformat = new DecimalFormat("#.##");
    public double diameter;
    public double jariJari;
    public double luas;
    public double keliling;
    public final double phi = 3.14;
    public boolean check;
    
    public double hitungJariJari(){
        jariJari = diameter / 2;
        System.out.println("Jari-jari Lingkaran = "+ decimalformat.format(jariJari).replace("." , ",") +" cm");
        return 0;
    }
    public double hitungLuas(){
        luas = phi * jariJari * jariJari;
        System.out.println("Luas Lingkaran = "+ decimalformat.format(luas).replace("." , ",") +" cm");
        return 0;
    }
    public double hitungKeliling(){
        keliling = phi * diameter;
        System.out.println("Keliling lingkaran = "+ decimalformat.format(keliling).replace("." , ",") +" cm");
        return 0;
    }
}
