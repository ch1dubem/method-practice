package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        String fullName = formatName(firstName,lastName);

        System.out.println(fullName);
    }

    public static String  formatName(String first, String last){
        return last + " " + first;

    }

}
