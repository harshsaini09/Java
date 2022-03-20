/*write a program to check enter character is in upper case,lower case or a digit*/
public class check_character
{
public static void main (int i)
{
if (i>='A' && i<='Z')
System.out.println("character is in upper case");
else if (i>='a' && i<='z')
System.out.println("character is in lower case");
else
System.out.println("you input a digit");
}
}