import java.util.Scanner;

import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a First Name:");
        String name=sc.nextLine();

        String regex="^[A-Z][a-z]{2,}$";


       if(Pattern.matches(regex,name)){
           System.out.println("Valid First Name!!");
       }
       else{
           System.out.println("Invalid first Name.");

       }



    }
}
