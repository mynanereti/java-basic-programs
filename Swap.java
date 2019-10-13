import java.util.*;
class Swap {
public static void main(String[] args) 
{
int a,b,c;
System.out.println("Enter a,b");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before Swap");
System.out.println("a="+a+"b="+b);
c=a;
a=b;
b=c;
System.out.println("After Swap");
System.out.println("a="+a+"b="+b);
}
}
