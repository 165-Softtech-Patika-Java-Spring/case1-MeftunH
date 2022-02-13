package utlities;

import data.Home;
import data.House;
import data.Resort;
import data.Villa;

import java.math.BigDecimal;
import java.util.List;

public interface TypeUtilityInterface {
     List<House> getHouseList();
     List<Home> getHomeList();
     List<Villa> getVillaList();
     List<Resort> getResortList();
    private Home createHome(BigDecimal price, int squareMeters, int rooms, int saloonNumber) {
        return null;
    }
    private Villa createVilla(BigDecimal price,int squareMeters, int rooms, int saloonNumber){
        return null;
    };
    private Resort createResort(BigDecimal price, int squareMeters, int rooms, int saloonNumber){
        return null;
    };
    private House createHouse(BigDecimal price, int squareMeters, int rooms, int saloonNumber){
        return null;
    };

}
