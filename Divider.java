import java.util.Scanner;
public class Divider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ;
        System.out.print(" Enter Your number for devcide 3 / 5 : ");
        num = scan.nextInt();
        if((num % 3 == 0) || (num % 5 == 0)){
            if ((num % 3 == 0) && (num % 5 ==0)) {
                System.out.println(num +" is devisible by both 3 and 5");
            }
            else if (num % 3 == 0) {
                System.out.println(num + " is devisible by 3");
            }
            else{
                System.out.println(num + " is deveisible by 5");
            }
        }
        else {
            System.out.println("its not deveisable by both 5 and 3 : " +num);
        }
        }
    }