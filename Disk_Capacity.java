import java.util.Scanner;
class disk_capacity
{
    public static void main(String args[])
    {
        int t,s,b,max;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        max=512*t*s*b*2;
        System.out.format("%d",max);
        sc.close();
    }
}