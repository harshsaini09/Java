public class prime_number 
{
    public static void main()
    {
    int i;int j;int k=0; int store;
    for (i=1;i<=230;i++)
{
for (j=1;j<=i;j++)
k++;
}
if (k==2)
{
 store = i*i;
 System.out.println("squre of frist prime number are"+store);
}
}
}