/*write a program to input a digit and print it in words.*/
public class digit_in_words
{
    public static void main(int n)
    {
        int r; int sum=1,rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        while (rev>0)
        {
        r=rev%10;
        sum=(sum*10)+r;
        rev=rev/10;
        if (r==1)
        System.out.print("one");
        else if (r==2)
        System.out.print("two");
        else if (r==3)
        System.out.print("three");
        else if (r==4)
        System.out.print("four");
        else if (r==5)
        System.out.print("five");
        else if (r==6)
        System.out.print("six");
        else if (r==7)
        System.out.print("seven");
        else if (r==8)
        System.out.print("eight");
        else if (r==9)
        System.out.print("nine");
        else if (r==0)
        System.out.print("zero");
}
}
}
