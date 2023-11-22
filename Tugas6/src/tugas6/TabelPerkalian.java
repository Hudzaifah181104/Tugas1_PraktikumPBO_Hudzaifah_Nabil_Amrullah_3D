/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

import java.util.Scanner;

public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (<= 10): ");
        int n = input.nextInt();
        if (n <= 10) {
            Tampilkan(n);
        } else {
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10.");
        }
        input.close();
    }

    public static void Tampilkan(int n) {
        System.out.println("Tabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    
}
