import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
     int n,m,r=0,a;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a num");
     n=sc.nextInt();
     m=n;
     while(n>0)
     {
        a=n%10;
        r=r*10+a;
        n=n/10;
     }
     if(n==m)
     System.out.println("Given num is palindrome");
     else
     System.out.println("Given num is  not palindrome");
  }
}
