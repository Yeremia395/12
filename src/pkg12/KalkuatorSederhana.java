/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

import java.util.Scanner;

/**
 *
 * @author Yeremia Rizky
 */
public class KalkuatorSederhana {
    public static void main(String[] args){
     
     System.out.println("=>Kalkulator Sederhana<=");
     System.out.println("Hasil Penjumlahan " +jumlah(1,6));
     System.out.println("Hasil Pengurangan " +kurang(4,2));
     System.out.println("Hasil Perkalian " +kali(10,6));
     System.out.println("Hasil Pembagian " +bagi(10,2));
     System.out.println("Hasil Sisa Hasil Bagi " +shb(10,4));
     
    }
    
    
    public static double jumlah(int a, int b){
        int hasil = a+b;
        return hasil;
    }
    
    public static double kurang(int a, int b){
        int hasil = a-b;
        return hasil;
    }
    
    public static double kali(int a, int b){
        int hasil = a*b;
        return hasil;
    }
    
    public static double bagi(int a, int b){
        int hasil = a/b;
        return hasil;
    }
    
    public static double shb(int a, int b){
        
        if (a>b){
            int hasil = a%b;
            return hasil;
        }else if (a<b){
            
        }
        return 0;
    }
        
    
}
    


        
    
    
    
 
     
       
 


 

       
       
       
    
    
       
    
