public class armstrong_number
{
    public static void main(int n)
    {
        int r;int store=1;int store1=0; int t=n;
        while(n>0)
        {
            r=n%10;
            store=r*r*r;
            store1=store1+store;
            n=n/10;
        }
        if (t==store1)
        System.out.println("this is an armstrong number");
        else
        System.out.println("this is not an armstrong number");
    }
}