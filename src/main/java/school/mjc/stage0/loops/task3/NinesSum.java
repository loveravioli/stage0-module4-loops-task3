package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0) {
            int t = 9;
            int sum = 0;
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                 sum += t;
                 t = t * 10 + 9;
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }
}