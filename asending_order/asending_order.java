/*give three number a,b and c write a program to write their value in an asending order.*/
public class asending_order
{
    public static void main(int a, int b,int c)
    {
        if (a>b&&a>c||b<a&&b>c||c<a&&c<b)
        System.out.println("a>b>c");
        else if (c>a&&c>b||a<c&&a>b||a<c&&b<c)
        System.out.println("c>a>b");
        else if (b>a&&b>c||c<b&&c>a||a<b&&a<c)
        System.out.println("b>c>a");
        else if (c>b&&c>a||b<c&&b>a||a<b&&b<c)
        System.out.println("c>b>a");
    }
}