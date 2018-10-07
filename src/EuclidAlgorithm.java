public class EuclidAlgorithm {
    public static void main(String[] args) {
        System.out.println(algorithmCycle(1680, 0));
        System.out.println(algorithmRec(1680, 0));
    }

    private static int algorithmRec (int a, int b) {
        int gcd = 1;
        if (a == b) {
            gcd = a;
        }
        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a > b) {
            return algorithmRec(a % b, b);
        }
        if (a < b) {
            return algorithmRec(a, b % a);
        }
        return gcd;
    }

    private static int algorithmCycle (int a, int b) {
        while ( a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        return a + b;
    }
}
