import java.util.Scanner;

public class checkevenoddwithoutmodulo {
    public static void main(String[] args) {
        System.out.println("Enter Number To Check Odd or Even ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
