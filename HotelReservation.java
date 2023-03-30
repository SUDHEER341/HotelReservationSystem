package com.hotelreservationsystem;

public class HotelReservation {
    private int rates;
    private String hotelName;
    private float weekendRate;
    public   float getWeekendRate()
    {
        return weekendRate;
    }
    public void setWeekendRate(float weekendRate)
    {
        this.weekendRate=weekendRate;
    }
    public HotelReservation(String hotelName, int rates, float weekendrates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getRates() {
        return rates;
    }
    public void setRates(int rates) {
        this.rates = rates;
    }
    public int compareTo(HotelReservation h) {
        return (this.rates - h.rates);
    }
    @Override
    public String toString() {
        return "HotelReservation{" + "hotelName='" + hotelName + '\'' + ", rates=" + rates + '}';
    }
}
