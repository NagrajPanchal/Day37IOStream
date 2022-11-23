package com.bridgelabz;

public class AddressBook
{


    private final String name;
    private final int age;
    private final String city;
    private final int zipCode;

    public AddressBook(String name, int age, String city, int zipCode) 
    {
    this.name = name;
    this.age = age;
    this.city = city;
    this.zipCode = zipCode;
    }

    @Override
    public String toString()
    {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
