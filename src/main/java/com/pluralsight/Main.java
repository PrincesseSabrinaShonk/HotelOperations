package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Hotel X $ Y ");
        ArrayList<Room> rooms = new ArrayList<>();

        Room r1001 = new Room(1);
        Room r1002 = new Room(2);
        Room r1003 = new Room(3);
        Room r1004 = new Room(4);

        rooms.add(r1001);
        rooms.add(r1002);
        rooms.add(r1003);
        rooms.add(r1004);

        for(Room r: rooms){
            System.out.println(r);
        }


        }
    }