package tugas2;

public class Matematika1Beraksi {

    
    public static void main(String[] args) {
        Matematika1 matematika = new Matematika1 ();
           int pertambahan = matematika.tambah(20,10);
           int pengurangan = matematika.kurang(20, 5);
           int perkalian = matematika.kali(10,3);
           double pembagian = matematika.bagi(21, 2);
           System.out.println("Pertambahan : 20+10 = " + pertambahan);
           System.out.println("pengurangan : 20-5 = " + pengurangan);
           System.out.println("perkalian : 10*3 = " + perkalian);
           System.out.println("pembagian : 21/2 = " + pembagian);

    }
}