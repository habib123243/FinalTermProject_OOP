package Talha;

public class Electronics extends Product
{

    protected int price;
    protected String category;


    public Electronics(int price, String category)
    {
        this.price = price;
        this.category = category;
    }

    public Electronics(String date, int price, String manufacturing, int rent_Price, int price1, String category)
    {
        super(date, price, manufacturing, rent_Price);
        this.price = price1;
        this.category = category;
    }

    public Electronics(int price, String manufacturing, int Rent_Price, int price1, String category1)
    {
        super(price, manufacturing, Rent_Price);
        this.price = price1;
        this.category = category1;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public Electronics()
    {

    }

    public void setCategory(String category)
    {
        this.category = category;
    }
    public void  display()
    {
        super.display();
        System.out.println("PRICE 2        = "+price);
        System.out.println("CATEGORY 1     = "+category);
    }
}
class mobile extends Electronics
{
    String model;
    int price;

    public mobile()
    {

    }
    public mobile(int price, String category, String model, int price1)
    {
        super(price, category);
        this.model = model;
        this.price = price1;
    }

    public mobile(String date, int price, String manufacturing, int rent_Price, int price1, String category, String model, int price2) {
        super(date, price, manufacturing, rent_Price, price1, category);
        this.model = model;
        this.price = price2;
    }

    public mobile(int price, String manufacturing, int Rent_Price, int price1, String category1, String model, int price2)
    {
        super(price, manufacturing, Rent_Price, price1, category1);
        this.model = model;
        this.price = price2;
    }
    public void display()
    {
        super.display();
        System.out.println("PRICE 3        = "+price);
        System.out.println("MODEL MOBILE   = "+model);

    }
}
class laptop extends Electronics
{
    String model;
    int price;

    public laptop()
    {

    }

    public laptop(int price, String model)
    {

        this.model = model;
        this.price = price;
    }

    public void setModel(String model)
    {
        this.model = model;
    }


    public void setPrice(int price)
    {
        this.price = price;
    }
    public String getModellaptop()
    {
        return model;
    }

    public laptop(String date, int price, String manufacturing, int rent_Price, int price1, String category, String model, int price2) {
        super(date, price, manufacturing, rent_Price, price1, category);
        this.model = model;
        this.price = price2;
    }


    public void display()
    {
        super.display();
        System.out.println("PRICE3         = "+price);
        System.out.println("MODEL LAPTOP   = "+model);

    }



}
class ac extends Electronics
{
    String company;
    int price;

    public ac(int price, String category, String model, int price1)
    {
        super(price, category);
        this.company= company;
        this.price = price1;
    }
    public ac()
    {

    }

    public ac(String date, int price, String manufacturing, int rent_Price, int price1, String category, String company, int price2) {
        super(date, price, manufacturing, rent_Price, price1, category);
        this.company = company;
        this.price = price2;
    }

    public ac(int price, String manufacturing, int  Rent_Price, int price1, String category1, String model, int price2)
    {
        super(price, manufacturing,  Rent_Price, price1, category1);
        this.company = company;
        this.price = price2;
    }
    public void display()
    {
        super.display();
        System.out.println("PRICE 3        = "+price);
        System.out.println("MODEL  AC      = "+company);

    }


}