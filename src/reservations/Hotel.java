/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author Sai Kumar Uppala
 * This enum consists of Constant Hotel Values.
 */
public enum Hotel {

    /**
     *
     */
    SINGLE(150),

    /**
     *
     */
    DOUBLE(200),

    /**
     *
     */
    KING(250),

    /**
     *
     */
    QUEEN(300),

    /**
     *
     */
    NO(0);
    
    
    private final double roomCost;

    private Hotel(double roomCost) {
        this.roomCost = roomCost;
    }

    /**
     *
     * @return This method will return the Roomcost of enum Value.
     */
    public double getRoomCost() {
        return roomCost;
    }
    
}
