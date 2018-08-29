

public class Metrics {
	private float yoymaintenancecost;
	private float depreciation;
	Rentalcount RentalcountObject;

	// Getter Methods

	public float getYoymaintenancecost() {
		return yoymaintenancecost;
	}

	public float getDepreciation() {
		return depreciation;
	}

	public Rentalcount getRentalcount() {
		return RentalcountObject;
	}

	// Setter Methods

	public void setYoymaintenancecost(float yoymaintenancecost) {
		this.yoymaintenancecost = yoymaintenancecost;
	}

	public void setDepreciation(float depreciation) {
		this.depreciation = depreciation;
	}

	public void setRentalcount(Rentalcount rentalcountObject) {
		this.RentalcountObject = rentalcountObject;
	}
}