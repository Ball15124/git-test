/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Ball
 */
public class SavingAccount extends BankAccount{
    private double interestRate;
    
    public SavingAccount(){
        interestRate = 15;
    }
    
    public SavingAccount(int savingaccNum){
      this.accountNumber = savingaccNum;
    }
    
    public void deposit(int money){
           balance += money;
           transactionNum++;
    }
    
    public void withdraw(int money){
           balance -= money;
           transactionNum++;
    }

}
