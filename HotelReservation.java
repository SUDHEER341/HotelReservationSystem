package com.hotelreservationsystem;

public class HotelReservation {
    private int rates;
    private String hotelName;
    public HotelReservation(String hotelName, int rates) {
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
