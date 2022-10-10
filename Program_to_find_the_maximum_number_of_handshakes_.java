import java.util.Scanner;
class max_no_handshakes
{
    public static void main(String args[])
    {
        int a,H;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        H=(a*(a-1)/2);
        System.out.format("%d",H);
        sc.close();
    }
}