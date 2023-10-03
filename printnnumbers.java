import java.util.Scanner;

public class printnnumbers {
    public static void main(String[] args) {
        System.out.println("Enter The Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
