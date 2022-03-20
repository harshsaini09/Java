/*A bank accepts fixed deposits for one year or more and the policy it adopts on interest is as
(i)If a deposit is less than Rs. 2000 and for 2 or more years, the interest rate is 5
compounded annually.
(i) If a deposit is Rs. 2000 or more but less than 6000 and for 2 or more years, the interes
percent compounded annually
(iii) If a deposit is more than Rs. 6000 and is for 1 year or more, the interest is
compounded annually,
*/
public class bank_interest
{
    public static void main(int p,int t)
    {
    int r;int a=0;
    if (p<=2000 && t>=2)
    {
     a=p+(p*5*t)/100;
    }
    else if (p>=2000 || p<6000 && t<=2)
    {
       a=p+(p*7*t)/100;
    }
    else if (p>6000 && t>=1)
    {
        a=p+(p*8*t)/100;
    }
    System.out.println (a);
}
}
