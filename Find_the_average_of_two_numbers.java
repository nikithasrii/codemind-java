import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        int a,b;
        float A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        A=(float)(a+b)/2;
        System.out.format("%.4f",A);
        sc.close();
    }
}