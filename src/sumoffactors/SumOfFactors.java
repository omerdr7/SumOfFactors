package sumoffactors;

public class SumOfFactors {

    public static int sumFactors(int sayi) {
        int sum = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }

}
