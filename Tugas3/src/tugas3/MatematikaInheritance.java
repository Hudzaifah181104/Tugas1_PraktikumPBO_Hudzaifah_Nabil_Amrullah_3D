/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mat = new Matematika2();

        System.out.println("Hasil Tambah 20 + 10  = " + mat.tambah(20, 10));
        System.out.println("Hasil Kurang 10 - 5 = " + mat.kurang(10, 5));
        System.out.println("Hasil Kali   10 x 3 = " + mat.kali(10, 3));
        System.out.println("Hasil Bagi   21 : 2 = " + mat.bagi(21, 2));
        System.out.println("Hasil Modulus 21 mod 2 = " + mat.modulus(21, 2));
    }
}


