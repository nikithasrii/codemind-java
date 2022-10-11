import java.util.Scanner;
class car
{
    public static void main(String args[])
    {
       int t,i;
        float x1,x2,y1,y2,a,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        a=(float)x1/y1;
        b=(float)x2/y2;
        if (a>b)
        {
            System.out.println("-1");
        }
        else if (a==b)
        {
            System.out.println("0");
        }
        else 
        {
            System.out.println("1");
        }
        
        }
        sc.close();
    }
}