public class alphabet_pyramid
{
    public static void main ()
    {
        int i; int j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1)
                {
                   System.out.print("a");
                }
                else if (j==2)
                {
                System.out.print ("b");
              }
              else if(j==3)
              {
              System.out.print("c");
              }
              else if(j==4)
              {
              System.out.print("d");
              }
              else if(j==5)
              {
              System.out.print("e");
              System.out.println("");
              }
        }
    }
  }
}              