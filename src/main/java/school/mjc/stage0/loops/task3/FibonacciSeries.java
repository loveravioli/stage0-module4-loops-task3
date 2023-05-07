package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci == 0) {
            System.out.println(0);
        } else if (lastFibonacci == 1) {
            System.out.println(1);
        } else if (lastFibonacci > 1) {
            int n0 = 0;
            int n1 = 1;
            System.out.println(0);
            System.out.println(1);
            for (int i = 2; i < lastFibonacci; i++) {
                int n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
                System.out.println(n2);
            }
        }
    }
}