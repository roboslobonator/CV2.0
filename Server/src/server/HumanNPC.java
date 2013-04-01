package server;

import java.util.ArrayList;

/**
 * @(#)HumanNPC.java
 *
 *
 * @author Daniel Zapata
 * @version 1.00 2010/4/13
 */




public class HumanNPC extends homoSapien
{	
	String fightStatus;
	private ArrayList<String> routine;   
	private int routinespot; 

	public HumanNPC(String n,int me,int xI, int yI, String wldnm)     
	{
		super(n,me);routinespot=0;	
	    	worldname=wldnm;
	    	super.x=xI;super.y=yI;
	    	routine = new ArrayList<String>();
	    	routine.add("N");
	    	routine.add("W");
	    	routine.add("S");
	    	routine.add("E");
    }
    
    private void executeRoutine()
    {
    	String str=routine.get(routinespot);
		if(str.equalsIgnoreCase("N"))
		{
			moveNorth(3);
		}
		else if(str.equalsIgnoreCase("W"))
		{
			moveWest(3);
		}
		else if(str.equalsIgnoreCase("E"))
		{
			moveEast(3);
		}
		else if(str.equalsIgnoreCase("S"))
		{
			moveSouth(3);
		}
		routinespot++;
		if(routinespot==4)
		{
			routinespot=0;
		}
    }
    
    
    public void act()
    {
    		executeRoutine();
    }
}