package com.regex;

import javax.xml.crypto.dsig.dom.DOMValidateContext;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email Id");
        String emailId = sc.nextLine();
        boolean isValid = validateEmailId(emailId);


    }

    private static boolean validateEmailId(String emailId) {
        String emailIdRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailIdRegex);
        Matcher matcher = pattern.matcher(emailId);

        if(matcher.matches()==false){
            System.out.println("Does not valid");
        }else{
            System.out.println("Follows");
        }
        return true;
    }

}
