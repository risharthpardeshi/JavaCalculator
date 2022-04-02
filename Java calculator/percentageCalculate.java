import java.util.Scanner;

public class percentageCalculate{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sub 1 marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter sub 2 marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter sub 3 marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter sub 4 marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter sub 5 marks");
        int sub5 = sc.nextInt();

        float result = ((sub1+sub2+sub3+sub4+sub5)/200.0f)*100;

        if((sub1>15) && (sub2>15)&& (sub3>15)&& (sub4>15) && (sub5>15)){
            System.out.println("Congratulations you are pass in exam");
            System.out.println("your percentage is " + result +"%");
        }
        else{
            System.out.println("You are fail");
            System.out.println("Work harder and be prepared in next exam");
        }


    }
}