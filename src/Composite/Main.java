package Composite;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        Housing house = new Housing("said home");
        Room room1 = new Room("room 1");
        Room room2 = new Room("room 2");
        Room room3 = new Room("room 3");

        house.addStructure(room1);
        house.addStructure(room2);
        house.addStructure(room3);
        house.getStructures();


    }
}
