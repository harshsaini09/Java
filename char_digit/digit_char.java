/* write a program to find whether the given character is a digit or a letter.*/
public class digit_char
{
    public static void main(int c)
    {
        
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        System.out.println("this is a letter");
        else
        System.out.println("this is a digit");
    }
}