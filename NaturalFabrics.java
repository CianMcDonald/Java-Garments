/***
 * Class for NaturalFabrics
 * @author Cian McDonald (ID 119363843)
 */
public abstract class NaturalFabrics extends Fabric{
    private final String source;

    
    /**
     * Construct an instance of this class with a given name and price
     * 
     * @param name The proper English name of the Garment.
     * @param price The price of 1 unit of fabric
     * @param source The source of the fabric
     */
    public NaturalFabrics(String name, Double price, String source) {
        super(name, price);
        this.source = source;
    }

    
    /** 
     * returns source of fabric
     * @return String
     */
    public String getSource() {
        return source;
    }    

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isNatural() {
        return true;
    }
}
