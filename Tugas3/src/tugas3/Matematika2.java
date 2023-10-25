package tugas3;

import tugas2.Matematika1;

public class Matematika2 extends Matematika1 {
    public double bagi(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}

