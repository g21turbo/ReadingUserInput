import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2023;

        // System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + ", thanks for taking the course.");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("hello, what is your name?");
        String name = scanner.nextLine();

        System.out.println("What year were you born?");

        int age = scanner.nextInt();
        if (age > currentYear) {
           return "Invalid Value";

        }

        age = currentYear - age;

        return "Your name is " + name + " and you are " + age + " years old";

    }

}