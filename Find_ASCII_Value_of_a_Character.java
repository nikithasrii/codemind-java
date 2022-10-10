import java.util.Scanner;
class ASCII
{
    public static void main(String args[])
    {
        char a;int b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine().charAt(0);
        b=(int)a;
        System.out.println(b);
        sc.close();
    }
}