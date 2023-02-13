import java.util.Scanner;

public class Mingma{


    public static void main(String[] args){
        String name, state, zipCode, country, mobNum, email;

        //input
        Scanner usrInputs = new Scanner(System.in);
        System.out.print("Enter name of the organization:");
        name = usrInputs.nextLine();
        System.out.println("Address--");
        System.out.print("Enter State:");
        state = usrInputs.nextLine();
        System.out.print("Enter Zip Code:");
        zipCode = usrInputs.nextLine();
        System.out.print("Enter Country:");
        country = usrInputs.nextLine();
        System.out.print("Enter mobile number:");
        mobNum = usrInputs.nextLine();
        System.out.print("Enter email:");
        email = usrInputs.nextLine();

        //output
        System.out.println(" ");
        System.out.println("Name of the organization: " + name);
        System.out.println(" ");
        System.out.println("Address:");
        System.out.println("----State: " + state);
        System.out.println("----Zip Code: " + zipCode);
        System.out.println("---Country: " + country);
        System.out.println(" ");
        System.out.println("Contact Information:");
        System.out.println("----Mobile Number: "+ mobNum);
        System.out.println("----Email: " + email);
    }
}