/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *
 * @author Sai Kumar Uppala
 * 
 * This enum consists of constant Airline values for Economy class , 
 * Business class and discount percentage on non-weekends. 
 */
public enum Airline {

    /**
     *
     */
    DELTA(750, 1500, 10),

    /**
     *
     */
    US_AIRWAYS(570, 1400, 11),

    /**
     *
     */
    UNITED(700, 1450, 9),

    /**
     *
     */
    CATHAY_PACIFIC(710, 1480, 8),

    /**
     *
     */
    AIR_CANADA(640, 1590, 10),

    /**
     *
     */
    AMERICAN_AIRLINES(560, 1200, 6),

    /**
     *
     */
    AIR_FRANCE(450, 1100, 5),

    /**
     *
     */
    AIR_INDIA(590, 1080, 9),

    /**
     *
     */
    JETBLUE(430, 890, 5),

    /**
     *
     */
    QANTAS(670, 1200, 9);
    
    
    private final double economyPrice;
    private final double businessPrice;
    private final double discount;
    private Airline(double Economy_price,double Business_price,double Discount){
        this.economyPrice=Economy_price;
        this.businessPrice=Business_price;
        this.discount=Discount;
    }

    /**
     *
     * @return This get method will return the Economy price for airline.
     */
    public double getEconomyPrice() {
        return economyPrice;
    }

    /**
     *
     * @return This get method will return the Business price for airline.
     */
    public double getBusinessPrice() {
        return businessPrice;
    }

    /**
     *
     * @return This method will return the discount price for that particular 
     * Airline.
     */
    public double getDiscount() {
        return discount;
    }
    
    
    
}
