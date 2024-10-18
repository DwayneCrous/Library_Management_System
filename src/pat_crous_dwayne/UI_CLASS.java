/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pat_crous_dwayne;

/**
 *
 * @author Dwayne
 */
public class UI_CLASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instantiates the MANAGER_CLASS to use its methods
        MANAGER_CLASS libraryBooks = new MANAGER_CLASS();

        //Instantiates the Login class to use the login methods
        Login user = new Login("", "", "", "", "");

        //Prints out all of the books from the text file
        System.out.println(libraryBooks.toString());

    }

}
