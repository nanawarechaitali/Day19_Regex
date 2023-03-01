package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last name");
        String lastName=sc.nextLine();
        boolean isValid =validateLastName(lastName);

    }

    private static boolean validateLastName(String lastName) {
        String lastNameRegex="^([A-Z]{1}+)[A-Za-z]{2,}$";
        Pattern pattern=Pattern.compile(lastNameRegex);
        Matcher matcher=pattern.matcher(lastName);


        if(matcher.matches()==false){
            System.out.println("Does not matches the convention");
        }else{
            System.out.println("Follows");
        }
        return true;


    }
}
