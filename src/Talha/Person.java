package Talha;



import java.util.Scanner;

public class Person
{
  static public int j;

    public String name;
    private String id;

    public int size;
    public Post []p;
    private int password;
    public static int loop=0;

    public Person(String name, String id, int password)
    {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public Person()
    {

    }
    public Person(final int size)
    {
        this.size=size;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getPassword()
    {
        return password;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }
    public void setSize(int size)
    {
        this.size = size;

    }

    public int getSize()
    {
        return size;
    }

    public void setP(Post[] pp)
    {
        p=new Post[size];
        int sl;
        for (sl = 0; sl < size; sl++)
        {
            p[sl]=pp[sl];
        }

    }





    public void decision ()
    {
        float selblnc;
        System.out.println("==========================================================");
        System.out.println("    Please Press the key to Show your Functionality:");
        System.out.println("=========================================================");
        System.out.println("Enter 1 for seller");
        System.out.println("Enter 2 for buyer");
        System.out.println("Enter 3 for rental");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1)
        {
            Post p = new Post();
            System.out.println("================================================");
            System.out.println("        Now you are in the Seller Pannel :");
            System.out.println("================================================");
            Account a=new Account(0);
            //a.displayblnc();
            System.out.println("Are you want to see your account Information :");
            System.out.println("Enter 1 for yes :");
            System.out.println("Enter 0 for no  :");
            int n2=input.nextInt();
            if(n2==1)
            {
                System.out.println("=================================================");
                System.out.println("DIGITAL SLIP");
                a.displayblnc();
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("Information about your Posts :");
                Post.inside ab=new Post.inside();
                ab.Displaypost();
                System.out.println("=================================================");
                System.out.println("Comment on your Post :");
                ab.showcomment();
                Scanner nm=new Scanner(System.in);
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("Are you want to reply the comment :");
                System.out.println("Enter 1 for yes :");
                System.out.println("Enter 0 for no  :");
                int v=nm.nextInt();
                if (v==1)
                {
                    System.out.println("=================================================");
                    ab.replychat();
                    System.out.println("=================================================");

                } else if (v==0)
                {

                }

                System.out.println("=================================================");
                System.out.println("After Selling Products  Your account has balance "+a.incrementbalance(p.count));

            } else if (n2==0)
            {

            }
            System.out.println("=================================================");
            System.out.println("Are you want to Post some Products :");
            System.out.println("Enter 1 for yes :");
            System.out.println("Enter 0 for no  :");
            int n3=input.nextInt();
            if(n3==1)
            {

                System.out.println("**************************************************");
                System.out.println("=================================================");
                System.out.println("How many products you want to sell :");
                System.out.println("=================================================");
                System.out.println("**************************************************");
                int n1 = input.nextInt();
                //p;
                //loop+=p.s;
                loop+=n1;
                p.s= n1;
                Product[] aaa = new Product[p.s];
                p.setAr(aaa);
                p.postproduct();
                Scanner s=new Scanner(System.in);
                System.out.println("=================================================");
                System.out.println("Are you want to Edit the Product :");
                System.out.println("=================================================");
                System.out.println("Enter 1 for yes :");
                System.out.println("Enter 0 for No  :");
                int n4=s.nextInt();
                if(n4==1)
                {
                    System.out.println("=================================================");
                    p.Edit();
                } else if (n4==0)
                {
                    System.out.println("All the Products Are Retained :");
                }
                System.out.println("Are you want to Delete the Product :");
                System.out.println("Enter 1 for yes :");
                System.out.println("Enter 0 for No  :");
                int n5=s.nextInt();
                if(n5==1)
                {
                    p.Delete();
                } else if (n4==0)
                {
                    System.out.println("All the Products Are Retained :");
                }
            }
            else if (n3==0)
            {

            }
            System.out.println("Are you want to see your account Information  and information about your posts:");
            System.out.println("Enter 1 for yes :");
            System.out.println("Enter 0 for no  :");
            int n7=input.nextInt();
            if(n7==1)
            {
                System.out.println("Information about your Posts :");
                Post.inside ab=new Post.inside();
                ab.sorting();
                ab.Displaypost();
                System.out.println("Comment on your Post :");
                ab.showcomment();
                System.out.println("        Information about your account           :");
                System.out.println("DIGITAL SLIP");
                a.displayblnc();
                System.out.println("After Selling Products  Your account has balance "+a.incrementbalance(p.count));

            } else if (n2==0)
            {

            }


        }
        else if (n == 2)
        {
            System.out.println("===============================================");
            System.out.println("          Now you are in buyer panel");
            System.out.println("================================================");
            Scanner ii = new Scanner(System.in);
            Post r=new Post();
            Post pp=new Post();
            Post.inside ab=new Post.inside();
            ab.Displaypost();
            Account a1=new Account(100000);
           // System.out.print("Your Account has Current Balance :");
            a1.displayblnc();
            Scanner l=new Scanner(System.in);
            System.out.println("=================================================");
            System.out.println("Are you want to purchase any Product :");
            System.out.println("Enter 1 for yes :");
            System.out.println("Enter 0 for No  :");
            int ap=l.nextInt();
            if(ap==1) {
                System.out.println("=================================================");
                System.out.println("How many Products you want to Purchase :");
                System.out.println("=================================================");
                 j = ii.nextInt();
                for (int i = 0; i < j; i++) {
                    Scanner s = new Scanner(System.in);
                    System.out.println("=================================================");
                    System.out.println("Are you want to comment on any post :");
                    System.out.println("Enter 1 for yes :");
                    System.out.println("Enter 0 for no  :");
                    int m = s.nextInt();
                    if (m == 1) {
                        System.out.println("=================================================");
                        ab.chat();
                    } else if (m == 0)
                    {

                    }
                    ab.Purchase();
                    System.out.println("Sold products are :");
                    ab.displayneww();
                    System.out.println("=================================================");
                    System.out.println("Your Account Balance after Buying Products :");
                    a1.displayblnc();
                    System.out.println("=================================================");
                    System.out.println("=================================================");
                    System.out.println("The reply of your chat :");
                    ab.showreplychat();
                }
            }










        } else if (n==3)
        {
            System.out.println("===============================================");
            System.out.println("          Now you are in Rental panel");
            System.out.println("================================================");
            Scanner ii = new Scanner(System.in);
            Post r=new Post();
            Post pp=new Post();
            Post.inside ab=new Post.inside();
            ab.Displaypost();
            Account a2=new Account(100000);
            System.out.print("Your Account has Current Balance :");
            a2.displayblnc();
            Scanner np=new Scanner(System.in);
            System.out.println("Are you want to take any Product on Rent :");
            System.out.println("Enter 1 for yes :");
            System.out.println("Enter 0 for No  :");
            int op=np.nextInt();
            if(op==1) {
                System.out.println("How many Products you want to take on Rent  :");
                int j = ii.nextInt();
                for (int i = 0; i < j; i++) {
                    Scanner sss = new Scanner(System.in);
                    System.out.println("Are you want to comment on any post :");
                    System.out.println("Enter 1 for yes :");
                    System.out.println("Enter 0 for no  :");
                    int m = sss.nextInt();
                    if (m == 1) {
                        ab.chat();
                    } else if (m == 0) {

                    }
                    ab.Rent();
                }
            } else if (op==0)
            {
                System.out.println("Your Account Balance after Take Rent is :");
                a2.displayblnc();
                System.out.println("Reply of your Chat :");
                ab.showreplychat();

            }


        }

    }



}