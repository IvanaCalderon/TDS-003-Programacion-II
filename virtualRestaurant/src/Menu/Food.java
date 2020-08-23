package Menu;

import java.awt.List;
import java.util.ArrayList;

public  class Food {
	
	ArrayList<Food> foods = new ArrayList<Food>();
	
	String name= "name...";
	String description = "description...";
	int price= 00;

	
	public Food(String newName,String newDescription ,int newPrice){
		
		 name = newName;
		 description = newDescription;
		 price = newPrice;
		 
		
	}
	
	public void Mostrar(){
		System.out.println("Name: "+getName());
		System.out.println("Descripciono: "+getDescription());
		System.out.println("Price: "+getPrice());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
} 
