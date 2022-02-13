import data.Home;
import services.HouseService;
import utlities.TypeUtility;

import java.util.Scanner;

public class Main {
    /**
     * Main method
     * @param args
     */
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
        System.out.println("enter a room number");
        boolean validInput;
        Scanner input = null;

        do {
            validInput = true;
            try {
                 input = new Scanner(System.in);
            } catch (NumberFormatException ex) {
                validInput = false;
                System.out.println("Please enter a number.");
            }
        } while (!validInput);

        int roomFilter = input.nextInt();
        System.out.println("enter a saloon number");
        int saloonFilter = input.nextInt();
        System.out.println("--------------Here's your results--------------");
        System.out.println(houseService.getHomesByFilter(roomFilter, saloonFilter));
    }

    /**
     *  Prints the total price of all houses
     * @param typeOfHouse
     * @param result
     */
    private static void printTotalPrice(String typeOfHouse, String result){
        System.out.println("Total price of " +typeOfHouse +" is: " + result);
    }

    /**
     *  Prints the average square meters of all houses
     * @param typeOfHouse
     * @param result
     */
    private static void printAverageSquareMeters(String typeOfHouse, String result){
        System.out.println("Average square meters of " +typeOfHouse +" is: " + result);
    }
}
