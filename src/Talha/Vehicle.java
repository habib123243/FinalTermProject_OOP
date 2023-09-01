package Talha;

public class Vehicle extends Product
{

    int price;
    String color;

    public Vehicle()
    {

    }
    public Vehicle(int price, String color)
    {
        this.price = price;
        this.color = color;
    }

    public Vehicle(int price, String manufacturing, int Rent_Price, int price1, String color) {
        super(price, manufacturing, Rent_Price);
        this.price = price1;
        this.color = color;
    }

    public Vehicle(String date, int price, String manufacturing, int rent_Price, int price1, String color) {
        super(date, price, manufacturing, rent_Price);
        this.price = price1;
        this.color = color;
    }


    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public void display()
    {
        super.display();
        System.out.println("PRICE 2        = "+price);
        System.out.println("COLOR          = "+color);
    }
}
class car extends Vehicle
{
    String company;
    int price;
    String model;

    public car()
    {

    }
    public car(String company, int price, String model)
    {
        this.company = company;
        this.price = price;
        this.model = model;
    }

    public car(String date, int price, String manufacturing, int rent_Price, int price1, String color, String company, int price2, String model) {
        super(date, price, manufacturing, rent_Price, price1, color);
        this.company = company;
        this.price = price2;
        this.model = model;
    }

    public car(int price, String color, String company, int price1, String model)
    {
        super(price, color);
        this.company = company;
        this.price = price1;
        this.model = model;
    }

    public car(int price, String manufacturing, int  Rent_Price, int price1, String color, String company, int price2, String model)
    {
        super(price, manufacturing, Rent_Price, price1, color);
        this.company = company;
        this.price = price2;
        this.model = model;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE2         = " + price);
        System.out.println("COMPANY        = " + company);
        System.out.println("MODEL CAR      = " + model);

    }
}

class bike extends Vehicle
{
    String company;
    int price;
    String model;

    public bike()
    {

    }
    public bike(String company, int price, String model)
    {
        this.company = company;
        this.price = price;
        this.model = model;
    }

    public bike(String date, int price, String manufacturing, int rent_Price, int price1, String color, String company, int price2, String model) {
        super(date, price, manufacturing, rent_Price, price1, color);
        this.company = company;
        this.price = price2;
        this.model = model;
    }

    public bike(int price, String color, String company, int price1, String model)
    {
        super(price, color);
        this.company = company;
        this.price = price1;
        this.model = model;
    }

    public bike(int price, String manufacturing,  int  Rent_Price, int price1, String color, String company, int price2, String model)
    {
        super(price, manufacturing,  Rent_Price, price1, color);
        this.company = company;
        this.price = price2;
        this.model = model;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE 2        = " + price);
        System.out.println("COMPANY        = " + company);
        System.out.println("MODEL BIKE     = " + model);

    }

}