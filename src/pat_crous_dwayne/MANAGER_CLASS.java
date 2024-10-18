/*
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat_crous_dwayne;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Dwayne
 */

public class MANAGER_CLASS {

    private Book bookArr[] = new Book[1000];
    private int size = 0;

    //constructor for manager class to read in data from the library books text file
    public MANAGER_CLASS()
    {

        try {

            Scanner scFile = new Scanner(new File("LillyLibraryBOOKS.txt"));
            
            while (scFile.hasNext()) {
                
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("%");

                String title = scLine.next();
                String authorName = scLine.next();
                String authorSurname = scLine.next();
                int year = scLine.nextInt();
                String country = scLine.next();
                String ISBN = scLine.next();

                //adding a new book object into the array
                bookArr[size] = new Book(title, authorName, authorSurname, country, ISBN, year);
                size++;

                scLine.close();
            }
            scFile.close();

        } catch (FileNotFoundException n) {

            System.out.println("File was not found.");
            System.out.println("Error: " + n);

        }

    }

    //method for sorting the title in alphabetical order
    public void sortTitle()
    {

        for(int i = 0; i < size - 1; i++)
        {

            for(int j = i + 1; j < size; j++)
            {

                if (bookArr[i].getTitle().compareToIgnoreCase(bookArr[j].getTitle()) > 0) 
                {
                    Book temp = bookArr[i];
                    bookArr[i] = bookArr[j];
                    bookArr[j] = temp;
                }

            }

        }

    }

    //method for sorting the authors name in alphabetical order
    public void sortAuthor()
    {

        for(int i = 0; i < size - 1; i++)
        {

            for(int j = i + 1; j < size; j++)
            {

                if (bookArr[i].getAuthorName().compareToIgnoreCase(bookArr[j].getAuthorName()) > 0)
                {
                    Book temp = bookArr[i];
                    bookArr[i] = bookArr[j];
                    bookArr[j] = temp;
                }

            }

        }

    }

    //method for shifting a book objects postition one place to the right in the array
    public void shiftRight(int position, Book newBook)
    {

        for(int i = size; i > position; i--)
        {
            bookArr[i] = bookArr[i - 1];
        }

        bookArr[position] = newBook;
        size++;

    }

    //method for inserting a book into the system
    //the file name gets placed in so that the program knows where to save the new books data
    public void inputBook(String fileName)
    {

        boolean confirmed = false;
        String title;
        String authorName;
        String authorSurname; 
        String country;
        String ISBN;
        int year;

        while (!confirmed) 
        {
            
            title = JOptionPane.showInputDialog("Enter the title of the book:");
            authorName = JOptionPane.showInputDialog("Enter the author's first name:");
            authorSurname = JOptionPane.showInputDialog("Enter the author's surname:");
            year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year it was published:"));
            country = JOptionPane.showInputDialog("Enter the country where it was published:");
            ISBN = JOptionPane.showInputDialog("Enter the ISBN of the book:");

            String bookDetails = title + ", " + authorName + " " + authorSurname + ", (" + year + "), " + country + ", [" + ISBN + "]"; //these are the details that the user sees
            String bookDetailsForTextFile = title + "%" + authorName + "%" + authorSurname + "%" + year + "%" + country + "%" + ISBN; //these are the details that gets written to the text file
            
            //I found a yes no option for the confirm dialog and it came in pretty handy so that the user doesnt have to type yes or no, they can just click one button
            int response = JOptionPane.showConfirmDialog(null, "Book details:\n" + bookDetails + "\nAre the details correct?", "Confirm Book Details", JOptionPane.YES_NO_OPTION);

            if(response == JOptionPane.YES_OPTION)
            {
                confirmed = true;

                Book newBook = new Book(title, authorName, authorSurname, country, ISBN, year);
                bookArr[size] = newBook;
                size++;

                try {
                
                    FileWriter writer = new FileWriter(fileName, true);
                    writer.append(bookDetailsForTextFile + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Book Details saved.");
    
                } catch (IOException ex) {
                    
                    System.out.println("Error: " + ex);
    
                }

            } else {

                System.out.println("Whoops! Wrong details were entered, please try again.");

            }

        }

    }

    //searching the index position for the title in the text file
    public int searchPositionTitle(String title)
    {

        for(int i = 0; i < size; i++)
        {

            if (title.equalsIgnoreCase(bookArr[i].getTitle())) 
            {
                return i;
            }

        }

        return -1;

    }
    
    //searching the index position for the ISBN in the text file
    public int searchPositionISBN(String ISBN)
    {

        for(int i = 0; i < size; i++)
        {

            if(ISBN.equalsIgnoreCase(bookArr[i].getISBN()))
            {
                return i;
            }

        }

        return -1;

    }

    //method to calculate the fine and return the fine amount
    public double Fine()
    {
        int randomNum = (int) (Math.random() * 10) + 1;
        String askForEFT = JOptionPane.showInputDialog("Do you want to use EFT?\nYes | No");
        double rate = 0;

        if (randomNum == 1) {
            rate = 2.50;
        } else if (randomNum == 2) {
            rate = 3.00;
        } else if (randomNum == 3) {
            rate = 3.50;
        } else if (randomNum == 4) {
            rate = 4.00;
        } else if (randomNum > 4) {
            rate = 5.00;
        }

        double fine = randomNum * rate;

        if (askForEFT.equalsIgnoreCase("Yes")) {
            fine += 3.50;
        }

        return fine;
    }

    //method to validate the ISBN
    //it returns true or false wether the ISBN was valid
    public boolean ValidateISBN(String ISBN)
    {
        String numWithoutHyphens = "";

        for (int i = 0; i < ISBN.length(); i++) 
        {
            char digitChar = ISBN.charAt(i);

            if (digitChar != '-') 
            {
                numWithoutHyphens += digitChar; 
            }
        }

        if (numWithoutHyphens.length() != 10)
        {
            return false;
        }

        int sum = 0;
        int weight = 10;

        for (int i = 0; i < 9; i++) 
        {
            char digitChar = numWithoutHyphens.charAt(i);

            if (digitChar < '0' || digitChar > '9') 
            {
                return false;
            }

            int digit = digitChar - '0';
            sum += digit * weight;
            weight--;
        }

        char checkDigitChar = numWithoutHyphens.charAt(9);
        int checkDigit;

        if (checkDigitChar == 'X')
        {
            checkDigit = 10;
        } else if (checkDigitChar >= '0' && checkDigitChar <= '9') 
        {
            checkDigit = checkDigitChar - '0';
        } else 
        {
            return false;
        }

        sum += checkDigit;
        System.out.println("Sum: " + sum);

        if(sum % 11 == 0)
        {
            return true;

        } else 
        {
            return false;
        }
    }

    //toString to print out all of the information in the text file
    //works along with the toString in the Book class to format the data
    @Override
    public String toString() 
    {
        String temp = "";

        for(int i = 0; i < size; i++)
        {
            
            temp += bookArr[i].toString();

        }

        return temp;
    }
    
}
