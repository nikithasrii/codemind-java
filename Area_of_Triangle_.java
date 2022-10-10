import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        double a,b,c,s,A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",A);
        sc.close();
    }
}