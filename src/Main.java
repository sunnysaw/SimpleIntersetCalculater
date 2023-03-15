/*
Question : Write a program to calculate simple interest.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SimpleInterest,principle,rate,time;
        System.out.println("First enter the amount :");
        principle = sc.nextDouble();
        System.out.println("Secondly, enter the rate of interest :");
        rate = sc.nextDouble();
        System.out.println("Lastly,enter the period of time for which money is taken :");
        time = sc.nextDouble();
        SimpleInterest = (principle * rate * time) / 100;
        System.out.println("Final value is : " + SimpleInterest);

    }
}
/*
First enter the amount :
20202
Secondly, enter the rate of interest :
2.5
Lastly,enter the period of time for which money is taken :
3
Final value is : 1515.15

time complexity is : O(1);
space complexity is : O(1);
 */