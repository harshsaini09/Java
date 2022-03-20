public class patanahi
{
    public static void main()
    {   int sume=0,sumo=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
        sume=sume+i;
        }
        System.out.println(" "+sume);
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
        sumo=sumo+i;
        }
        System.out.println(" "+sumo);
    }
}