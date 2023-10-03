import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("How MAny Numbers Do You Want to Enter ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Now Enter Numbers ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Reversed Number - ");
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i]+" , ");

        }
        System.out.println();
    }
}
