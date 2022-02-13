package data;

import java.math.BigDecimal;

public class Villa extends Home{

    public Villa(BigDecimal price, int squareMeters, int roomNumber, int saloonNumber) {
        super(price, squareMeters, roomNumber, saloonNumber);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(BigDecimal price) {
        super.setPrice(price);
    }

    @Override
    public int getSquareMeters() {
        return super.getSquareMeters();
    }

    @Override
    public void setSquareMeters(int squareMeters) {
        super.setSquareMeters(squareMeters);
    }

    @Override
    public int getRoomNumber() {
        return super.getRoomNumber();
    }

    @Override
    public void setRoomNumber(int roomNumber) {
        super.setRoomNumber(roomNumber);
    }

    @Override
    public int getSaloonNumber() {
        return super.getSaloonNumber();
    }

    @Override
    public void setSaloonNumber(int saloonNumber) {
        super.setSaloonNumber(saloonNumber);
    }
    @Override
    public String toString() {
        return ("\n" + "Price:"+this.getPrice()+
                " Room Number "+ this.getRoomNumber() +
                " Area "+ this.getSquareMeters() +
                " Saloon Number : " + this.getSaloonNumber());
    }
}
