package com.gg.Assignment6;

import java.util.ArrayList;
//interface
public interface ManageItem {
	void addItem(Item i);

	void editItem(Item i);

	Item getItem(String name);

	ArrayList<Item> getItems();
}
