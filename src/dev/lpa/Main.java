package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

record GroceryList(String name){


}

public class Main {

    public static void main(String[] args) {

        //System.out.println(readInput());
        groceryList(readInput());

    }


    public static int readInput(){

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Available actions: ");
            System.out.println();
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            return Integer.parseInt(scanner.next());
        }


    }

    public static void groceryList(int menuSelection){

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();


        while(true) {
            if (menuSelection == 0) {
                System.out.println("Shutting down");
                break;
            } else if (menuSelection == 1) {
                System.out.println("Please enter your desired item:");
                groceryList.add((scanner.next()));
                System.out.println(groceryList);
                break;
            } else if (readInput() == 2) {
                groceryList.remove(scanner.next());
                System.out.println(groceryList);
                break;
            }

        }


    }

}


