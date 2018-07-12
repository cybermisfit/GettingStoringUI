import java.util.Scanner;

public class Main {

  /*
  Your assignment:
  Complete the following program. Use the Scanner class to read the following string into variables.
  Input String: "P Sherman 42 Wallaby Way Sydney"
  Variables: firstInitial,lastName, houseNumber,streetName,streetType,city

  Your output should be handled with this code:

  System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
  System.out.println(streetName + " " + streetType + " " + city);

   System.out.print( "First temperature? " );
    num1 = keyboard.nextInt();
  */

    public static void main (String[] args) {

        //Variables

        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;


        //Originally assigned the variables because the instructions were a little confusing
        //firstInitial = "P";
        //lastName = "Sherman";
        //houseNumber = 42;
        //streetName = "Wallaby";
        //streetType = "Way";
        //city = "Sydney";

        //System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        //System.out.println(streetName + " " + streetType + " " + city);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first initial: ");
        firstInitial = keyboard.nextLine();

        System.out.println("Enter your last name: ");
        lastName = keyboard.nextLine();

        System.out.println("Enter your house number: ");
        houseNumber = keyboard.nextInt();

        System.out.println("Enter your street name: ");
        streetName = keyboard.next();

        System.out.println("Enter your street type: ");
        streetType = keyboard.next();

        System.out.println("Enter your city: ");
        city = keyboard.next();




    }

}
