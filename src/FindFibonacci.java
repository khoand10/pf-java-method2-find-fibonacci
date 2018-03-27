import java.util.Scanner;

public class FindFibonacci {
    static int findFibonacci(int index){
        if(index == 0)return 0;
        else if(index == 1)return 1;
        else return findFibonacci(index-1) + findFibonacci(index-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index need find :");
        int index = sc.nextInt();
        System.out.println(String.format("Fibonacci in "+index+"is :"+findFibonacci(index)));
    }
}
