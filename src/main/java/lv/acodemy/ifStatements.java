package lv.acodemy;

public class ifStatements {
    public static void main(String[] args) {

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        number = -5;
        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        int score = 68;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else if (score >= 40) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Don't know");
        }


        int age = 6;
        if (age >= 18) {
            System.out.println("You eligible to buy ...");
        } else {
            System.out.println("No, No, No ");
        }

        int number1 = 100;
        if (number1 % 5 == 0) {
            System.out.println("Ok");
        }

        int score1 = 49;
        if (score1 >= 50) {
            System.out.println("passed");
        } else {
            System.out.println("sorry, not this time buddy");
        }

        int temperature = 10;
        if (temperature > 30) {
            System.out.println("Hottt");
        } else if (temperature >= 15) {
            System.out.println("Nice weather");
        } else if (temperature < 15) {
            System.out.println("Cold");
        }

        String color = "red";
        if (color.equals("green")) {
            System.out.println("GO");
        } else if (color.equals("yellow")) {
            System.out.println("slow down");
        } else if (color.equals("red")) {
            System.out.println("Stop");
        }
    }
}
