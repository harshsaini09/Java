public class count_vowels
{
    public static void main(String s)
    {
        int i;int v=0;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
               v++;
            }
        }
        System.out.println(v);
    }
}