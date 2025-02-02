import java.util.Scanner;
public class Fact {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter any number : ");
        Scanner r=new Scanner (System.in);
        num=r.nextInt();
        Fact p=new Fact();
        int result=p.fact(num);
        System.out.println(result);
    }
    int fact(int num)
    {
        if(num>0)
        {
            return num*fact(num-1);
        }
        else{
            return 1;
        }
    }
    
}
