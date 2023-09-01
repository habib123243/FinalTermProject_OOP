package Talha;

public class Furniture extends Product
{

    int price;
    String type;

    public Furniture(int price, String type)
    {
        this.price = price;
        this.type = type;
    }

    public Furniture()
    {


    }

    public Furniture(String date, int price, String manufacturing, int rent_Price, int price1, String type) {
        super(date, price, manufacturing, rent_Price);
        this.price = price1;
        this.type = type;
    }

    public Furniture(int price, String manufacturing, int  Rent_Price, int price1, String type)
    {
        super(price, manufacturing,  Rent_Price);
        this.price = price1;
        this.type = type;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE 2        = " + price);
        System.out.println("TYPE           = " + type);

    }
}

class bed extends Furniture
{
    int price;
    String color;

    public bed()
    {

    }
    public bed(int price, String type, int price1, String color)
    {
        super(price, type);
        this.price = price1;
        this.color = color;
    }

    public bed(String date, int price, String manufacturing, int rent_Price, int price1, String type, int price2, String color) {
        super(date, price, manufacturing, rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public bed(int price, String color)
    {
        this.price = price;
        this.color = color;
    }

    public bed(int price, String manufacturing,  int Rent_Price, int price1, String type, int price2, String color)
    {
        super(price, manufacturing,  Rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE 3        = " + price);
        System.out.println("COLOR BED      = " + color);

    }
}

class chair extends Furniture
{
    int price;
    String color;

    public chair()
    {

    }
    public chair(int price, String type, int price1, String color)
    {
        super(price, type);
        this.price = price1;
        this.color = color;
    }

    public chair(String date, int price, String manufacturing, int rent_Price, int price1, String type, int price2, String color) {
        super(date, price, manufacturing, rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public chair(int price, String color)
    {
        this.price = price;
        this.color = color;
    }

    public chair(int price, String manufacturing,  int  Rent_Price, int price1, String type, int price2, String color)
    {
        super(price, manufacturing,  Rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE 3        = " + price);
        System.out.println("COLOR CHAIR    = " + color);

    }
}

class table extends Furniture
{
    int price;
    String color;
    public table()
    {

    }
    public table(int price, String type, int price1, String color)
    {
        super(price, type);
        this.price = price1;
        this.color = color;
    }

    public table(int price, String color)
    {
        this.price = price;
        this.color = color;
    }

    public table(String date, int price, String manufacturing, int rent_Price, int price1, String type, int price2, String color) {
        super(date, price, manufacturing, rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public table(int price, String manufacturing, int  Rent_Price, int price1, String type, int price2, String color)
    {
        super(price, manufacturing,  Rent_Price, price1, type);
        this.price = price2;
        this.color = color;
    }

    public void display()
    {
        super.display();
        System.out.println("PRICE 3        = " + price);
        System.out.println("COLOR TABLE    = " + color);

    }

}