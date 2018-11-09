/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author Sai Kumar Uppala
 * This class calculates the complete Airline fare including Hotel and Meal cost.
 * This class uses the Route class object.
 */
public class Reservation {
    
    private Route Route;
    private Airline airline;
    private String cabin;
    private Hotel hotel;
    private Meal meal;

    /**
     *
     * @param route
     * @param airline
     * @param cabin
     * @param hotel
     * @param meal
     */
    public Reservation(Route route, Airline airline, String cabin, 
            Hotel hotel, Meal meal) {
        this.Route = route;
        this.airline = airline;
        this.cabin = cabin;
        this.hotel = hotel;
        this.meal = meal;
    }

    /**
     *
     * @return This method returns the Route class object.
     */
    public Route getRoute() {
        return Route;
    }
    
    /**
     *
     * @return This method returns the Airline fare based on Economy and 
     * Business class.
     * The discount to the fare depends on the day(applicable only if weekend).
     */
    public double calcAirlinefare(){
    
        if (cabin.equals("ECONOMY")){
            if(Route.isWeekend()){
                return airline.getEconomyPrice();
            }
            else 
                return airline.getEconomyPrice()*(100-airline.getDiscount())/100;
        }
        else if(cabin.equals("BUSINESS")){
            if(Route.isWeekend()){
                return airline.getBusinessPrice();
            }
            else 
                return airline.getBusinessPrice()*(100-airline.getDiscount())/100;
        }
       else
            return 0;
    }
    
    /**
     *
     * @return This method returns the room cost for the type of hotel.
     */
    public double calcRoomCost(){
        return hotel.getRoomCost();
    }
    
    /**
     *
     * @return This method returns the Meal Price for the type of meal.
     */
    public double calcMealPrice(){
        return meal.getMealPrice();
    }
    
    /**
     *
     * @return This method returns the total fare including Hotel, Meal, Airline
     * fare.
     */
    public double calcTotalFare(){
        return calcAirlinefare()+calcRoomCost()+calcMealPrice();
    } 

    @Override
    public String toString() {
        return Route.toString()+", Airline : "+airline.name()+", Cabin : "
                + cabin + ", Hotel : " + hotel + ", Meal : " + meal + ","
                + " Total fare : $"+calcTotalFare();
    }
    
    
    
}
