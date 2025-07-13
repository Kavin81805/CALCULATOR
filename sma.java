import java.util.Scanner;
public class sma{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("STUDENT MARK AVERAGE CALCULATOR\n");
        System.out.println("Enetr the tamil mark : ");
        int tamil = scan.nextInt();
        System.out.println("Enetr the english mark : ");
        int eng = scan.nextInt();
        System.out.println("Enter the maths mark :");
        int match = scan.nextInt();
        System.out.println("Enetr the science mark : ");
        int science = scan.nextInt();
        System.out.println("Enetre the social mark : ");
        int social = scan.nextInt();

        int total = tamil + eng + match + science + social;
        System.out.println("total marks : "+ total);
        float avg = total / 5.0f;
        
        // nested if to check the average and print the result
        if (tamil >=0 && tamil <=100 && eng >=0 && eng <=100 && match >=0 && match <=100 && science >=0 && science <=100 && social >=0 && social <=100){
            if(avg < 35 ){
            System.out.println("You fali the exam : "+avg);
            }
            else if(avg >=35 && avg < 50){
                System.out.println("good : " + avg);
            }
            else if (avg >= 50 && avg <70){
                System.out.println("very good : "+avg);
            }
            else if(avg >=70 && avg <90 ){
                System.out.println("excellent : "+avg );
            }
            else{
                System.out.println("mass na nee : "+avg);
            }
    }
    else{
        System.out.println("olunga enter panuda \nmarkuu 0 - 100 kulla irukkanum");
    }
    }
} 