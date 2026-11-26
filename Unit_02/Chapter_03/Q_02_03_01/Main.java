package Unit_02.Chapter_03.Q_02_03_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numbers = Integer.parseInt(input.nextLine());
    int firstNum = Integer.parseInt(input.nextLine());
    
    int min = firstNum;
    int max = firstNum;

    for (int i = 1; i < numbers; i++) {
        int newNum = Integer.parseInt(input.nextLine());
        if (newNum < min) {
            min = newNum;
        } else if (newNum > max) {
            max = newNum;
        }
    } input.close();
    System.out.println("min: " + min);
    System.out.println("max: " + max);


    }
}