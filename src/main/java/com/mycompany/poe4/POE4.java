package com.mycompany.poe4;


import static com.mycompany.poe4.POE4.UserRegistrationLogin.addTasks;
import static com.mycompany.poe4.POE4.UserRegistrationLogin.loginUser;
import static com.mycompany.poe4.POE4.UserRegistrationLogin.registerUser;
import static com.mycompany.poe4.POE4.UserRegistrationLogin.returnLoginStatus;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;




public class POE4 {
    public static void main(String[] args) {
        // Registration process
        String firstName = JOptionPane.showInputDialog("Hi :) Please enter your first name:");
        String lastName = JOptionPane.showInputDialog("Please enter your last name:");
        String username = JOptionPane.showInputDialog ("Please enter a username that you want to use(must contain an underscore and be no longer than five characters):");
        String password = JOptionPane.showInputDialog("Please enter a password (must be at least 8 characters long and contain a capital letter, a number, and a special character):");
        
        String registrationMessage = registerUser(username, password);
        JOptionPane.showMessageDialog(null, registrationMessage);

        if (registrationMessage.contains("successfully captured")) {
            // Login process
            String inputUsername = JOptionPane.showInputDialog("Please enter your username to login");
            String inputPassword = JOptionPane.showInputDialog("Please enter your password to login:");
           
            boolean isLoggedIn = loginUser(inputUsername, inputPassword, username, password);
            String loginStatus = returnLoginStatus(isLoggedIn, firstName, lastName);
            JOptionPane.showMessageDialog(null, loginStatus);

            if (isLoggedIn) {
                JOptionPane.showMessageDialog(null, "Hey there! :)Welcome to EasyKanban!");
                boolean quit = false;

                while (!quit) {
                    String option = JOptionPane.showInputDialog("Please choose an option below: \n1. Add tasks\n2. Show report\n3. Quit");

                    switch (option) {
                        case "1" -> addTasks();
                        case "2" -> JOptionPane.showMessageDialog(null, "Coming Soon!");
                        case "3" -> quit = true;
                        default -> JOptionPane.showMessageDialog(null, "Invalid option :( Please choose again.");
                    }
                }
            }
        }
    }

public class UserRegistrationLogin {

    private static List<Task4> tasks = new ArrayList<>();
    private static int taskNumber = 0;
    private static int totalHours = 0;

    // Method to check if the username meets the criteria
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to check if the password meets the complexity criteria
    public static boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            else if (Character.isDigit(c)) hasNumber = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
        }

        return hasUpperCase && hasNumber && hasSpecialChar;
    }

    // Method to register user
    public static String registerUser(String username, String password) {
        while (!checkUserName(username)) {
            username = JOptionPane.showInputDialog("Username is not correctly formatted :( Please ensure that your username contains an underscore and is no more than 5 characters in length.\nEnter username:");
        }

        while (!checkPasswordComplexity(password)) {
            password = JOptionPane.showInputDialog("Password is not correctly formatted :( please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.\nEnter password:");
        }

        return "Username successfully captured :) \nPassword successfully captured :)";
    }

    // Method to login user
    public static boolean loginUser(String inputUsername, String inputPassword, String storedUsername, String storedPassword) {
        while (!inputUsername.equals(storedUsername)) {
            inputUsername = JOptionPane.showInputDialog("Username incorrect, please try again.\nEnter username:");
        }

        while (!inputPassword.equals(storedPassword)) {
            inputPassword = JOptionPane.showInputDialog("Password incorrect, please try again.\nEnter password:");
        }

        return true;
    }

    // Method to return login status
    public static String returnLoginStatus(boolean isLoggedIn, String firstName, String lastName) {
        if (isLoggedIn) {
            return "Welcome! " + firstName + " " + lastName + ":) it is great to see you again ;-)";
        } else {
            return "Username or password incorrect, please try again!";
        }
    }

    public static void addTasks() {
        int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to add?"));
        for (int i = 0; i < numberOfTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Please enter a name for your task:");
            String taskDescription = JOptionPane.showInputDialog("Please enter a task description (less than 50 characters):");

            if (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                i--;
                continue;
            } else {
                JOptionPane.showMessageDialog(null, "Task successfully captured!");
            }

            String developerDetails = JOptionPane.showInputDialog("Please enter the developer's details (First and last name):");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration (in hours):"));
                   totalHours += taskDuration;
            String taskStatus = JOptionPane.showInputDialog("Please enter status of the task (To Do, Done, Doing):");

            String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" +
                    developerDetails.substring(developerDetails.length() - 3).toUpperCase();

            tasks.add(new Task4(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus));
            taskNumber++;
            //Displaythe details of the task
            String taskDetails = "Task status: " + taskStatus + 
                    "\nDeveloper Details: " + developerDetails + 
                    "\nTask Number: " + taskNumber + 
                    "\nTask Name: " + taskName + 
                    "\nTask Description: " + taskDescription + 
                    "\nTask ID: " + taskID + 
                    "\nTask Duration: " + taskDuration ;
            JOptionPane.showMessageDialog( null, taskDetails);
        }
        //display the total number of hours
        JOptionPane.showMessageDialog( null, "The total number of hours used during each task is: " + totalHours);
    }

   
}
}
                    
                
    

