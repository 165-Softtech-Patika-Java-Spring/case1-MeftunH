package utlities;

import data.Home;
import data.House;
import data.Resort;
import data.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TypeUtility {

    public List<House> getHouseList(){
        List<House> houseList = new ArrayList<>();
        houseList.addAll(getVillaList());
        houseList.addAll(getHomeList());
        houseList.addAll(getResortList());
        return houseList;
    }

    public List<Home> getHomeList(){
        BigDecimal littleHomePrice = new BigDecimal("200");
        BigDecimal mediumHomePrice = new BigDecimal("5000");
        BigDecimal largeHomePrice = new BigDecimal("8000");
        Home littleHome = createHome(littleHomePrice, 200, 1,2);
        Home mediumHome = createHome(mediumHomePrice, 200, 2,4);
        Home largeHome = createHome(largeHomePrice, 1000, 3,6);
        List<Home> homeList = new ArrayList<>();
        homeList.add(littleHome);
        homeList.add(mediumHome);
        homeList.add(largeHome);
        return homeList;
    }

    public List<Villa> getVillaList(){

        BigDecimal littleVillaPrice = new BigDecimal("12500");
        BigDecimal mediumVillaPrice = new BigDecimal("9000");
        BigDecimal largeVillaPrice = new BigDecimal("112000");
        Villa littleVilla = createVilla(littleVillaPrice, 200, 1,2);
        Villa mediumVilla = createVilla(mediumVillaPrice, 400, 2,4);
        Villa largeVilla = createVilla(largeVillaPrice, 1200, 3,6);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(littleVilla);
        villaList.add(mediumVilla);
        villaList.add(largeVilla);
        return villaList;
    }

    public List<Resort> getResortList(){
        BigDecimal littleResortPrice = new BigDecimal("23500");
        BigDecimal mediumResortPrice = new BigDecimal("431000");
        BigDecimal largeResortPrice = new BigDecimal("542000");
        Resort littleResort = createResort(littleResortPrice, 5000, 1,2);
        Resort mediumResort = createResort(mediumResortPrice, 5500, 2,4);
        Resort largeResort = createResort(largeResortPrice, 6000, 3,6);
        List<Resort> resortList = new ArrayList<>();
        resortList.add(littleResort);
        resortList.add(mediumResort);
        resortList.add(largeResort);
        return resortList;
    }

    private Home createHome(BigDecimal price,int squareMeters, int rooms, int saloonNumber){
        return new Home(price, squareMeters, rooms, saloonNumber);
    }
    private Villa createVilla(BigDecimal price,int squareMeters, int rooms, int saloonNumber){
        return new Villa(price, squareMeters, rooms, saloonNumber);
    }
    private Resort createResort(BigDecimal price,int squareMeters, int rooms, int saloonNumber){
        return new Resort(price, squareMeters, rooms, saloonNumber);
    }
}
