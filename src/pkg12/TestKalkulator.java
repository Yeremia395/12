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
public class TestKalkulator {
    double bil1;
    double bil2;
    double hasil;
    int Operasi;
   
    public void tambah (){
       
        hasil=bil1+bil2;  
       
    }
    public void kurang(){
       
        hasil=bil1-bil2;
      
    }
    public void bagi(){
       
        hasil=bil1/bil2;
      
    }
    public void kali (){
       
        hasil=bil1*bil2;
       
    }
    int Operasi(){
        if(Operasi==1){
            tambah();
        System.out.println("Hasil= "+hasil);}
            else if(Operasi==2){
                    kurang();
            System.out.println("Hasil ="+hasil);}
                else if(Operasi==3){
                    bagi();
                System.out.println("Hasil= "+hasil);}
                    else{
                    kali();
                    System.out.println("Hasil= "+hasil);}
                   
        return Operasi;
                    }
            
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        TestKalkulator kt = new TestKalkulator();
        double hasil , Operasi,bil1,bil2;
       
        //input
        System.out.println("Masukkan Bilangan 1");
        kt.bil1 = input.nextInt();
        System.out.println("Maukkan Bilangan 2");
        kt.bil2 = input.nextInt();
        
       //output
        System.out.println("Pilih Operasi \n=============");
        System.out.println("1.Tambah\n2.Kurang\n3.Bagi\n4.Kali");
        kt.Operasi=input.nextInt();
        kt.Operasi();
    }
}
    

