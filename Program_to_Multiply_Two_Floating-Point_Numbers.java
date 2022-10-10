import java.util.Scanner;
class multiply_float_point_numbers
{
    public static void main(String args[])
    {
         float a,b;
        float A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        A=(float)(a*b);
        System.out.format("%.2f",A);
        sc.close();
    }
}