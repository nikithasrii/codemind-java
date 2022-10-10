import java.util.Scanner;
class print
{
    public static void main(String args[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.format("%s",a);
        sc.close();
    }
}