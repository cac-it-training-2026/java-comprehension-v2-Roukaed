package q02_advanced.question01;

public class Coupon {
	int id;
	double discountRate;
	String description;

	public Coupon() {
	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

	public static Coupon getInstance(int id, double discoundRate, String description) {
		Coupon coupon = new Coupon(id, discoundRate, description);
		return coupon;
	}

}
