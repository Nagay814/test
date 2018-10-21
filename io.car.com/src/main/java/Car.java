
public class Car {
	
	private String make;
	private String model;
	private String vin;
	Metadata MetadataObject;
	Perdayrent PerdayrentObject;
	Metrics MetricsObject;

	// Getter Methods

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getVin() {
		return vin;
	}

	public Metadata getMetadata() {
		return MetadataObject;
	}

	public Perdayrent getPerdayrent() {
		return PerdayrentObject;
	}

	public Metrics getMetrics() {
		return MetricsObject;
	}

	// Setter Methods

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void setMetadata(Metadata metadataObject) {
		this.MetadataObject = metadataObject;
	}

	public void setPerdayrent(Perdayrent perdayrentObject) {
		this.PerdayrentObject = perdayrentObject;
	}

	public void setMetrics(Metrics metricsObject) {
		this.MetricsObject = metricsObject;
	}
}








