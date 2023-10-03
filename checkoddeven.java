import java.util.Scanner;

public class checkoddeven {
    public static void main(String[] args) {
        System.out.println("Enter The Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        } else if (n == 1 ) {
            System.out.println(" 1 is not even or odd ");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
