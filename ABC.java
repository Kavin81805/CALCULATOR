import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        double a,b,c,d,e;
        Scanner sacn =new Scanner(System.in);

        System.out.println("Enter the a value :");
        a=sacn.nextDouble();
        System.out.println("enter the b value :");
        b=sacn.nextDouble();
        System.out.println("Enter the c value :");
        c=sacn.nextDouble();

        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
        d = (a*b*c);
        System.out.println("Multiplication of a,b,c is = "+d);
        c = (a+b+c);
        System.out.println("Addition of a,b,c = "+c);
        System.out.println("Now ("+d+") divided by ("+c+") is = "+(d/c));
    }
    
}
