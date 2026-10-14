

import java.util.ArrayList;
class Account{
    int accountnum;
    String customername;
    int balance;

    public Account( int accountnum, String customername,int balance)
{       
    this.accountnum=accountnum;
    this.customername=customername;
    this.balance=balance;

    }
    
    void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("deposited amt"+amount);
        System.out.println("Total Amount "+" "+balance);

    }
    void withdraw(int amount)
    {
        balance=balance-amount;
        
        if(balance>amount){
            System.out.println("Withdrawn amt"+" "+amount);
            }
        else{
            System.out.println("Insufficient bank balance");
        }

       
    }}
    
class bank{
        ArrayList<Account> accounts =new ArrayList<>();
        void addaccount(Account account ){
            accounts.add(account);
        }
        void removeaccount(Account account){
            accounts.remove(account);
        }
public static void main(String[] args) {
    bank b1 =new bank();
    Account a1=new Account(101,"Aksh",2000);
    Account a2=new Account(102,"dev",3000);
    a1.deposit(500);
    a1.withdraw(100);
    b1.addaccount(a1);
    b1.removeaccount(a2);

}

}


