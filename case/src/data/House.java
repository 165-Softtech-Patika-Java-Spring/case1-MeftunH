package data;

import java.math.BigDecimal;

public class House {

    private BigDecimal price;
    private int squareMeters;
    private int roomNumber;
    private int saloonNumber;

    public House(BigDecimal price, int squareMeters, int roomNumber, int saloonNumber) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSaloonNumber() {
        return saloonNumber;
    }

    public void setSaloonNumber(int saloonNumber) {
        this.saloonNumber = saloonNumber;
    }
}
