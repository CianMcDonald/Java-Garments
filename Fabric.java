/***
 * Class for Fabrics
 * @author Cian McDonald (ID 119363843)
 */
public abstract class Fabric {
	private final String name;
	private final Double price;

	 /**
     * Construct an instance of this class with a given name and price
     * 
     * @param name The proper English name of the Garment.
     * @param price The price of 1 unit of fabric
     */
	public Fabric(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * Get name of the instance
	 * @return name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * Get price of the instance
	 * @return price
	 */
    public Double getPrice() {
        return price;
    }

	
	/**
	 * Return boolean if fabric is natural
	 * @return boolean
	 */
	public abstract boolean isNatural();
}
