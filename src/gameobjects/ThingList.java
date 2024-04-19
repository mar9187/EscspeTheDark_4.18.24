package gameobjects;

import java.util.ArrayList;
//import gameobjects.Thing;

public class ThingList extends ArrayList<Thing>
{
	
    //////////////////////////////////////////////////////////////////////////////////////////
	// Suggested by eclipse to fix to warning about serialVersionUID
    //////////////////////////////////////////////////////////////////////////////////////////
	private static final long serialVersionUID = 1L;
	
    //////////////////////////////////////////////////////////////////////////////////////////
	// Getter to describe array list
    //////////////////////////////////////////////////////////////////////////////////////////
	public String describeThings() 
	{
        String s = "";
        
        if (this.size() == 0) 
        {
            s = "";
        }
        else 
        {
            for (Thing t : this) 
            {
                s = s + t.getName() + ": " + t.getDescription() + "\n";
            }
        }
        return s;
    }

    //////////////////////////////////////////////////////////////////////////////////////////
	// returns object based on name of object. if object not found, return null
    //////////////////////////////////////////////////////////////////////////////////////////
	public Thing thisObject(String aName) {
        Thing aThing = null;
        String thingName = "";
        String aNameLowCase = aName.trim().toLowerCase();
        for (Thing t : this) {
            thingName = t.getName().trim().toLowerCase();
            if (thingName.equals(aNameLowCase)) {
                aThing = t;
            }
        }
        return aThing;
    }
}
