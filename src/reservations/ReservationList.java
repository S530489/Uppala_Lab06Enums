/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.util.ArrayList;

/**
 *
 * @author Sai Kumar Uppala
 * This class consists of ArrayList of type Reservation.
 * We will store all reservations in this ArrayList which gives us easy access 
 * to print and fetch the details.
 */
public class ReservationList {
    
    private ArrayList<Reservation> reserveList;
    
    /**
     *
     */
    public ReservationList(){
        reserveList=new ArrayList<>();
    }

    /**
     *
     * @return This method returns the reserveList
     */
    public ArrayList<Reservation> getReserveList() {
        return reserveList;
    }

    /**
     *
     * @param reserveList
     */
    public void setReserveList(ArrayList<Reservation> reserveList) {
        this.reserveList = reserveList;
    }
    
    /**
     *
     * @param R
     * This method adds the reservation to the end of the reserveList.
     */
    public void addReservation(Reservation R){
        reserveList.add(R);
    }
    
    /**
     *
     * @param position
     * @param R
     * This method adds the reservation object at the position given.
     */
    public void addReservation(int position, Reservation R){
        if(position<=reserveList.size()){
            reserveList.add(position, R);
        }
    }
    
    /**
     *
     * @param S
     * @return This methods returns the ArrayList which contains source Locations 
     * as given as input.
     */
    public ArrayList<Reservation> findAllSourceLocations(String S){
       ArrayList<Reservation> tempList=new ArrayList<>();
        for (Reservation list: reserveList){
        if(S.equals(list.getRoute().getSource())){
            tempList.add(list);
        }
            }
        
        return tempList;
    }
    
}
