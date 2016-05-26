package jp.co.nichiwa_system;

public class Book {

	public static Book newNull() {
		return new NullBook();
	}

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
