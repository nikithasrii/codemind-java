import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if ((x==4)||(x==5)||(x==6))
        {
          System.out.println("Summer");  
        }
        else if  ((x==7)||(x==8)||(x==9))
        {
          System.out.println("Rainy");
        }
        else if  ((x==11)||(x==12)||(x==1))
        {
            System.out.println("Winter");
        }
        else if ((x==2)||(x==3))
        {
            System.out.println("Spring");
        }
        else 
        {
            System.out.println("-1");
        }
        sc.close();
    }
}