package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String e = t + "";
        int a = 0;
        for (int i = 0; i < e.length(); i++) {
            a = a + t % 10;
            t = t / 10;
        }
        System.out.println(Math.abs(a));
    }
}