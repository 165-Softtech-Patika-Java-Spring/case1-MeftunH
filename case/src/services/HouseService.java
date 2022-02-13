package services;

import data.Home;
import data.House;
import data.Resort;
import data.Villa;
import utlities.TypeUtility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class HouseService {

    private int count_of_house_types = 3;
    protected TypeUtility typeUtility;
    public HouseService() {
        this.typeUtility = new TypeUtility();
    }

    public BigDecimal getTotalPriceOfHomes(){
        List<Home> homeList = this.typeUtility.getHomeList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Home home : homeList) {
            BigDecimal price = home.getPrice();
            sum = sum.add(price);
        }
       return sum;
    }
    public BigDecimal getTotalPriceOfVillas(){
        List<Villa> villaList = this.typeUtility.getVillaList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Home villa : villaList) {
            BigDecimal price = villa.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }
    public BigDecimal getTotalPriceOfResorts(){
        List<Resort> resortList = this.typeUtility.getResortList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Resort resort : resortList) {
            BigDecimal price = resort.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }
    public BigDecimal getTotalPriceOfAllTypeHouses(){
        BigDecimal sum = BigDecimal.valueOf(0).add(getTotalPriceOfResorts())
                                              .add(getTotalPriceOfVillas())
                                              .add(getTotalPriceOfHomes());
        return sum;
    }
    public OptionalDouble getAverageSquareMetersOfHomes(){
        List<Home> homeList = this.typeUtility.getHomeList();
        OptionalDouble average = OptionalDouble.of(homeList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        return average;
    }
    public OptionalDouble getAverageSquareMetersOfVillas(){
        List<Villa> villaList = this.typeUtility.getVillaList();
        OptionalDouble average = OptionalDouble.of(villaList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        return average;
    }
    public OptionalDouble getAverageSquareMetersOfResorts(){
        List<Resort> resortList = this.typeUtility.getResortList();
        OptionalDouble average = OptionalDouble.of(resortList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        return average;
    }
    public OptionalDouble getAverageSquareMetersOfAllTypeHouses(){
        OptionalDouble average = OptionalDouble.of((getAverageSquareMetersOfHomes().getAsDouble() +
                                                   getAverageSquareMetersOfVillas().getAsDouble() +
                                                   getAverageSquareMetersOfResorts().getAsDouble()) / count_of_house_types );

        return average;
    }
    public List<House> getHomesByFilter(int roomNumber, int saloonNumber){

        List<House> houseList = this.typeUtility.getHouseList();
        List<House> result = this.typeUtility.getHouseList();


        if (result.isEmpty()) {
            throw new IllegalArgumentException("There is no house with this room number and saloon number");
        };
        System.out.println(houseList.toString());
        return result;
    }

}
