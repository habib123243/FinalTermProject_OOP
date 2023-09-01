import  java.util.Scanner;

import Talha.Post;
import Talha.Person;
import Talha.Login;

import javax.sound.midi.Soundbank;


public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person();
        Post p1 = new Post();
        Login[] ll = new Login[100];
        Login nn=new Login();
        int f = 0;
        int j = 0;
        char c;
        Login l22;
        int i=0;
        System.out.println("                                                        ******************");
        System.out.println("                                                        ==================");
        System.out.println("                                                        DIGITAL BAZAAR");
        System.out.println("                                                        ==================");
        System.out.println("                                                        ******************");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter S to Start the program :");
        System.out.println("");
        Scanner c1 = new Scanner(System.in);
        c = c1.next().charAt(0);
        char x = 0,O=0;
        do {
            while (c == 'S')
            {

                   /* System.out.println("Enter L to Login the account  :");
                    char  L = c1.next().charAt(0);*/
                //  while (L=='L') {


                System.out.println("Kindly Enter the correct Information :");
                System.out.println("====================");
                System.out.println("Login your account :");
                System.out.println("=====================");
                // Login nn = new Login();
                System.out.println("Enter your unique id :");
                Scanner w = new Scanner(System.in);
                Scanner w1 = new Scanner(System.in);
                nn.id = w.nextInt();
                System.out.println("Enter your Password :");
                nn.password = w1.nextLine();
                l22 = new Login(nn.id, nn.password);
                for (i = 0; i < j; i++) {
                    if (ll[i].id == l22.id && ll[i].password.equals(l22.password)) {
                        f = 1;
                        break;
                    } else if (ll[i].id != l22.id && !ll[i].password.equals(l22.password)) {
                        f = 0;
                    }
                }
                if (f == 1) {
                    System.out.println("Successfully Login :");
                    p.decision();
                    Post[] aa = new Post[p1.s];
                    p.setP(aa);

                } else if (f == 0) {
                    System.out.println("Id Not found :");
                }


                System.out.println("==================================");
                System.out.println("Enter  C to create a new Account  :");
                System.out.println("===================================");
                char s1, s;
                Scanner mm = new Scanner(System.in);
                s = mm.next().charAt(0);
                if (s == 'C')
                {
                    while (s == 'C')
                    {

                        // Login LL = new Login();
                        Scanner ss = new Scanner(System.in);
                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter the id number :");
                        nn.id = input.nextInt();
                        System.out.println("Enter the Name :");
                        nn.name = ss.nextLine();
                        System.out.println("Enter the Password :");
                        nn.password = ss.nextLine();
                        Login l1 = new Login(nn.id, nn.password);
                        ll[j] = new Login();
                        ll[j] = l1;
                        j++;
                        char k;
                        Scanner z=new Scanner(System.in);
                        System.out.println("Enter F to exit the loop :");
                        k=z.next().charAt(0);
                        if(k=='F')
                        {
                            break;
                        }


                    }
                }

                do {
                    System.out.println("Kindly Enter the correct Information :");
                    System.out.println("====================");
                    System.out.println("Login your account :");
                    System.out.println("=====================");
                    System.out.println("Enter your unique id :");
                    Scanner www=new Scanner(System.in);
                    Scanner www1=new Scanner(System.in);
                    // Login nn=new Login();
                    nn.id = www.nextInt();
                    System.out.println("Enter your Password :");
                    nn.password = www1.nextLine();
                    l22 = new Login(nn.id, nn.password);
                    for ( i = 0; i < j; i++)
                    {
                        if (ll[i].id == l22.id && ll[i].password.equals(l22.password))
                        {
                            f = 1;
                            break;
                        } else if (ll[i].id != l22.id && !ll[i].password.equals(l22.password))
                        {
                            f = 0;
                        }
                    }
                }while(f==0);

                if (f == 1)
                {
                    System.out.println("Successfully Login :");
                    p.decision();
                    Post[] aa = new Post[p1.s];
                    p.setP(aa);
                }
                else if (f == 0)
                {
                    System.out.println("Id Not found :");
                }
                {
                    System.out.println("Enter E to signup: or press any other key to exit whole program");
                    Scanner c11 = new Scanner(System.in);
                    x = c11.next().charAt(0);

                }


            }

        } while (x == 'E');



    }


}