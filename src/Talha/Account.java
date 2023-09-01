package Talha;


import java.util.Scanner;

public class Account
{

    public int balance;
    private int z;
    private int zz;

    public Account(int balance)
    {
        this.balance = balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void inputbalance()
    {
        int b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Balance of Person");
        b=in.nextInt();
        setBalance(b);
    }

    public int incrementbalance(int x)
    {
        z= balance+x;
        return z;
    }
    public int decrementbalance(int xx)
    {

        zz= getBalance()-xx;
        return zz;
    }

    public void inquiry()
    {
        System.out.println("now the current balance after increment is : "+z);
        System.out.println("now the current balance after decement "+zz);
    }

    public void accountinfo()
    {
        System.out.println(z);
        System.out.println(zz);
    }
    public void displayblnc()
    {
        System.out.println("Your current balance is :"+balance);
    }

}