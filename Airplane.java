/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueAirlines;

/**
 *
 * @author Safiqul
 */
public class Airplane {
        private int id;
        private String planeCode;
        private String planeName;
        private int totalSeats;
        private double commonSeatPrice;
        private double businessSeatPrice;
        private double premiumSeatPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getCommonSeatPrice() {
        return commonSeatPrice;
    }

    public void setCommonSeatPrice(double commonSeatPrice) {
        this.commonSeatPrice = commonSeatPrice;
    }

    public double getBusinessSeatPrice() {
        return businessSeatPrice;
    }

    public void setBusinessSeatPrice(double businessSeatPrice) {
        this.businessSeatPrice = businessSeatPrice;
    }

    public double getPremiumSeatPrice() {
        return premiumSeatPrice;
    }

    public void setPremiumSeatPrice(double premiumSeatPrice) {
        this.premiumSeatPrice = premiumSeatPrice;
    }
        
        
        
}
