public class string_shortform
{
    public static void main(String S)
    {
        int i;int l;char a;
        l=S.length();
        
        for(i=0;i<=(l+1);i++)
        {
            if(i==0)
            {
                System.out.print(S.charAt(0));
            }
            else
            if(S.charAt(i)==' ')
            {
              System.out.print(". "+S.charAt(i+1));  
            }
    }
}
}