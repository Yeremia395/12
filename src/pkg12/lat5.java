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
public class lat5 {
    public static int tes(int a, int b, int c){
        
   
    int nilaibesar;
    if(a>b && a>c){
        nilaibesar=a;
        
    }else{
        if(b>c){
            nilaibesar=b;
        }else{
            nilaibesar=c;
        }
    }
    return nilaibesar;
}
    public static void main(String[] args){
        int pertama, kedua, ketiga;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan pertama ");
        pertama = s.nextInt();
        
        System.out.println("Masukkan bilangan kedua ");
        kedua = s.nextInt();
        
        System.out.println("Masukkan bilangan ketiga");
        ketiga = s.nextInt();
        
        int x = tes(pertama, kedua, ketiga);
        System.out.println("Bilangan terbesar " +x);
    }
    
}