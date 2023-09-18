/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatHitung;

import Interfaces.Operasi;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Kalkulator implements Operasi {
    public int angka1, angka2, operator;
    Scanner input = new Scanner(System.in);
    
    public Kalkulator() {
        System.out.println("Masukan angka ke 1: ");
        angka1 = input.nextInt();
        System.out.println("Masukan angka ke 2: ");
        angka2 = input.nextInt();
        System.out.println("Pilih operasi: \n 1. Penjumlahan \n 2. Pengurangan \n 3. Perkalian \n 4. Pembagian \n 5. Semuanya");
        operator = input.nextInt();
    }
    
    public void hitung() {
        switch (this.operator) {
            case 1 -> System.out.println("Hasil dari "+this.angka1+" + "+this.angka2+" adalah "+this.penjumlahan());
            case 2 -> System.out.println("Hasil dari "+this.angka1+" - "+this.angka2+" adalah "+this.pengurangan());
            case 3 -> System.out.println("Hasil dari "+this.angka1+" x "+this.angka2+" adalah "+this.perkalian());
            case 4 -> System.out.println("Hasil dari "+this.angka1+" : "+this.angka2+" adalah "+this.pembagian());
            case 5 -> System.out.println(
                    "Hasil dari "+this.angka1+" + "+this.angka2+" adalah "+this.penjumlahan()+"\n"+
                    "Hasil dari "+this.angka1+" - "+this.angka2+" adalah "+this.pengurangan()+"\n"+
                    "Hasil dari "+this.angka1+" x "+this.angka2+" adalah "+this.perkalian()+"\n"+
                    "Hasil dari "+this.angka1+" : "+this.angka2+" adalah "+this.pembagian());
            default -> System.out.println("Operator tidak valid atau tidak ada");
        }
    }
    
    @Override
    public int penjumlahan() {
        return this.angka1 + this.angka2;
    }
    
    @Override
    public int pengurangan() {
        return this.angka1 - this.angka2;
    }
    
    @Override
    public int perkalian() {
        return this.angka1 * this.angka2;
    }
    
    @Override
    public int pembagian() {
        return this.angka1 / this.angka2;
    }
}
