package tugas3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu1 konversi = new KonversiSuhu1();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double celcius = 25.0;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);
        double fahrenheitToReamur = konversi2.fahrenheitToReamur(fahrenheit);

        System.out.println("Hasil Konversi Suhu:");
        System.out.println(celcius + " Derajat Celcius       = " + fahrenheit + " Derajat Fahrenheit");
        System.out.println(celcius + " Derajat Celcius       = " + reamur + " Derajat Reamur");
        System.out.println(fahrenheit + " Derajat Fahrenheit    = " + fahrenheitToReamur + " Derajat Reamur");
    }
}
