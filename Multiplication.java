import java.util.Scanner;
class multiplication
{
    public static void main(String args[])
    {
        int a,b,A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        A=a*b;
        System.out.format("%d",A);
        sc.close();
    }
    
}