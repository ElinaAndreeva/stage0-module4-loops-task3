package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int n = String.valueOf(lengthOfLastNumber).length();
        int sum = 0;
        int counter = 0;
        while(counter < n) {
        for (int i = 0; i<=counter; i++) {
           sum+=Math.pow(10, i) * 9;
        }
        counter++; }
        System.out.println(sum);
    }
}
