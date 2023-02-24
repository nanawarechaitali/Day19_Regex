package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName=sc.nextLine();
        boolean isValid = validateFirstName(firstName);


    }

    private static boolean validateFirstName(String firstName) {
        String firstNameRegex="^[A-Z][a-z]{2,}$";
        Pattern pattern=Pattern.compile(firstNameRegex);
        Matcher matcher=pattern.matcher(firstName);

        if(matcher.matches()==false){
            System.out.println("Does not matches the convention");
        }else{
            System.out.println("Follows");
        }
        return true;

    }



}
