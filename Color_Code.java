import java.util.Scanner;
class color_code
{
    public static void main(String args[])
    {
        char x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextLine().charAt(0);
        if((x=='v')||(x=='V'))
        {
            System.out.println("Violet");
        }
        else if((x=='i')||(x=='I'))
        {
            System.out.println("Indigo");
        }
        else if ((x=='b')||(x=='B'))
        {
           System.out.println("Blue"); 
        }
        else if ((x=='g')||(x=='G'))
        {
            System.out.println("Green");
        }
        else if ((x=='y')||(x=='Y'))
        {
            System.out.println("Yellow");
        }
        else if((x=='o')||(x=='O')) 
        {
             System.out.println("Orange");
        }
        else if((x=='r')||(x=='R')) 
        {
            System.out.println("Red");
        }
        else 
        {
            System.out.println("-1");
        }
        sc.close();
        
    }
}