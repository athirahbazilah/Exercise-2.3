package WaterBottle;

public class Main {

	public static void main(String[] args) {
		
		WaterBottle Tupperware = new WaterBottle();
		WaterBottle Soma = new WaterBottle();
		WaterBottle HydroFlask = new WaterBottle();
		WaterBottle Eplas = new WaterBottle();
		
		System.out.println("***************TUPPERWARE***************");
		Tupperware.BottleFigure();
		Tupperware.TotalPrice();
		Tupperware.WaterVolDrink();
		Tupperware.FreeGift();
		
		System.out.println("***************SOMA***************");
		Soma.BottleFigure();
		Soma.TotalPrice();
		Soma.WaterVolDrink();
		Soma.FreeGift();
		
		System.out.println("***************HYDRO FLASK***************");
		HydroFlask.BottleFigure();
		HydroFlask.TotalPrice();
		HydroFlask.WaterVolDrink();
		HydroFlask.FreeGift();
		
		System.out.println("***************EPLAS***************");
		Eplas.BottleFigure();
		Eplas.TotalPrice();
		Eplas.WaterVolDrink();
		Eplas.FreeGift();

	}

}
