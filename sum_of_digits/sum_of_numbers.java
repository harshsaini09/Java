public class sum_of_numbers
{
    public static void main(int n)
    {
        int r; int store=0;
        while(n>0)
        {
            r=n%10;
            store=store+r;
            n=n/10;
        }
        System.out.print(store+" is sum of your value.");
    }
}