// package student;
import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        System.out.println(studentAge);
        System.out.println(studentGPA);

        String jenName = "Jenifer";
        char jenInitial = jenName.charAt(0);
        System.out.println(jenInitial);

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();    // convert input to double
        
        System.out.println("studentGPA is " + studentGPA);
    }
    */

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time ...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(Sytem.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
}
