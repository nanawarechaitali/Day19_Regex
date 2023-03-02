package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumFormate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String mobileNumberCheck=sc.nextLine();
        boolean isValid =validateMobileNumberCheck(mobileNumberCheck);

    }

    private static boolean validateMobileNumberCheck(String mobileNumberCheck){
        String mobileNumberCheckRegex = "^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$";
        Pattern pattern = Pattern.compile(mobileNumberCheckRegex);
        Matcher matcher = pattern.matcher(mobileNumberCheck);

        if(matcher.matches()==false){
            System.out.println("Not a valid mobile number");

        }else{
            System.out.println("Follows");
        }
        return true;

    }

}
