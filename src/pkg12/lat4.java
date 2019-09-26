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
public class lat4 {
    public static void hitung(int a, int b)
    {
        System.out.println("Kecepatan :" + (a/b) + "KM/JAM");
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Jarak ");
        int jarak = s.nextInt();
        System.out.print("Waktu ");
        int waktu = s.nextInt();
        
        hitung(jarak, waktu);
        
  
    }
}