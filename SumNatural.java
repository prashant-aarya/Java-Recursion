import java.util.Scanner;
public class SumNatural 
{
    
    public static void main(String [] args)
    {
        int num;
        System.out.println("Enter any number :- ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        SumNatural p=new SumNatural();
         int z=p.natural(num);
        System.out.println("Sum of natural Number : - "+z);
    }
    int natural(int num)
    {
        if(num>0)
        {
            return num+natural(num-1);
        }
        else
        {
            return 0;
        }
    }   
    
}

