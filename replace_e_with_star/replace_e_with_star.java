public class replace_e_with_star
{
    public static void main (String s)
    {
        int i; int e;
        int l=s.length();
        for (i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if (c=='e')
            System.out.print("*");
            else if( i <='a' || i>='z')
            System.out.print(c);
        }
    }
}