import data.Home;
import services.HouseService;
import utlities.TypeUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        printTotalPrice("homes", houseService.getTotalPriceOfHomes().toPlainString());
        printTotalPrice("villas", houseService.getTotalPriceOfVillas().toPlainString());
        printTotalPrice("resorts", houseService.getTotalPriceOfResorts().toPlainString());
        printTotalPrice("all type houses", houseService.getTotalPriceOfAllTypeHouses().toPlainString());

        printAverageSquareMeters("homes", houseService.getAverageSquareMetersOfHomes().toString());
        printAverageSquareMeters("villas", houseService.getAverageSquareMetersOfVillas().toString());
        printAverageSquareMeters("resorts", houseService.getAverageSquareMetersOfResorts().toString());
        printAverageSquareMeters("all type houses", houseService.getAverageSquareMetersOfAllTypeHouses().toString());

        System.out.println("--------------Filter by Room and Saloon Number--------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a room number");
        int roomFilter = keyboard.nextInt();
        System.out.println("enter a saloon number");
        int saloonFilter = keyboard.nextInt();
        System.out.println("--------------Here's your results--------------");
        System.out.println(houseService.getHomesByFilter(roomFilter, saloonFilter));
    }

    private static void printTotalPrice(String typeOfHouse, String result){
        System.out.println("Total price of " +typeOfHouse +" is: " + result);
    }
    private static void printAverageSquareMeters(String typeOfHouse, String result){
        System.out.println("Average square meters of " +typeOfHouse +" is: " + result);
    }
}
