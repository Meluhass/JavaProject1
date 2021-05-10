import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of arrays:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers to check:");

    for (int i = 0; i < n; i++)
    {
        a[i] =i;
    }System.out.println("The Odd numbers are:");
        for(int i = 0 ; i < n ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("The Even numbers are:");
        for(int i = 0 ; i < n ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i+" ");
}}}}
