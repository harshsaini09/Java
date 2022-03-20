public class palindron_number
{
public static void main(int n)
{
int r;int sum=0;int t=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if (t==sum)
{
System.out.print("this is a pailndrom number");
}
else 
System.out.print("this is not a palindrom number");
}
}