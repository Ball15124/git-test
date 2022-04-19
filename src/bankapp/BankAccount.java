/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Ball
 */
public class BankAccount {
    //accountnumber
    //balance
    //100 Transaction
    int accountNumber;
    double balance;
    int transactionNum;
    
    public BankAccount(){
        balance = 0;
        transactionNum = 0;
    }
    
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void deposit(int money){
        this.balance += money;
        transactionNum++;
    }
    
    public void withdraw(int money){
        if(balance < money){
            System.out.println("You do not have enough money.");
        }else{
            this.balance -= money;
            transactionNum++;
        }
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public int getTransactionNumber(){
        return this.transactionNum;
    }
}
