package com.endeymus.carsharing.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String UUID;
    private String model;
    private String number;


    //coordinate x on map
    private double latitude;
    //coordinate y on map
    private double longitude;


    private double fuel;
    private boolean onRoad;

    /*private int currentUserID;
    private int lastUserID;*/
}
