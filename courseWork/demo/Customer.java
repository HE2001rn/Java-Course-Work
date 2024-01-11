/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;
import java.util.*;
/**
 *
 * @author HESHAN
 */
public class Customer {

    private String Size;
    private String OrderId;
    private String phonenumber;
    private double amount;
    private int Qty;
    private String status;
    
    public static ArrayList<Customer> customer =  new ArrayList<>();

    public Customer() {
    }

    public Customer(String Size, String OrderId, String phonenumber, double amount, int Qty, String status) {
        this.Size = Size;
        this.OrderId = OrderId;
        this.phonenumber = phonenumber;
        this.amount = amount;
        this.Qty = Qty;
        this.status = status;
    }

    public String getSize() {
        return Size;
    }

    public String getOrderId() {
        return OrderId;
    }

    public String getphonenumber() {
        return phonenumber;
    }

    public double getamount() {
        return amount;
    }

    public int getQty() {
        return Qty;
    }

    public String getstatus() {
        return status;
    }
    
}
