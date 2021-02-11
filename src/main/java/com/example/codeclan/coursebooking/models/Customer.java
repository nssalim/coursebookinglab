package com.example.codeclan.coursebooking.models;

import java.util.List;

public class Customer {

    private String name;
    private String town;
    private int age;
    private List<Booking> bookings;
    private Long id;

    public Customer(String name, String town, int age, List<Booking> bookings) {
        this.name = name;
        this.town = town;
        this.age = age;
        this.bookings = bookings;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
