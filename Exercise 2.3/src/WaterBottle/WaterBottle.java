package WaterBottle;

import java.util.*;

public class WaterBottle {
	
	Scanner in = new Scanner(System.in);
	
	void BottleFigure() {
		
		System.out.println("Enter Brand, Colour, Shape, Material & Volume: ");
		String brand = in.nextLine();
		String colour = in.nextLine();
		String shape = in.nextLine();
		String material = in.nextLine();
		double volume = in.nextDouble();
		
		
		System.out.println("Bottle Brand: " + brand);
		System.out.println("Bottle Colour: " + colour);
		System.out.println("Bottle Shape: " + shape);
		System.out.println("Bottle Material: " + material);
		System.out.println("Bottle Volume: " + volume + " ml");
		System.out.println();
		
	}
	
	void TotalPrice() {
		
		System.out.println("Buy RM 50 & Above Get 30% Discount!");
		
		System.out.println("Enter Quantity: ");
		int quantity = in.nextInt();
		
		System.out.println("Enter Price For a Bottle: ");
		double price = in.nextDouble();
		
		double totalprice = quantity * price;
		System.out.println("Total Price Before Discount: RM " + totalprice);
		
		
		if (totalprice >= 50) {
			System.out.println("YOU GET 30% DISCOUNT!!");
			double totalpricedisc = (quantity * price) * 70/100;
			System.out.println("Total Price After Discount: RM " + totalpricedisc);
			System.out.println();
			
		}
		
		else {
			System.out.println("SORRY YOU NEED TO PURCHASE MORE TO GET DISCOUNT");
			System.out.println("Total Price: RM " + totalprice);
			System.out.println();
			
		}
	}
	
	void WaterVolDrink() {
		
		System.out.println("Enter Water Volume Before & After Drink : ");
		double volbefore = in.nextDouble();
		double volafter = in.nextDouble();
		double voldrink = volbefore - volafter;
		
		System.out.println("The Amount of Water You Drink: " + voldrink + " ml");
		System.out.println();
		
	}
	
	void FreeGift() {
		
		System.out.println("Enter Total Purchase: ");
		int purchase = in.nextInt();
		
		purchase = 2;
		do {
			System.out.println(" Congratss!! You Get A Free Gift..");
			purchase++;
			
		}while (purchase <= 1);
		System.out.println();
	}
	
	
	
	

}
