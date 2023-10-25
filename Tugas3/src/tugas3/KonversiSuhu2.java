package tugas3;

public class KonversiSuhu2 extends KonversiSuhu1 {
    public double fahrenheitToReamur(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius * 4/5;
    }
}