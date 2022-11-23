package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.AddressBookTest.IOService.FILE_IO;

public class AddressBookTest
{
public enum IOService
{
    CONSOLE_IO,FILE_IO,DATABASE_IO
}

String FILE_PATH = "C:\\Users\\user\\Desktop\\bridgelabz\\Day37IOStream\\src\\main\\java\\com\\bridgelabz\\AddressBook.txt";

void writeFile()
{
    System.out.println(FILE_IO.getClass());
    System.out.println(addressBookList+FILE_PATH);

}
private List<AddressBook> addressBookList;

public AddressBookTest() {}
    public AddressBookTest(List<AddressBook> addressBookList)
    {
        this.addressBookList = addressBookList;
    }

    public static void main(String[] args)
    {
        ArrayList<AddressBook> addressBookArrayList = new ArrayList<>();
        AddressBookTest addressBookTest = new AddressBookTest(addressBookArrayList);
        Scanner consoleInputReader = new Scanner(System.in);
        addressBookTest.readAddressBookData(consoleInputReader);
        addressBookTest.writeAddressBookData();
        addressBookTest.writeFile();
    }

    private void readAddressBookData(Scanner consoleInputReader)
    {
        System.out.print(" Person Contact Name : ");
        String name = consoleInputReader.next();
        System.out.print(" Age : ");
        int age = consoleInputReader.nextInt();
        System.out.print(" City : ");
        String city = consoleInputReader.next();
        System.out.print(" Zip-Code : ");
        int zipCode = consoleInputReader.nextInt();
        addressBookList.add(new AddressBook(name,age,city,zipCode));

    }
    private void writeAddressBookData()
    {
        System.out.println("Write Address Book List : \n"+addressBookList);
    }

}
