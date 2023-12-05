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


        String email1_regex="^([a-zA-Z0-9_\\+-]+(\\.[a-zA-Z0-9_\\-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+)$";



        if (!Pattern.matches(email1_regex, email)) {


            System.out.println("invalid email");
        }
        System.out.println("Enter Mobile Number");

        String mobile_number= sc.nextLine();
        String Mobile_number_regex="^\\d{2} \\d{10}$";
        if(!Pattern.matches(Mobile_number_regex,mobile_number)){
            System.out.println(" Invalid Mobile Number");
        }

        System.out.println("Enter a Password:");
        String password= sc.nextLine();


        String password_regex="^(?=.*[A-Z]).(?=.*[0-9]).(?=[A-Za-z\\d]*[^A-Za-z\\d][A-Za-z\\d]*$){1}.{8,}$";

        if(!Pattern.matches(password_regex,password)){
            System.out.println("Password doesn't statisfy specific condition");

        }


    }
}
