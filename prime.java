import java.util.*;
class prime
{
    public static void main(String[] args)
    {
       
        int n=21,flag=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Yes it is prime");
        else
        System.out.println("No it is not prime");
    }
}