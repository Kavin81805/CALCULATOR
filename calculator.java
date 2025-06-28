
import java.util.Scanner;

public class calculator 
{
    public static void main (String[]args)
    {  
                
            Double num1 , num2 , result;
            char operator;
            
            Scanner scan = new Scanner (System.in);

            System.out.println("ENTER THE 1ST VALUE : ");
            num1 = scan.nextDouble();    

            System.out.println("ENTER THE 2ST VALUE : ");
            num2 = scan.nextDouble();    
        
            System.out.println("Enter the operator like (+,-,*,/)");
            operator = scan.next().charAt(0);

        if (operator == '+') {
            
            result = num1 + num2;
            System.out.println("ANSWER = "+result);
 
        }

       else if(operator == '-'){

            result = num1 - num2;
            System.out.println("ANSWER = "+result);

        }

        else if (operator == '*') {

            result = num1 * num2;
            System.out.println("ANSWER = "+result);     
        }
        else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("secound variable is 0 .");     
            }
            else{
            result = num1 / num2;
            System.out.println("ANSWER = "+result);
            }   
        }
        else{
            System.out.println("YOUR OPERATOR IS WRONG");  
        }
        scan.close();
    }
}