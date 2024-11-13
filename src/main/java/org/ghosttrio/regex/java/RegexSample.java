package org.ghosttrio.regex.java;

import java.util.regex.Pattern;

public class RegexSample {

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }

    public static void main(String[] args) {
        String email1 = "ghosttrio@github.com";
        String email2 = "changsoon@githubcom";

        System.out.println(isValidEmail(email1));  // true
        System.out.println(isValidEmail(email2));  // false
    }
}
