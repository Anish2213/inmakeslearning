package org.car;

public class Lancer extends Skoda {
	@Override
	public void price(long pricecar) {
		System.out.println("the car price is :"+pricecar);
	}
	@Override
	public void model(String mdlcr) {
		System.out.println("Which model car :"+ mdlcr);
	}
	private void seater(int seater) {
		System.out.println("How many seats in the car :"+ seater);
	}
	private void window(int window) {
		System.out.println("How many windows in the car :"+window);
	}
	private void mileage(float mileage) {
		System.out.println("the mileage of the car :"+ mileage);
	}
	private void enginePower(float pwrengin) {
		System.out.println("Power of the engine :"+pwrengin);
	}
	public static void main(String[] args) {
		Lancer j = new Lancer();
		j.model("2020");
		j.price(2343546l);
		j.seater(5);
		j.window(4);
		j.mileage(78.5f);
		j.enginePower(121.5f);
	}
}
