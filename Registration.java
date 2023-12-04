import java.util.Scanner;

import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a First Name:");
        String First_name=sc.nextLine();

        String First_name_regex="^[A-Z][a-z]{2,}$";


       if(!Pattern.matches(First_name_regex,First_name)){

           System.out.println("Invalid first Name.");

       }

        System.out.println("Enter a Last Name:");
        String Last_name=sc.nextLine();

        String Last_name_regex="^[A-Z][a-z]{2,}$";


        if(!Pattern.matches(Last_name_regex,Last_name)){

            System.out.println("Invalid first Name.");

        }
        System.out.println("Enter an Email Id:");

        String email=sc.nextLine();


        String email1_regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";



        if (Pattern.matches(email1_regex, email)) {

            System.out.println("invalid email");
        }
        else{
            System.out.println("invalid email");
        }





    }
}
