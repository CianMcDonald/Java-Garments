/***
 * Class for Garments with purpose beahvior
 * @author Cian McDonald (ID 119363843)
 */
public class Garment {
    private final String name;
    private final Fabric fabric_type;
    private final float fabric_units;

    /**
     * Construct an instance of this class with a given fabric and number of fabric units used
     * 
     * @param name The proper English name of the Garment.
     * @param fabric_type The fabric used in making the Garment.
     * @param fabric_units The number of pieces of fabric used for the Garment.
     */

    public Garment (final String name, final Fabric fabric_type, final float fabric_units) {
        this.name = name;
        this.fabric_type = fabric_type;
        this.fabric_units = fabric_units;
    }

    /**
     * Get the name of the instance
     * @return The name of the instance
     */
    public String getName () {
        return name;   
    }
    /**
     * Print the purpose of the class
     */
    public void printPurpose () { }
}