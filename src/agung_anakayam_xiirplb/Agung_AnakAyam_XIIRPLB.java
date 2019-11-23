/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agung_anakayam_xiirplb;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL03
 */
public class Agung_AnakAyam_XIIRPLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,turunKe=0;
        
        Scanner asupkeun = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Anak Ayam yang Turun :");
        
        n=asupkeun.nextInt();
        
        System.out.println("Ayo Mulai Bernyanyi");
        System.out.println("");
        
        for(turunKe = n; turunKe > 1; turunKe--){
            System.out.println("Tek Kotek kotek koteeeek..");
            System.out.println("Anak Ayam turun berkoteeeek....");
            System.out.println("Anak Ayam Turun \n"+n); 
            
            n--;//untuk dikurang satu mati satu tinggal n
            
            System.out.println("Mati 1 tinggal \n"+n);
            System.out.println("\n");
        }
        
        System.out.println("Tek Kotek kotek koteeeek..");
        System.out.println("Anak Ayam turun berkoteeeek....");
        System.out.println("Anak Ayam Turun "+n);
        System.out.println("Mati 1 tinggal induknya");
    }
    
}
