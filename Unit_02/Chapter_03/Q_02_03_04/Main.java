package Unit_02.Chapter_03.Q_02_03_04;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int hop = Integer.parseInt(input.nextLine());

        for (int i = start; i <= end; i += hop){
            System.out.println(i);
        } input.close();
    }
}
