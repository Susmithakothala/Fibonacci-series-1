import java.util.*;

 

//display fibonacciserie upto given number
public class Fibonocaccii_series {

 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        System.out.println("fibonoccaci series:");
        System.out.print(t1 + " " +t2);
        for(int i =3; i<=n; i++)
        {
            int sum =t1+t2;
            System.out.print(" " +sum);
            t1 = t2;
            t2 = sum;
        }
    }
}