/***
 * Class for Trousers
 * @author Cian McDonald (ID 119363843)
 */
public abstract class Trousers extends Garment {
    private static String DEFAULT_PURPOSE = "cover the legs";

     /**
     * Construct an instance of this class with a given fabric, number of fabric units used
     * 
     * 
     * @param name The proper English name of the Garment.
     * @param fabricType The fabric used in making the Garment.
     * @param fabricUnits The number of pieces of fabric used for the Garment.
     */
    public Trousers(String name, Fabric fabricType, Double fabricUnits) {
        this(name, fabricType, fabricUnits, DEFAULT_PURPOSE);
    }

     /**
     * Construct an instance of this class with a given fabric, number of fabric units used
     * and purpose
     * 
     * @param name The proper English name of the Garment.
     * @param fabricType The fabric used in making the Garment.
     * @param fabricUnits The number of pieces of fabric used for the Garment.
     * @param purpose The purpose of the garment.
     */
    public Trousers(String name, Fabric fabricType, Double fabricUnits, String purpose){
        super(name, fabricType, fabricUnits, purpose);
    }
}
