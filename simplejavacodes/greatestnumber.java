import java.util.Scanner;
public class greatestnumber{
    public static void main(String[]args){
        int a,b,c,d;
        Scanner inputNumScanner=new Scanner (System.in);
        System.out.println("Enter the first number:");
        a=inputNumScanner.nextInt();
        System.out.println("Enter the second number:");
        b=inputNumScanner.nextInt();
        System.out.println("Enter the third number:");
        c=inputNumScanner.nextInt();
        System.out.println("Enter the fourth number:");
        d=inputNumScanner.nextInt();
     
        if(a>b && a>c && a>d && a>e)
        System.out.println("The greatest number is the first number");
        else if (b>a && b>c && b>d && b>e)
        System.out.println("the greatest number is the second number");
        else if(c>a && c>b && c>d && c>e)
        System.out.println("the greatest number is  the third number");
        else
        System.out.println("the greatest number is the fourth number");
       
    }}
        