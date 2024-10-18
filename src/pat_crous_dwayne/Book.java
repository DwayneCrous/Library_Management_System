/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat_crous_dwayne;

/**
 *
 * @author Dwayne
 */
public class Book {
    
    private String title;
    private String authorName; 
    private String authorSurname;
    private String country;
    private String ISBN;
    private int year;
    
    //Making the constructor
    public Book(String inTitle, String inAuthorName, String inAuthorSurname, String inCountry, String inISBN, int inYear)
    {
        title = inTitle;
        authorName = inAuthorName;
        authorSurname = inAuthorSurname;
        country = inCountry;
        year = inYear;
        ISBN = inISBN;
    }

    //Coding the getters and setters

    //Title (returns title of the book)
    public String getTitle()
    {
        return title;
    }

    //Passes in the new title from the user and sets previous title to new title
    public void setTitle(String inTitle)
    {
        title = inTitle;
    }
    
    //Author Name (returns author name)
    public String getAuthorName()
    {
        return authorName;
    }

    //Passes in the new author from the user and sets previous author name to new author
    public void setAuthorName(String inAuthorName)
    {
        authorName = inAuthorName;
    }

    //Author Surname (returns author surname) 
    public String getAuthorSurname()
    {
        return authorSurname;
    }

    //Passes in the new author surname from the user and sets previous author surname to new author surname
    public void setAuthorSurname(String inAuthorSurname)
    {
        authorSurname = inAuthorSurname;
    }

    //Country (returns the country)
    public String getCountry()
    {
        return country;
    }
    
    //Passes in the new country from the user and sets previous country to new country
    public void setCountry(String inCountry)
    {
        country = inCountry;
    }

    //ISBN (returns ISBN number)
    public String getISBN()
    {
        return ISBN;
    }

    //Passes in the new ISBN number from the user and sets previous ISBN to new ISBN
    public void setISBN(String inISBN)
    {
        ISBN = inISBN;
    }

    //Year (returns the year)
    public int getYear()
    {
        return year;
    }

    //Passes in the new year from the user and sets previous year to new year
    public void setYear(int inYear)
    {
        year = inYear;
    }
    
    private String padEnd(String str, int width)
    {
        int spaceRight = width - str.length();
        
        for (int i = 0; i < spaceRight; i++) {
            str += " ";
        }

        return str;
    }

    //returns string temp which has all of the read in information from the text file
    @Override
    public String toString()
    {
        String temp = padEnd(title, 52) + "\t" + padEnd(authorName, 10) + "\t" + padEnd(authorSurname, 10) + "\t" + padEnd(country, 22) + "\t" + padEnd(""+year, 4) + "\t" + padEnd(ISBN, 11) + "\n";
        return temp;

    }

}
