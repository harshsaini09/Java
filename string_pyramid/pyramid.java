public class pyramid
{
    public static  void main(String s)
    {
        int i; int j;char c;
        int l=s.length();
        System.out.println();
        for (i=0;i<l;i++)
        {
        for (j=0;j<i;j++)
        {
        System.out.print(s.charAt(j));
        }
        System.out.print(s.charAt(j));
        
        System.out.println();
        }
}
}