import java.util.*;
class Fib
{
public static void main(String args[])
{
int i,a=0,b=1,c,d;
Scanner vag=new Scanner(System.in);
System.out.println("Enter limit");
d=nextInt();
System.out.println(a);
System.out.println(b);
for(i=0;i<=d;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
