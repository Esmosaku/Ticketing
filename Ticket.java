
/**
 * The program will display the ticket price based on the age of the visitor inputed.
 * @author Esther Mosaku
 * @version 26th September, 2024.
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class Ticket{
    public static void main(String[] args){
        final int FULLTICKET=40;
        int age;
        Scanner scan=new Scanner(System.in);
        System.out.println("This program allows you to enter your age and presents the price of the ticket based on your input. "+
        "Please follow the instruction below.");
        
        System.out.println("Please enter your age below:");
        age=scan.nextInt();
        double discount=(double)40-(0.5*40);
        NumberFormat fmt=NumberFormat.getCurrencyInstance();
        
        if(age<=12)
            System.out.println("You get free admission!You will not be paying any money for the ticket.");
            else if(age>=65)
            System.out.println("You get a 50% discount. Therefore instead of paying "+fmt.format(FULLTICKET)+", you will be paying "+fmt.format(discount));
                else if(age>12 && age<65)
                System.out.println("You will have to pay the full price of "+ fmt.format(FULLTICKET));
                
        
        
    }
}
