package services;

import data.House;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public interface HouseServiceInterface {
    public BigDecimal getTotalPriceOfHomes();
    public BigDecimal getTotalPriceOfVillas();
    public BigDecimal getTotalPriceOfResorts();
    public BigDecimal getTotalPriceOfAllTypeHouses();
    public OptionalDouble getAverageSquareMetersOfHomes();
    public OptionalDouble getAverageSquareMetersOfVillas();
    public OptionalDouble getAverageSquareMetersOfResorts();
    public OptionalDouble getAverageSquareMetersOfAllTypeHouses();
    public List<House> getHomesByFilter(int roomNumber, int saloonNumber);
}
