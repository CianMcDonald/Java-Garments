/***
 * Class for Garments with purpose beahvior
 * @author Cian McDonald (ID 119363843)
 */
public abstract class Fabric {
	private final String name;
	private final Double price;

	public Fabric(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

    public Double getPrice() {
        return price;
    }
}
