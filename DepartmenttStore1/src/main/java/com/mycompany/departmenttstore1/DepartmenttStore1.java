/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.departmenttstore1;

/**
 *
 * @author ADMIN
 */
public class DepartmentStore { 
    long itemNumber; 
    char category; 
    String itemName; 
    double unitPrice; 
} 

public class DepartmenttStore1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
              DepartmentStore dptStore = new DepartmentStore(); 
 
        dptStore.itemNumber = 437876; 
        dptStore.category = 'W'; 
        dptStore.itemName = "Scoop Neck Dress"; 
        dptStore.unitPrice = 148.00D; 
 
        System.out.println("Department Store"); 
        System.out.println("Stock #:    " + dptStore.itemNumber); 
        System.out.println("Category:   " + dptStore.category); 
        System.out.println("Name:       " + dptStore.itemName); 
        System.out.println("Unit Price: " + dptStore.unitPrice);
    }
}
