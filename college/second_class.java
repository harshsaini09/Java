public class second_class
{
    public static void main()
    {
        int a[]={2,5,32,54,12,55,44,18,9,56};
        int i,temp;
        System.out.println("this is sorted array");
        for(i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
        System.out.println();
        System.out.println(" max: "+a[0]);
        System.out.println(" min: "+a[9]);
    }
}