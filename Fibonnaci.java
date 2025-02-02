import java.util.Scanner;

public class Fibonnaci {
    static int a=0,b=1,num,c;
    public static void main(String[] args) {
        
        
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number : ");
        num=r.nextInt();
        System.out.print(a+" "+b);
        Fibonnaci p=new Fibonnaci();
        p.fibo(num-2);
        //System.out.println();
    }
    void fibo(int num)
    {
        if(num>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fibo(num-1);
        }
    }
    
}
