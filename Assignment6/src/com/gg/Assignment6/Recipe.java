package com.gg.Assignment6;

import java.util.ArrayList;

public class Recipe extends Item implements ManageItem {
	private String instructions;
	private ArrayList<Item> ingredients;

	public Recipe() {
		ingredients = new ArrayList<Item>();
	}

	public String getDirections() {
		return instructions;
	}

	public void setDirections(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public void addItem(Item i) {
		ingredients.add(i);
	}

	@Override
	public void editItem(Item i) {
		for (Item item : ingredients) {
			if (item.getName().equals(i.getName())) {
				ingredients.remove(item);
				ingredients.add((Ingredient) i);
			}
		}
	}

	@Override
	public Item getItem(String name) {
		Item item = null;
		for (Item i : ingredients) {
			if (i.getName().equals(name)) {
				item = i;
			}
		}
		return item;
	}

	@Override
	public ArrayList<Item> getItems() {
		return ingredients;
	}
}
