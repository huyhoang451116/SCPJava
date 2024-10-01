
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_DE2_KT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong so Fibonacci muon hien thi: ");
        int N = scanner.nextInt();
        
        ArrayList<Integer>FibonacciList = new ArrayList<>();
        int a = 0, b = 1;
        
        System.out.println("Day  Fibonacci:");
        for (int i = 0; i < N; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        int sum = 0;
        for ( int num :  FibonacciList) {
            sum += num;
        }
        System.out.println("\nTong: " + sum);
        scanner.close();
    }
}
