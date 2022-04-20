import java.util.Scanner;
public class inout {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n\t\tWelcome to MadLibs!\n");
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        //System.out.println("\n\t ");
        System.out.println("Let's begin our game "+name+"! ");
        System.out.println("\nWhat's your favorite color? ");
        String color = scanner.nextLine();
        System.out.println("\nWhat's your favorite animal? ");
        String animal = scanner.nextLine();
        System.out.println("\nWhat's your favorite city? ");
        String city = scanner.nextLine();
        System.out.println("\nWhat's your favorite food? ");
        String food = scanner.nextLine();
        System.out.println("\n\tOH NOOOO! A "+animal+" was seen running around "+city+" going to a "+color+" building that serves "+color+" "+food+" !!! What a strange "+animal+" ! Wow! ");

    }
}