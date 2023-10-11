/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum1;

/**
 *
 * @author Acer
 */
public class Nilai {
    String NIM;
    String Nama;
    float Absen;
    float Tugas;
    float UTS;
    float UAS;

    float nilai(float Absen, float Tugas, float UTS, float UAS)
    {
        return (Absen * 10 / 100) + (Tugas * 20 / 100) + (UTS * 30 / 100) + (UAS * 40 / 100);
    }
    void cetaknilai() {
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Nilai Absen = " + Absen);
        System.out.println("Nilai Tugas = " + Tugas);
        System.out.println("Nilai UTS = " + UTS);
        System.out.println("Nilai UAS = " + UAS);
        System.out.println("Nilai Nilai Akhir = " + nilai(Absen,Tugas,UTS,UAS));
    }
}
