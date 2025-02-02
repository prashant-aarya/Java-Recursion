import java.util.Scanner;
public class DigitSum {
    public static void main(String args [])
    {
        int num;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=r.nextInt();
        DigitSum p=new DigitSum();
        int z=p.digit(num);
        System.out.println(z);
}
int digit(int num)
{
    if(num<10)
    {
        return num;
    }
    else 
    {
        return (num%10)+digit(num/10);
    }

}
    
}
