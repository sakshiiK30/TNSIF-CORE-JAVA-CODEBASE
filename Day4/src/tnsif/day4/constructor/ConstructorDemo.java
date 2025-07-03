package tnsif.day4.constructor;

import java.util.Scanner;

public class ConstructorDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        String name, city;
        int id;
        System.out.println("Enter customer id:");
        id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter customer city:");
        city = sc.nextLine();

        System.out.println("Enter customer name:");
        name = sc.nextLine();

        System.out.println(" ");

        Customer c1 = new Customer(); // default
        c1.setCustomerName(name);
        c1.setCustomerCity(city);
        c1.setCustomerId(id);
        System.out.println(c1);

        sc.close();
        
    }
}

