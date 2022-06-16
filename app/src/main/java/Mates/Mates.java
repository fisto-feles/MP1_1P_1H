package Mates;

public class Mates {
    public static String suma(int n1, int n2) {
        return Integer.toString(n1 + n2);
    }

    public static String resta(int n1, int n2) {
        return Integer.toString(n1 - n2);
    }

    public static String producto(int n1, int n2) {
        return Integer.toString(n1 * n2);
    }

    public static String division(int n1, int n2) {
        if (n2 == 0) {
            return "Error: No se puede dividir entre 0";
        }

        return Double.toString((double) n1 / (double) n2);
    }
}
