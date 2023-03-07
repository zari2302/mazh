import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hour: ");
        int hour = scanner.nextInt();
        System.out.println("minutes :");
        int minutes = scanner.nextInt();
        System.out.println("second :");
        int second = scanner.nextInt();
        int hourSum = hour*3600;
        int minSum = minutes*60;
        int result = hourSum+minSum+second;
        System.out.println( "answer:" + result);


    }
}