
/**
 * This program will tell the price of a ticket based on the age and city of birth inputed by the user.
 *
 * @author Esther Mosaku
 * @version 27th September, 2024.
 */
import java.util.Scanner;
import java.text.NumberFormat; //This method is to import the package for the dollar currency.
public class Ticket2{
   public static void main(String[] args){
       String city; 
       String discountcity="Tacoma"; //This string is declaring "Tacoma" as the value for the discountcity.
       final int FULLTICKET=40; 
       int age;
       double discount=(double)40-(0.5*40); //The calculation for the 50% discount for being 65+ in age.
       double citydiscount=(double)FULLTICKET-(0.1*40); //The calculation for extra 10% citydiscount for being between the age of 12 and 65.
       double citydiscount65plus=(double)20-(0.1*40); //The calculation for the extra 10% citydiscount for being 65+ in age.
       
       Scanner scan=new Scanner(System.in);
       NumberFormat fmt=NumberFormat.getCurrencyInstance(); //Declaration of the currency method.
       
       System.out.println("This program will ask you for age and city of birth respectively to get the price of the ticket for you. "+
       "Please follow the instructions and answer truthfully.");
       
       System.out.println("Please input your age(in numbers):");
       age=scan.nextInt();
       
       if(age<=12 && age>=0){
            System.out.println("You get free admission!You will not be paying any money for the ticket.");
                  }
            
            else if(age>=65 && age<=100){
            System.out.println("You get a 50% discount. Therefore instead of paying "+fmt.format(FULLTICKET)+", you will be paying "+fmt.format(discount)+".");
       //The above statement prints out a 50% discount of the full price ticket because the user is 65+ in age.
       System.out.println("Please enter your city of birth");
       scan.nextLine(); //This allows the user to type in their city of birth.
       
       while(true){ 
          city=scan.nextLine();
          
          if(city.equalsIgnoreCase(discountcity))
          System.out.println("You get an extra city discount of 10%.Therefore, the total amount for your ticket is: "+fmt.format(citydiscount65plus)+".");
              else
              System.out.println("Sorry. You do not qualify for the extra city discount.Therefore, the price of your ticket is: "+fmt.format(discount)+".");
        break;    } //Based on the input of the user, they get an extra 10% discount if Tacoma is typed in and none for anything otherwise.
                            }
            else if(age>12 && age<65){
            System.out.println("You will have to pay the full price of "+ fmt.format(FULLTICKET)+".");
       System.out.println("Please enter your city of birth");
       scan.nextLine(); //This allows the user to type in their city of birth.
       
       while(true){
          city=scan.nextLine();
          
          if(city.equalsIgnoreCase(discountcity))
          System.out.println("You get an extra city discount of 10%.Therefore, the total amount for your ticket is: "+fmt.format(citydiscount)+".");
              else
              System.out.println("Sorry. You do not qualify for the extra city discount. Therefore, the total price of your ticket is: "+fmt.format(FULLTICKET)+".");
        break;
                  } //Based on the input of the user, they get an extra 10% discount if Tacoma is typed in and none for anything otherwise.
       }
       }  
    }

