package Talha;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Post
{
//   static public int loop=0;



    public static String mm="null";
    public static String mm1="null";
    static public int count=0;


    public static int P_id=0;
    public static Product ppp;
    public static int []index=new int[100];

    public static int []index1=new int[100];

    static int []index2=new int[100];

    static int []index3=new int[100];

    static Electronics e2;

    static Electronics e3;

    static Electronics e4;

    static Vehicle b1;

    static Vehicle b2;

    static Furniture f1;

    static Furniture f2;

    static Furniture f3;
    public   static Electronics[] ee=new laptop[100];
    static Electronics[] ee1=new mobile[100];
    static Electronics[] ee2=new ac[100];
    static Vehicle[] vv=new bike[100];
    static Vehicle[] vv1=new car[100];
    static Furniture[] ff=new bed[100];
    static Furniture[] ff1=new chair[100];
    static Furniture[] ff2=new table[100];
    static  Product[] pp=new Product[100];
    public static ArrayList<Product> p=new ArrayList<Product>();
    public static ArrayList<Product> p1=new ArrayList<Product>();
    public static ArrayList<String> list=new ArrayList<String>();




    Product[] ar;
    static public int s;

    public void setS(int s)
    {
        this.s = s;

    }

    public int getS()
    {
        return s;
    }

    public void setAr(Product[] ars)
    {
        ar = new Product[s];
        int n;
        for (n = 0; n < s; n++)
        {
            ar[n] = ars[n];
        }
    }
   static public int loop=0;

   static public int counttt()
    {
        //Post ppp=new Post();
        loop+=s;
        return loop;

    }



    public void postproduct()
    {

        int aa,aa1;
        String b, c;
        Scanner inn=new Scanner(System.in);
        int n;
        for (n = 0; n <s; n++)
        {
            System.out.println("===================================");
            System.out.println("Enter the Information of Product  "+(n+1));
            System.out.println("===================================");
            System.out.println("Enter 1 for ELECTRONIC");
            System.out.println("Enter 2 for vehicle ");
            System.out.println("Enter 3 for Furniture ");
            int h ;
            h=inn.nextInt();
            index[n]=h;
            switch(h)
            {
                case 1:
                    Product pp=new Electronics();
                    System.out.println("Enter 1 for laptop");
                    System.out.println("Enter 2 for mobile ");
                    System.out.println("Enter 3 for air_conditioners");
                    int hh;
                    hh= inn.nextInt();
                    index1[n]=hh;
                    // j2++;
                    switch (hh)
                    {
                        case 1:
                            int t1,t2,t3,w1;
                            String s1,s2,s3,s4;
                            Scanner a = new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            s2=a.nextLine();
                            System.out.println("Enter laptop price = ");
                            t1 = inn.nextInt();
                            System.out.println("Enter laptop model :");
                            s1 = a.nextLine();
                            System.out.println("Enter laptop Rent_Price for 30 days :");
                            w1 = inn.nextInt();
                            System.out.println("Enter laptop price 2 :");
                            t2 = inn.nextInt();
                            System.out.println("Enter laptop cetagory1 :");
                            s3 = a.nextLine();
                            System.out.println("Enter laptop model1 :");
                            s4 = a.nextLine();
                            System.out.println("Enter laptop price3 = ");
                            t3 = inn.nextInt();
                            e2=new laptop(s2,t1,s1,w1,t2,s3,s4,t3);
                            ee[n]=new laptop();
                            ee[n]=e2;
                            // pp[n]=e2;
                            p.add(e2);
                            list.add(s2);
                            break;

                        case 2:
                            int t4,t5,t6,w2;
                            String s5,s6,s7,s8;
                            Scanner a1= new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            s6=a1.nextLine();
                            System.out.println("Enter Mobile price = ");
                            t4 = inn.nextInt();
                            System.out.println("Enter Mobile model :");
                            s5 = a1.nextLine();
                            System.out.println("Enter Mobile Rent_Price for 30 days :");
                            w2 = inn.nextInt();
                            System.out.println("Enter Mobile price 2 :");
                            t5 = inn.nextInt();
                            System.out.println("Enter Mobile cetagory1 :");
                            s7 = a1.nextLine();
                            System.out.println("Enter Mobile model1 :");
                            s8 = a1.nextLine();
                            System.out.println("Enter Mobile price3 = ");
                            t6 = inn.nextInt();
                            e3=new mobile(s6,t4,s5,w2,t5,s7,s8,t6);
                            ee1[n]=new mobile();
                            ee1[n]=e3;
                            //p[n]=e3;
                            p.add(e3);
                            list.add(s6);
                            break;

                        case 3:
                            int t7,t8,t9,w3;
                            String s9,s10,s11,s12;
                            Scanner a2 = new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            s10=a2.nextLine();
                            System.out.println("Enter AC price = ");
                            t7 = inn.nextInt();
                            System.out.println("Enter AC model :");
                            s9 = a2.nextLine();
                            System.out.println("Enter AC  Rent_Price for 30 days :");
                            w3 = inn.nextInt();
                            System.out.println("Enter AC price 2 :");
                            t8 = inn.nextInt();
                            System.out.println("Enter AC cetagory1 :");
                            s11 = a2.nextLine();
                            System.out.println("Enter AC model1 :");
                            s12 = a2.nextLine();
                            System.out.println("Enter AC price3 = ");
                            t9 = inn.nextInt();
                            e4=new ac(s10,t7,s9,w3,t8,s11,s12,t9);
                            ee2[n]=new ac();
                            ee2[n]=e4;
                            //p[n]=e4;
                            p.add(e4);
                            list.add(s10);
                            break;
                    }

                    break;
                case 2:
                    Product v1=new Vehicle();
                    System.out.println("Enter 1 for bike");
                    System.out.println("Enter 2 for  car ");
                    int h1;
                    h1= inn.nextInt();
                    index2[n]=h1;
                    //j3++;
                    switch (h1)
                    {
                        case 1:
                            int q1,q2,q3,w4;
                            String d1,d2,d3,d4,d5;
                            Scanner a=new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            d2=a.nextLine();
                            System.out.println("Enter bike price = ");
                            q1= inn.nextInt();
                            System.out.println("Enter bike model :");
                            d1=a.nextLine();
                            System.out.println("Enter bike  Rent_Price for 30 days :");
                            w4=inn.nextInt();
                            System.out.println("Enter bike price 2 :");
                            q2=inn.nextInt();
                            System.out.println("Enter bike cetagory1 :");
                            d3=a.nextLine();
                            System.out.println("Enter bike model1 :");
                            d4=a.nextLine();
                            System.out.println("Enter bike price3 = ");
                            q3= inn.nextInt();
                            System.out.println("Enter bike model3 = ");
                            d5= a.nextLine();
                            b1=new bike(d2,q1,d1,w4,q2,d3,d4,q3,d5);
                            vv[n]=new bike();
                            vv[n]=b1;
                            // p[n]=b1;
                            p.add(b1);
                            list.add(d2);
                            break;
                        case 2:
                            int q4,q5,q6,w5;
                            String d6,d7,d8,d9,d10;
                            Scanner w1=new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            d7=w1.nextLine();
                            System.out.println("Enter car price = ");
                            q4= inn.nextInt();
                            System.out.println("Enter car model :");
                            d6=w1.nextLine();
                            System.out.println("Enter car  Rent_Price for 30 days :");
                            w5=inn.nextInt();
                            System.out.println("Enter car price 2 :");
                            q5=inn.nextInt();
                            System.out.println("Enter car cetagory1 :");
                            d8=w1.nextLine();
                            System.out.println("Enter car model1 :");
                            d9=w1.nextLine();
                            System.out.println("Enter car price3 = ");
                            q6= inn.nextInt();
                            System.out.println("Enter car model3 = ");
                            d10= w1.nextLine();
                            b2=new car(d7,q4,d6,w5,q5,d8,d9,q6,d10);
                            vv1[n]=new car();
                            vv1[n]=b2;
                            // p[n]=b2;
                            p.add(b2);
                            list.add(d7);
                            break;
                    }
                    break;
                case 3:
                    Product F1=new Furniture();
                    System.out.println("Enter 1 for Bed");
                    System.out.println("Enter 2 for Chair");
                    System.out.println("Enter 3 for Table");
                    int h2;
                    h2=inn.nextInt();
                    index3[n]=h2;
                    // j4++;
                    switch (h2)
                    {
                        case 1:
                            int z1,z2,z3,w6;
                            String x1,x2,x3,x4;
                            Scanner w1=new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            x2=w1.nextLine();
                            System.out.println("Enter Bed  price = ");
                            z1= inn.nextInt();
                            System.out.println("Enter Bed model :");
                            x1=w1.nextLine();
                            System.out.println("Enter Bed  Rent_Price for 30 days :");
                            w6=inn.nextInt();
                            System.out.println("Enter Bed price 2 :");
                            z2=inn.nextInt();
                            System.out.println("Enter Bed cetagory1 :");
                            x3=w1.nextLine();
                            System.out.println("Enter Bed price3 = ");
                            z3= inn.nextInt();
                            System.out.println("Enter Bed model3 = ");
                            x4= w1.nextLine();
                            f1=new bed(x2,z1,x1,w6,z2,x3,z3,x4);
                            ff[n]=new bed();
                            ff[n]=f1;
                            // p[n]=f1;
                            p.add(f1);
                            list.add(x2);
                            break;
                        case 2:
                            int z4,z5,z6,w7;
                            String x5,x6,x7,x8;
                            Scanner w2=new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            x6=w2.nextLine();
                            System.out.println("Enter Chair price = ");
                            z4= inn.nextInt();
                            System.out.println("Enter Chair model :");
                            x5=w2.nextLine();
                            System.out.println("Enter Chair  Rent_Price for 30 days :");
                            w7=inn.nextInt();
                            System.out.println("Enter Chair price 2 :");
                            z5=inn.nextInt();
                            System.out.println("Enter Chair cetagory1 :");
                            x7=w2.nextLine();
                            System.out.println("Enter Chair price3 = ");
                            z6= inn.nextInt();
                            System.out.println("Enter Chair model3 = ");
                            x8= w2.nextLine();
                            f2=new chair(x6,z4,x5,w7,z5,x7,z6,x8);
                            ff1[n]=new chair();
                            ff1[n]=f2;
                            // p[n]=f2;
                            p.add(f2);
                            list.add(x6);
                            break;
                        case 3:
                            table t;
                            int z7,z8,z9,w8;
                            String x9,x10,x11,x12;
                            Scanner w3=new Scanner(System.in);
                            System.out.println("Enter the Date in Format yy-mm-day :");
                            x10=w3.nextLine();
                            System.out.println("Enter Table price = ");
                            z7= inn.nextInt();
                            System.out.println("Enter Table model :");
                            x9=w3.nextLine();
                            System.out.println("Enter Table  Rent_Price for 30 days :");
                            w8=inn.nextInt();
                            System.out.println("Enter Table price 2 :");
                            z8=inn.nextInt();
                            System.out.println("Enter Table cetagory1 :");
                            x11=w3.nextLine();
                            System.out.println("Enter Table price3 = ");
                            z9= inn.nextInt();
                            System.out.println("Enter Table model3 = ");
                            x12= w3.nextLine();
                            f3=new table(x10,z7,x9,w8,z8,x11,z9,x12);
                            ff2[n]=new table();
                            ff2[n]=f3;
                            // p[n]=f3;
                            p.add(f3);
                            list.add(x10);
                            break;

                    }
                    break;
            }


            int j=n;
            int y;
            int f;

            System.out.println("enter -1 to exit :");
            int ssd = inn.nextInt();
            if (ssd == -1)
            {
                break;
            }
        }




    }
    public void Edit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number from 1 to the given size to Purchase that number item. "+p.size());
        int id;
        Scanner ii = new Scanner(System.in);
        id=s.nextInt();
        System.out.println("Enter the New Date in Format yy-mm-day :");
        String x10=ii.nextLine();
        p.get(id-1).setDate(x10); ;
        System.out.println("Enter the New Actual Price :");
        int np=s.nextInt();
        p.get(id-1).setPriceee(np);
        System.out.println("Enter the New Rent Price :");
        int nr=s.nextInt();
        p.get(id-1).setRent_Price(nr);
        System.out.println("Enter the New Manufacturing of Product :");
        String nm=ii.nextLine();
        p.get(id-1).setManufacturing(nm); ;
    }
    public void Delete()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number from 1 to the given size to Remove that number item :"+p.size());
        int id;
        Scanner ii = new Scanner(System.in);
        //System.out.println();
        id=ii.nextInt();
        p.remove(id-1);
    }




    static class inside
    {
        Post mn=new Post();

        Person m=new Person();

        void sorting()
        {

            Collections.sort(list);
            //  Collections.sort(Collections.emptyList());
        }
        void Displaypost()
        {

            for (int j1 = 0; j1 < Person.loop; j1++)
            {
                System.out.println("================================");
                System.out.println("Information about item "+(j1+1));
                System.out.println("================================");
                if(index[j1]==1)
                {
                    if(index1[j1]==1)
                    {
                        ee[j1].display();

                    }
                    else if (index1[j1]==2)
                    {

                        ee1[j1].display();

                    }
                    else if (index1[j1]==3)
                    {
                        ee2[j1].display();


                    }
                }
                else if (index[j1]==2)
                {
                    if(index2[j1]==1)
                    {

                        vv[j1].display();

                    }
                    else if (index2[j1]==2)
                    {

                        vv1[j1].display();

                    }

                }
                else if (index[j1]==3)
                {
                    if(index3[j1]==1)
                    {

                        ff[j1].display();

                    }
                    else if(index3[j1]==2)
                    {

                        ff1[j1].display();

                    }
                    else if (index3[j1]==3)
                    {

                        ff2[j1].display();

                    }

                }

            }
        }
        void Purchase()
        {
            System.out.println("Enter any number from 0 to the given size to Purchase that number item :");//p.size());
            int id;
            Scanner ii = new Scanner(System.in);
            //System.out.println();
            id=ii.nextInt();
            System.out.println("Your balance After Purchasing is "+ (100000-p.get(id).price));
            count+= p.get(id).price;
            p1.add(p.get(id));
            p.remove(id);

        }
        void Rent()
        {
            System.out.println("Enter any number from 0 to the given size to Purchase that number item.  ");
            int id;
            Scanner ii = new Scanner(System.in);
            id=ii.nextInt();
            System.out.println(p.size());
            System.out.println("Your balance After taking things on rent is "+(100000-p.get(id).Rent_Price));

        }
        public void displayneww()
        {
            for (int i = 0; i <Person.j ; i++)
            {
                System.out.println("Inforamtion of "+(i+1) +" sold product :");
                System.out.println(p1.get(i).date);
                System.out.println(p1.get(i).Rent_Price);
                System.out.println(p1.get(i).manufacturing);
                System.out.println(p1.get(i).price);

            }
        }
        void chat()
        {
            System.out.println("Give your one comment Feedback  :");
            Scanner s=new Scanner(System.in);
            String on=s.nextLine();
            mm=on;
        }
        void showcomment()
        {
            System.out.println("The comment on your post :");
            System.out.println(mm);
        }
        void replychat()
        {
            System.out.println("Give reply to the Comment :");
            Scanner s=new Scanner(System.in);
            String onn=s.nextLine();
            mm1=onn;
        }
        void showreplychat()
        {
            System.out.println("The Reply of your comment :");
            System.out.println(mm1);
        }



    }




}