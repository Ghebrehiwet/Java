package com.gg.Assignment6;

import java.util.ArrayList;

public class RecipeList implements ManageItem {
	private ArrayList<Item> recipes;

	public RecipeList() {
		recipes = new ArrayList<Item>();
	}

	@Override
	public void addItem(Item i) {
		recipes.add(i);
	}

	@Override
	public void editItem(Item i) {
		for (Item item : recipes) {
			if (item.getName().equals(i.getName())) {
				recipes.remove(item);
				recipes.add((Ingredient) i);
			}
		}
	}

	@Override
	public Item getItem(String name) {
		Item item = null;
		for (Item i : recipes) {
			if (i.getName().equals(name)) {
				item = i;
			}
		}
		return item;
	}

	@Override
	public ArrayList<Item> getItems() {
		return recipes;
	}
}
