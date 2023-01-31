package com.dvops.maven.eclipse;

import java.util.*;

public class Cart {

    private ArrayList<Furniture> furnitures = new ArrayList<>();
    private int capacity;

    public Cart() {
        this.capacity = 20;
    }

    public Cart(int capacity) {
        this.capacity = capacity;
    }

    public List<Furniture> getCart() {
        return furnitures;
    }

    public void addCart(Furniture furniture) {
        if (furnitures.size() != capacity) {
            furnitures.add(furniture);
        }
    }
}