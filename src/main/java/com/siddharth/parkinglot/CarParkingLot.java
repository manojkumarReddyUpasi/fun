package com.siddharth.parkinglot;

import com.siddharth.parkinglot.bo.Car;
import com.siddharth.parkinglot.bo.Slot;
import com.siddharth.parkinglot.exception.ParkingNotAvailableException;

import java.util.List;
import java.util.Map;



public interface CarParkingLot {


    public void createParkingLot(int numOfSlots);

    public int park(Car c) throws ParkingNotAvailableException;


    public int leave(int slotId);

   
    public Map<Slot, Car> getParkinglotStatus();

    public List<Car> getRegistrationNumbers(String color);

    
    public Slot getSlotForCar(String registrationNumber);

    
    public List<Slot>  getSlots(String color);
}
