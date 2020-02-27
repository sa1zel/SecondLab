package com.saizel;

import java.util.Scanner;

public class Main {
    public static Ant firstAnt;

    public static void main(String[] args) {
        System.out.println("Program started...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for first: ");
        System.out.println("Name :");
        String firstName = scanner.nextLine();
        AntType antType = null;
        while (antType == null) {
            System.out.print("Type(1. Tank, 2. Fast, 3. Balanced): ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    antType = AntType.TANK;
                    break;
                case 2:
                    antType = AntType.FAST;
                    break;
                case 3:
                    antType = AntType.BALANCED;
                    break;
                default:
                    System.out.println("Something wrong! Try again");
            }
        }
        firstAnt = new Ant(firstName, antType);
        System.out.println("Enter values for second: ");
        System.out.print("Name :");
        scanner = new Scanner(System.in);
        String secondName = scanner.nextLine();
        antType = null;
        while (antType == null) {
            System.out.println("Type(1. Tank, 2. Fast, 3. Balanced):");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    antType = AntType.TANK;
                    break;
                case 2:
                    antType = AntType.FAST;
                    break;
                case 3:
                    antType = AntType.BALANCED;
                    break;
                default:
                    System.out.println("Something wrong! Try again");
            }
        }
        Ant secondAnt = new Ant(secondName, antType);
        boolean inProcess = true;
        while (inProcess) {
            System.out.println("Menu:(Choose some one)");
            System.out.println("1. Show object1.");
            System.out.println("2. Change object1.");
            System.out.println("3. Show object2.");
            System.out.println("4. Change object2.");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    firstAnt.print();
                    break;
                case 2:
                    System.out.println("What you wanna change?(Other input to get back)");
                    System.out.println("1. Name");
                    System.out.println("2. Energy");
                    System.out.println("3. Weight");
                    System.out.println("4. Health");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 1:
                            System.out.print("New name: ");
                            firstAnt.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.print("New energy: ");
                            firstAnt.setEnergy(scanner.nextInt());
                            break;
                        case 3:
                            System.out.print("New weight: ");
                            firstAnt.setWeight(scanner.nextDouble());
                            break;
                        case 4:
                            System.out.print("New health: ");
                            firstAnt.setHealth(scanner.nextInt());
                            break;
                        default:
                            System.out.println("Going back");
                            break;
                    }
                    break;
                case 3:
                    secondAnt.print();
                    break;
                case 4:
                    System.out.println("What you wanna change?(Other number input to get back)");
                    System.out.println("1. Name");
                    System.out.println("2. Energy");
                    System.out.println("3. Weight");
                    System.out.println("4. Health");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 1:
                            System.out.print("New name: ");
                            secondAnt.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.print("New energy: ");
                            secondAnt.setEnergy(scanner.nextInt());
                            break;
                        case 3:
                            System.out.print("New weight: ");
                            secondAnt.setWeight(scanner.nextDouble());
                            break;
                        case 4:
                            System.out.print("New health:  ");
                            secondAnt.setHealth(scanner.nextInt());
                            break;
                        default:
                            System.out.println("Going back");
                            break;
                    }
                    break;
                case 5:
                    inProcess = false;
                    break;
                default:
                    System.out.println("Something wrong!");
                    break;
            }
        }
        System.out.println("The end.");
    }
}
