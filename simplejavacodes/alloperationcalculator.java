import java.util.Scanner;
public class alloperationcalculator{
 public static void main (String[] args){
    int a,b,c,d,e,f;
    Scanner inputNumScanner = new Scanner(System.in);
    System.out.println("Enter two numbers :");
    a=inputNumScanner.nextInt();
    b=inputNumScanner.nextInt();
    c=a+b;
    System.out.println(a+" + "+b+" = "+c);
    d=a*b;
    System.out.println(a+" * "+b+" = "+d);
    e=a/b;
    System.out.println(a+" / "+b+" = "+e);
    f=a-b;
    System.out.println(a+" - "+b+" = "+f);
}
}
    
    