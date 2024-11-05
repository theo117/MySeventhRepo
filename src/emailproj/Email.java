/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailproj;

import java.util.Scanner;

/**
 *
 * @author Latitude 7480
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";
    
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
   System.out.println("Email created: " + this.firstName + " " + this.lastName);
    
    this.department = setDepartment(); 
    //System.out.println("Deparment: " + this.department);
    
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: " + this.password);
    
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
  // System.out.println("Your email is: " + email);
}
    
   private String setDepartment(){
       System.out.println("Enter department:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for None\n Enter department code:");
       Scanner in = new Scanner(System.in);
        int dptChoice = in.nextInt();
       
       if (dptChoice == 1){ return "sales";}
          
       else if (dptChoice == 2){return "development";}
       
       else if (dptChoice == 3){ return "accounting";}
      
       else if (dptChoice == 0){ return "";}
        return null;
       
   }
   
        
   
   private String randomPassword(int length){
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
       char[] password = new char [length];
       
       for(int i=0; i<length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password [i] = passwordSet.charAt(rand);
           
       }
       return new String (password);
   }
   
   public void setMailboxCapacity(int capacity){
this.mailboxCapacity = capacity;
 }
   
   public void setAlternateEmail(String altEmail){
this.alternateEmail = altEmail;
}
   
   public void setPassword(String password){
       this.password = password;
   }
public int getMailboxCapacity(){return mailboxCapacity ;}
public String getAlternateEmail(){return alternateEmail;}
public String getPassword(){return password;}

public String showInfo(){
    return "Display name:" + firstName + " " + lastName + "\n" + "Email address:" + email + "\n"+ "Mailbox Capaciry:" + mailboxCapacity + "mb";
            
}

}
        



