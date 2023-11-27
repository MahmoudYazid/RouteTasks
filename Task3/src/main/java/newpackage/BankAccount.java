/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ahmed
 */
public class BankAccount {
    private int Account_Id ; 
    private int balance   ; 
    
    //fitst constructor
    public BankAccount() {
        
        this.balance = 0;
    }
    //2nd constructor
    public BankAccount(int Account_Id) {
        this.Account_Id = Account_Id;
        
    
    }

    public int getAccount_Id() {
        return Account_Id;
    }

    public int getBalance() {
        return balance;
    }

    //Function implementation
    public void setAccount_Id(int Account_Id) {
        this.Account_Id = Account_Id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public Boolean withdrowal(int WithDrowalMoneyNeeded){
        if ( this.balance > WithDrowalMoneyNeeded){
            this.balance= this.balance - WithDrowalMoneyNeeded;
            return true ; 
        }else{
            return false ;
        }
        
    }
        public int deposit(int WithDrowalMoneyNeeded){
        
            this.balance= this.balance + WithDrowalMoneyNeeded;
            return this.balance; 
        
        
    }
}
