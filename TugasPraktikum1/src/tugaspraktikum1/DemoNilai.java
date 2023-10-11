/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum1;

/**
 *
 * @author Acer
 */
public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilaiMahasiswa = new Nilai();
        nilaiMahasiswa.NIM = "2210631170073";
        nilaiMahasiswa.Nama = "Hudzaifah Nabil Amrullah";
        nilaiMahasiswa.Absen = 90;
        nilaiMahasiswa.Tugas = 85;
        nilaiMahasiswa.UAS = 80;
        nilaiMahasiswa.UTS = 95;
        nilaiMahasiswa.nilai(nilaiMahasiswa.Absen, nilaiMahasiswa.Tugas, nilaiMahasiswa.UAS, nilaiMahasiswa.UTS);
        nilaiMahasiswa.cetaknilai();
    }
}
