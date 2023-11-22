/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

import java.util.Scanner;
        
public class LaguAnakAyamTurun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===  Perulangan Menggunakan For ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Tek kotek kotek kotek anak ayam turun  " + i + ", mati satu tinggallah " + (i - 1));
        }
      
        System.out.println("\n===  Perulangan Menggunakan While ===");
        int j = 5;
        while (j >= 1) {
            System.out.println("Tek kotek kotek kotek anak ayam turun   " + j + ", mati satu tinggallah " + (j - 1));
            j--;
        }

        System.out.println("\n===  Perulangan Menggunakan Do-While ===");
        int k = 5;
        do {
            System.out.println("Tek kotek kotek kotek anak ayam turun  " + k + ", mati satu tinggallah " + (k - 1));
            k--;
        } while (k >= 1);
    }
    
}
