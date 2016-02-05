package com.gg.Assignment6;
//Item is an abstract class from which RecipeList, Recipe, and Ingredient
//classes inherits attributes and behaviors 
public abstract class Item {
	//declare a name
	private String name;
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
