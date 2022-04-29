/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.bankapp;

/**
 *
 * @author Ball
 */
public class BankDriver {
    public static void main(String[]args){
        BankAccount a = new BankAccount(432564122);
        
        System.out.println("Balance : " + a.getBalance());
        a.deposit(5000);
        System.out.println("Balance : " + a.getBalance());
        System.out.println("Account Number : " + a.getAccountNumber());
        a.withdraw(5500);
        a.withdraw(4500);
        System.out.println("Balance : " + a.getBalance());
        System.out.println("Transaction Number : " + a.getTransactionNumber());
        
        SavingAccount b = new SavingAccount(432564122);
        System.out.println("Account Number : " + b.getAccountNumber());
        b.deposit(2000);
        a.deposit(300);
        b.withdraw(300);
        System.out.println("Balance : " + a.getBalance());
        System.out.println("Balance : " + b.getBalance());
        System.out.println("Transaction Number : " + a.getTransactionNumber());
        System.out.println("Transaction Number : " + b.getTransactionNumber()); 
    }
}
