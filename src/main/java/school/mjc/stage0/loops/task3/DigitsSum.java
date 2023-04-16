package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (int i = 0; t!=0; t=t/10) {
            sum = sum + t%10;
        }
        if (sum <0) {
            sum*=(-1);
        }
        System.out.println(sum);
    }
}
