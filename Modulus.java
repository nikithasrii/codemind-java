import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        int a,b,N;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        N=(int)(a%b);
        System.out.format("%d",N);
        sc.close();
    }
}