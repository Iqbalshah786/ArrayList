package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter correct choice");

            }

        }

    }

    public static  void printInstructions(){
        System.out.println("\n Press keys for Relevant Operation : ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - to add an item into the grocery list");
        System.out.println("\t 3 - to modify an item into the grocery list");
        System.out.println("\t 4 - to remove an item into the grocery list");
        System.out.println("\t 5 - to search an item into the grocery list");
        System.out.println("\t 6 - to quit an item into the grocery list");



    }

    public  static void addItem(){
        System.out.println("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());

    }
    public  static  void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNumber,newItem);

    }
    public static void removeItem(){
        System.out.println("Enter item number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryList(itemNumber-1);
    }
    public static void searchForItem(){
        System.out.println("Item to search for ? :");
        String searchItem= scanner.nextLine();
        if (groceryList.findItem(searchItem)!= null){
            System.out.println("Found"+searchItem+ "in your grocery list");
        }
        else{
            System.out.println(searchItem+" not found in your grocery list.");
        }
    }
}
