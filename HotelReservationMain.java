package com.hotelreservationsystem;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelReservationMain {
    Scanner read = new Scanner(System.in);
    public  void addHotel() {
        ArrayList<HotelReservation> List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter hotel name");
        String hotelName = scanner.next();
        System.out.println(" please enter hotel rates");
        int hotelRates = scanner.nextInt();
        System.out.println("Please enter the weekendrate");
        float weekendrates = read.nextFloat();

        HotelReservation hotelReservation = new HotelReservation(hotelName, hotelRates);
        List.add(hotelReservation);
        System.out.println(List);
    }
    public static void main(String[] args) {
        HotelReservationMain obj = new HotelReservationMain();
        obj.addHotel();
    }
}
