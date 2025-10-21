package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfBasicRooms; // Renamed from getNumberOfRooms
    private int bookedSuites;
    private int bookedBasicRooms;

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    // Derived Getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfBasicRooms - bookedBasicRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public boolean bookRoom(int roomsToBook, boolean isSuite) {
        if (isSuite) {
            if (roomsToBook <= getAvailableSuites()) {
                bookedSuites += roomsToBook;  //
                return true;
            }
        } else {
            if (roomsToBook <= getAvailableRooms()) {
                bookedBasicRooms += roomsToBook;
                return true;
            }
        }
        return false;
    }
}

