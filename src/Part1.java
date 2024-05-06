//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Part1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(sum1toN(5));
        System.out.println(power(3, 3));
    }
    public static int sum1toN(int n) {
       if (n == 1) {
           return 1;
       } else {
           return n + sum1toN(n - 1);
       }
    }
    public static double power (double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}