/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operations1;

/**
 *
 * @author ADMIN
 */
public class Operations1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     String customerName = "Rawlings Odhiambo", 
               homePhone = "(051) 562 321"; 
 int numberOfShirts = 5, numberOfPants = 2, numberOfDresses = 8; 
 double priceOneShirt = 850.50D, priceAPairOfPants = 1200.50D, 
               priceOneDress = 1500.0D; 
 int orderMonth = 3, orderDay = 15, orderYear = 2012; 
 double mondayDiscount = 0.25; // 25% 
         
         System.out.println("-/- Nakuru Cleaning Services -/-"); 
 System.out.println("========================"); 
 System.out.print("Customer:   "); 
 System.out.println(customerName); 
 System.out.print("Home Phone: "); 
 System.out.println(homePhone); 
 System.out.print("Order Date: "); 
 System.out.print(orderMonth); 
 System.out.print('/'); 
 System.out.print(orderDay); 
 System.out.print('/'); 
 System.out.println(orderYear); 
 System.out.println("------------------------"); 
 System.out.println("Item Type  Qty Sub-Total"); 
 System.out.println("------------------------"); 
 System.out.print("Shirts      "); 
 System.out.print(numberOfShirts); 
 System.out.print("     "); 
 System.out.println(priceOneShirt); 
 System.out.print("Pants       "); 
 System.out.print(numberOfPants); 
 System.out.print("     "); 
 System.out.println(priceAPairOfPants); 
 System.out.print("Dresses     "); 
 System.out.print(numberOfDresses); 
 System.out.print("     "); 
 System.out.println(priceOneDress); 
 System.out.println("------------------------"); 
 System.out.print("Monday Discount: "); 
 System.out.print(mondayDiscount); 
 System.out.println('%'); 
 System.out.println("========================"); 
 System.out.println();
    }
}
