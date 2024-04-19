package gameobjects;

public class ThingHolder extends Thing
{
	private ThingList things = new ThingList( );
    
    //////////////////////////////////////////////////////////////////////////////////////////
	// Constructors primarily inherited from Thing but with added field ThingList
    //////////////////////////////////////////////////////////////////////////////////////////
	public ThingHolder(String thingHolderName, String thingHolderDescription, ThingList thinglist) 
    {
        super(thingHolderName, thingHolderDescription);
        things = thinglist;
    }
    
    public ThingHolder(String thingHolderName, String thingHolderDescription, boolean canTake,boolean canMove, ThingList thinglist)
    {
        super(thingHolderName, thingHolderDescription, canTake, canMove);
        things = thinglist;
    }
   
    //////////////////////////////////////////////////////////////////////////////////////////
    // Getter and Setter for ThingList
    //////////////////////////////////////////////////////////////////////////////////////////
    public ThingList getThings() 
    {
        return things;
    }
   
    public void setThings(ThingList things) 
    {
        this.things = things;
    }
}
