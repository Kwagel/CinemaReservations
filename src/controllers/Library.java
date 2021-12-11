package controllers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {

    public int scanInt() {
        int number;
        try {
            number = Integer.parseInt(new Scanner(System.in).nextLine());
            return number;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String scanName() {
        Pattern words = Pattern.compile("^[ A-Za-z]+$");;
        String string = new Scanner(System.in).nextLine();
        Matcher matcher = words.matcher(string);
        if (matcher.matches()) {
            return string;
        }
        return "Error in input, should only contain letters and spaces...";
    }
}
