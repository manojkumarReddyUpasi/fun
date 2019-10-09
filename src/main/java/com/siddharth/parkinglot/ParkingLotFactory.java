package com.siddharth.parkinglot;

public class ParkingLotFactory {

    public static CarParkingLot createParkingLot()
    {
        return new ParkingLotImpl();
    }
}
