package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Value for the first number?");
        int y = ap.nextInt("Value for the second number?");
        int avg = (x + y) / 2;
        System.out.println(avg);
    }
}
