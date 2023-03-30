package com.hotelreservationsystem;
import java.util.Scanner;
import java.text.ParseException;
public class HotelReservationRunner {
    Scanner scanner = new Scanner(System.in);
    FindCheapestHotel hotelObj = new FindCheapestHotel();

    public static void main (String[] args) throws ParseException {

        System.out.println("-----Welcome to the Hotel Reservation System-----");
        HotelReservationRunner application = new HotelReservationRunner();
        application.userChoice();
    }

    public void userChoice() throws ParseException {
        while(true) {
            System.out.println("Choose Options " +
                    "\n1. Add Hotel" +
                    "\n2. Find Cheapest Hotel " );
            String userOption = scanner.next();
            switch (userOption) {
                case "1" :
                    addHotel();
                    break;
                case "2":
                    findCheapestHotel();
                case "10" :
                    System.exit(0);
            }
        }
    }

    public void addHotel() {
        HotelReservation hotel = new HotelReservation();
        System.out.println("Enter Hotel Name");
        String name = scanner.next();
        System.out.println("Enter weekday rate ");
        float rate = scanner.nextFloat();
        System.out.println("Enter weekend rate");
        float weekendRate = scanner.nextFloat();
        hotel.setHotelName(hotel.getHotelName());
        hotel.setRates(hotel.getRates());
        hotel.setWeekendRate(hotel.getWeekendRate());
        hotelObj.hotelList.add(hotel);
        System.out.println(hotelObj.hotelList);
    }

    public void findCheapestHotel() throws ParseException {
        System.out.println("Enter check-In Date : (dd/mm/yyyy)");
        String checkInDate = scanner.next();
        System.out.println("Enter check-Out Date : (dd/mm/yyyy)");
        String checkOutDate = scanner.next();

        String day1 = findCheapestHotel.findDayWeek(checkInDate);
        String day2 = findCheapestHotel.findDayWeek(checkOutDate);

        int days = FindCheapestHotel.findDate(checkInDate, checkOutDate);
        System.out.println("Number of days stying in hotel " +days);
        HotelReservation cheapestHotel = HotelReservation.findCheapestHotel(days);
        float totalRate = cheapestHotel.getRates() * days;

        HotelReservation cheapestobj2 = cheapestHotel.findCheapestHotel(days);
        float totalweekendRating = cheapestHotel.getWeekendRate();
        if(day1.equals("saturday") | day1.equalsIgnoreCase("sunday") | day2.equalsIgnoreCase("saturday") | day2.equalsIgnoreCase("sunday"))
        {
            System.out.println("Best hotel in weekend " + cheapestHotel.getHotelName() + "have rating of  $ "+ totalweekendRating);
        }
        else {

            System.out.println("Cheapest hotel is " + cheapestHotel.getHotelName() + " have rating of  $ " + totalRate);
        }
    }
}



