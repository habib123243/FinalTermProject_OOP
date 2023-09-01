package Talha;

public class Product
{


    public String date;

    protected int price;
    protected String manufacturing;
    protected int Rent_Price;
    public Product()
    {

    }




    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


    public Product(int price, String manufacturing, int Rent_Price)
    {
        this.price = price;
        this.manufacturing = manufacturing;
        this.Rent_Price =Rent_Price;
    }

    public Product(String date, int price, String manufacturing, int rent_Price) {
        this.date = date;
        this.price = price;
        this.manufacturing = manufacturing;
        Rent_Price = rent_Price;
    }

    public void setRent_Price(int rent_Price) {
        Rent_Price = rent_Price;
    }

    public void setPriceee(int price)
    {
        this.price = price;
    }

    public void setManufacturing(String manufacturing)
    {
        this.manufacturing = manufacturing;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setCategory(String category) {
        this.Rent_Price = Rent_Price;
    }
    public void display()
    {
        System.out.println("Date           = "+date);
        System.out.println("PRICE          = "+price);
        System.out.println("MANUFACTURING  = "+manufacturing);
        System.out.println("Rent_Price     = "+Rent_Price);
    }

}