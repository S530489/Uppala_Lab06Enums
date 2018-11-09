/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author 
 * This is Driver class which contains main method.
 * The main method has a scanner object which takes input from the text file.
 * This method calls the toString method to print the output.
 */
public class ReservationDriver {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        
        //Declare and initialize a scanner object to read from the file "inputFile.txt"
        Scanner scan=new Scanner(new File("inputFile.txt"));
        
        //create an object for ReservationList named as "reservationList"
        ReservationList reservationList=new ReservationList();
        
        //While inputFile.txt has more data(While loop starts here) {
        //Read in the data
        while (scan.hasNext()){
        //create an object for Route named as "route" and 
        //initialize the multiple argument constructor with the values from file.
        Route route=new Route(scan.next(), scan.next(), scan.next(), scan.next());
        /*create an object for Reservation named as "reservation" 
         and initialize the multiple argument constructor with the values from file.
         Hint: use valueOf() method while passing the String where enum is required.
         For example, to pass DELTA from input file to Reservation constructor, use Airline.valueOf("DELTA").*/
        Reservation reservation=new Reservation(route, Airline.valueOf(scan.next()), scan.next(), Hotel.valueOf(scan.next()), Meal.valueOf(scan.nextLine().trim()));
        // Invoke addReservation method on reservationList object and add reservation.
           reservationList.addReservation(reservation);
                 
        // }While Loop ends here
    }
        System.out.println("******************************************************************************************");
        System.out.println("Reservation List");
        System.out.println("******************************************************************************************");
        /*Use an enhanced for loop and iterate through getReserveList() method  on reservationList object.
         and print the reservations.
        */
        for(Reservation R:reservationList.getReserveList()){
            System.out.println(R.toString());
        }

        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "DAL" as parameter.
         and print the reservations.
        */
        
        System.out.println("\n****************************************************************************************");
        System.out.println("Reservations that have source location \"DAL\"");
        System.out.println("******************************************************************************************");
       for(Reservation R: reservationList.findAllSourceLocations("DAL")){
            System.out.println(R.toString());
       }
        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "MCI" as parameter.
         and print the reservations.
        */
        System.out.println("\n******************************************************************************************");
        System.out.println("Reservations that have source location \"MCI\"");
        System.out.println("********************************************************************************************");
        for(Reservation R: reservationList.findAllSourceLocations("MCI")){
            System.out.println(R.toString());
       }
    }

}
