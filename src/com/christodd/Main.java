package com.christodd;

public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
                System.out.println("value was 3");
                break;
            case 4:case 5:case 6:
                System.out.println("was 3, 4, or 5");
                break;
            default:
                System.out.println("default");
                break;
        }

        char characterValue = 'F';

        switch(characterValue) {
            case 'A': case 'B': case'C': case'D': case'E':
                System.out.println("If any of these, you found a Letter");
                System.out.println("The letter was " + characterValue + "!");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

    }
}
