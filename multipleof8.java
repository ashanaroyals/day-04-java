import java.util.*;
public class multipleof8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&7)==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }        
            }
}