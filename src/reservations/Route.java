/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Sai Kumar Uppala
 * This class consists of private variables of Travel Route taken as input from 
 * the customer.
 */
public class Route {
    private String source;
    private String destination;
    private String departingDate;
    private String returningDate;

    /**
     *
     * @param source
     * @param destination
     * @param departingDate
     * @param returningDate
     */
    public Route(String source, String destination, String departingDate, 
            String returningDate) {
        this.source = source;
        this.destination = destination;
        this.departingDate = departingDate;
        this.returningDate = returningDate;
    }

    /**
     *
     * @return This method returns the source Location
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return  This method returns the Destination Location
     */
    public String getDestination() {
        return destination;
    }

    /**
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     *
     * @return  This method returns the Departure Date.
     */
    public String getDepartingDate() {
        return departingDate;
    }

    /**
     *
     * @param departingDate
     */
    public void setDepartingDate(String departingDate) {
        this.departingDate = departingDate;
    }

    /**
     *
     * @return  This method returns the Returning Date.
     */
    public String getReturningDate() {
        return returningDate;
    }

    /**
     *
     * @param returningDate
     */
    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }
    
    /**
     *
     * @param date
     * @return This method returns the day of the week
     * This method takes date as input and calculates the day using the object 
     * of LocalDate.
     */
    public DayOfWeek getDay(String date){
        //mm/dd/yyyy
        int Year=Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(date.indexOf("/")+1,
                date.lastIndexOf("/")));
        
        LocalDate loacal=LocalDate.of(Year, month, day);
        java.time.DayOfWeek dayOfWeek=loacal.getDayOfWeek();
        return dayOfWeek;  
    
    }

    /**
     *
     * @return This method uses the getDay method and returns true if day is 
     * weekend.
     */
    public boolean isWeekend(){
        DayOfWeek a[]={DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SUNDAY};
        
        for (int i=0;i<a.length;i++){
            if(getDay(departingDate)==a[i]||getDay(returningDate)==a[i])
                return true;           
        }
        return false;
    }

    @Override
    public String toString() {
        return "From : " + source + ", To : " + destination + ", Departing On :"
                + " " + departingDate + ", Returning On : " + returningDate;
    }
    
    
}
