import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double studentGPA = 3.45;
        String helge = "Helge";
        char firstInitial = helge.charAt(0);
        System.out.println(firstInitial);

        // Input
        System.out.println(studentGPA);
        Scanner input = new Scanner(System.in);
        System.out.print("Write a double: ");
        studentGPA = input.nextDouble();
        System.out.println(studentGPA);

        Scanner input2 = new Scanner(System.in);
        String name;
        System.out.print("Write your name! ");
        name = input.next();
        String line = input.nextLine();
        System.out.println(name);
        System.out.println(line);
    }
}
