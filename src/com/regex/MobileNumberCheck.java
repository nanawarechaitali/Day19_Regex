package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter minimum 8 characters password");
        String password = sc.nextLine();
        boolean isValid = Validate(password);

    }

    private static boolean Validate(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);


        if(matcher.matches()==false){
            System.out.println("Does not follows");
        }else{
            System.out.println("Follows");
        }
        return true;

    }
}
