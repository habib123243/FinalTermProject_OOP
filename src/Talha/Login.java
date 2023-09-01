package Talha;

import java.util.Scanner;

public class Login
{
    public int id;
    public String  name;
    public String password;
    public Login()
    {

    }

    public Login(int id)
    {
        this.id = id;
    }

    public Login(int id, String password)
    {
        this.id = id;
        this.password = password;
    }

    public Login(int id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }



}