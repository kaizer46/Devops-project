package com.dvops.maven.eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Furniture {
	private static final Comparator Title = null;
	private static final Comparator Price = null;
	private String id;
	private String title;
	private String image;
	private String price;

	private ArrayList<Furniture> furnitures = new ArrayList<>();
	private int capacity;

	public Furniture() {
		this.capacity = 20;
	}

	public Furniture(int capacity) {
		this.capacity = capacity;
	}

	public Furniture(String id, String title, String image, String price) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ArrayList<Furniture> sortFurnitureByTitle() {

		Collections.sort(furnitures, Furniture.Title);
		return furnitures;
	}

	public ArrayList<Furniture> sortFurnituresByPrice() {
		Collections.sort(furnitures, Furniture.Price);
		return furnitures;
	}

	public Furniture findFurnituresByPrice(String id) {
		for (Furniture s : furnitures) {
			if (s.getPrice().equals(id))
				return s;
		}
		return null;
	}

	public Furniture findFurnitureByTitle(String title) {
		for (Furniture s : furnitures) {
			if (s.getTitle().equals(title))
				return s;
		}
		return null;
	}
}
