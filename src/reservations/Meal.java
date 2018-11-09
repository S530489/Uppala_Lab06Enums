/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author Sai Kumar Uppala
 * This enum consists of constant Meal values.
 */
public enum Meal {
    
    /**
     *
     */
    VEG(10),

    /**
     *
     */
    NON_VEG(11),

    /**
     *
     */
    HINDU_MEAL(13),

    /**
     *
     */
    NO(0);

    private final double mealPrice;

    private Meal(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    /**
     *
     * @return This method will return the Meal price of enum value.
     */
    public double getMealPrice() {
        return mealPrice;
    }
    
}
