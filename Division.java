import java.util.Scanner;
class division
{
   public static void main(String args[])
   {
       int a,b,A;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       A=(int)(a/b);
       System.out.format("%d",A);
       sc.close();
   }
}