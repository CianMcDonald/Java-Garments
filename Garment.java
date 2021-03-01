/***
 * Class for Garments with purpose beahvior
 * @author Cian McDonald (ID 119363843)
 */
public abstract class Garment {
    private final String name;
    private final Fabric fabric_type;
    private final Double fabric_units;
    private final String purpose;

    /**
     * Construct an instance of this class with a given fabric and number of fabric units used
     * 
     * @param name The proper English name of the Garment.
     * @param fabric_type The fabric used in making the Garment.
     * @param fabric_units The number of pieces of fabric used for the Garment.
     */

    public Garment (final String name, final Fabric fabric_type, final Double fabric_units, final String purpose) {
        this.name = name;
        this.fabric_type = fabric_type;
        this.fabric_units = fabric_units;
        this.purpose = purpose;
    }

    /**
     * Get the name of the instance
     * @return The name of the instance
     */
    public String getName () {
        return name;   
    }
    /**
     * Get the fabric_units of the instance
     * @return The fabric_units of the instance
     */
    public Double getFabric_units () {
        return fabric_units;   
    }
      /**
     * Get the fabric_type of the instance
     * @return The fabric_type of the instance
     */
    public Fabric getFabric_type () {
        return fabric_type;   
    }

    /**
     * Print the purpose of the class
     */
    public void printPurpose () { System.out.println(purpose); }

    /**
     * Print the price of the garment
     */
    public void printItemisedBill() {
        System.out.printf("Itemised bill for %s %n", getName());
        System.out.printf("Made of %d units of %s", fabric_units, fabric_type.getName());
        if (fabric_type instanceof NaturalFabrics) {
            System.out.printf("made of %s", fabric_type.getSource());
            System.out.printf("%n enviroment tax: 2.0 * 0.0 = 0.0");
        } else {
            System.out.printf("%n enviroment tax: 2.0 * %f = %f");
        }
    }
}