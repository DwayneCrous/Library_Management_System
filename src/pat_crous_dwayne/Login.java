package pat_crous_dwayne;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {

    private String userName;
    private String password;
    private String confirmPassword;
    private String loginUserName;
    private String loginPassword;
    
    //Coding constructor
    public Login(String inUserName, String inPassword, String inConfirmPassword, String inLoginUserName, String inLoginPassword) {
        userName = inUserName;
        password = inPassword;
        confirmPassword = inConfirmPassword;
        loginUserName = inLoginUserName;
        loginPassword = inLoginPassword;
    }

    // Username (returns username)
    public String getUserName() {
        return userName;
    }

    //Passes in the new username from the user and sets username title to new username
    public void setUserName(String inUserName) {
        userName = inUserName;
    }

    // Password (returns password)
    public String getPassword() {
        return password;
    }

    //Passes in the new password from the user and sets previous password to new password
    public void setPassword(String inPassword) {
        password = inPassword;
    }

    // Confirm Password (returns the confirmed password)
    public String getConfirmPassword() {
        return confirmPassword;
    }

    //Passes in the new confirmed password from the user and sets previous confirmed password to new confirmed password
    public void setConfirmPassword(String inConfirmPassword) {
        confirmPassword = inConfirmPassword;
    }

    //returns login username
    public String getLoginUserName() {
        return loginUserName;
    }

    //writes all of the users details to a text file when they first sign up
    public void writeUserDetailsToFile() {
        try {
            FileWriter userDetails = new FileWriter("userDetails.txt", true);

            if (password.equals(confirmPassword)) {
                userDetails.append(userName + "%" + password + "\n");
                JOptionPane.showMessageDialog(null, "Account created successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to create account :(");
            }

            userDetails.close();

        } catch (IOException ex) {

            System.out.println("Error: " + ex);
        }

    }

    //when a user tries to login, then it will read all of the information and find the correct users data to give them access to their account
    public boolean login() {
        try {

            Scanner scFile = new Scanner(new File("userDetails.txt"));

            while (scFile.hasNextLine()) {
                String scLine = scFile.nextLine();
                String[] userDetails = scLine.split("%");

                if (userDetails.length == 2) {
                    String fileUserName = userDetails[0];
                    String filePassword = userDetails[1];

                    if (fileUserName.equals(loginUserName) && filePassword.equals(loginPassword)) {
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        userName = fileUserName;
                        scFile.close();
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed :(");
                        return false;
                    }
                }
            }
            scFile.close();

        } catch (FileNotFoundException n) {

            System.out.println("File was not found: " + n);
            JOptionPane.showMessageDialog(null, "No User Data Found on the System :(" + "\n   Make sure you have an account");

        }
        return false;
    }

    //This method decides weather the user entered the correct data and only if the details are correct then they can enter to the software
    public void userDecision() {
        String decision = JOptionPane.showInputDialog("Do you have an existing account? \nYes|No");

        if (decision.equalsIgnoreCase("Yes")) {
            if (login()) {
                System.out.println("Welcome back " + userName);
            } else {
                System.out.println("Login failed, please try again.");
            }
        } else if (decision.equalsIgnoreCase("No")) {
            userName = JOptionPane.showInputDialog("Enter your new username:");
            password = JOptionPane.showInputDialog("Enter your new password:");
            writeUserDetailsToFile();
            System.out.println("Account created successfully");
        } else {
            System.out.println("Invalid input, options are Yes or No");
            userDecision();
        }
    }

    //This is another toString that returns the username and password
    @Override
    public String toString() {
        return "Username: " + userName + ", Password: " + password;
    }

}