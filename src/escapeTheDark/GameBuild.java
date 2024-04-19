package escapeTheDark;

import java.util.ArrayList;
//import java.util.List;

import gameobjects.Actor;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.ThingList;
import globals.Directions;

//Game
public class GameBuild
{
	//////////////////////////////////////////////////////////////////////////////////////
	// Player and Map declarations
	//////////////////////////////////////////////////////////////////////////////////////
	private ArrayList<Room> map;
	private Actor player;
	ThingList playerlist = new ThingList();
	
    //////////////////////////////////////////////////////////////////////////////////////////
	// Enemies and NPCs declarations
    //////////////////////////////////////////////////////////////////////////////////////////
	// Enemies:
	Thing viktor;
	Thing brittany;
	Thing seb;
	Thing henry;
	ThingList enemyList = new ThingList();
	//NPCs:
	Thing drConnors;
	Thing nurseTiffany;
	Thing alexander;
	Thing pastorChristian;
	ThingList npcList = new ThingList();;
	
    //////////////////////////////////////////////////////////////////////////////////////////
	// Items declarations
    //////////////////////////////////////////////////////////////////////////////////////////
	Thing crowbar;
	Thing patient;
	Thing apple;
	Thing idCard;
	Thing nurse;
	Thing oldKey;
	ThingList itemList = new ThingList();;
	
    //////////////////////////////////////////////////////////////////////////////////////////
	// Constructor for GameBuild. It builds the game.
    //////////////////////////////////////////////////////////////////////////////////////////
	public GameBuild()
	{
		//////////////////////////////////////////////////////////////////////////////////////
		// Map initialization
		//////////////////////////////////////////////////////////////////////////////////////
		this.map = new ArrayList<Room>();
		
		//////////////////////////////////////////////////////////////////////////////////////
		// Intro and Outro Prompts
		//////////////////////////////////////////////////////////////////////////////////////
		TextArt txt = new TextArt();
		String roomPrompt="q: quit\ni: list inventory";
		String exitPrompt="You escaped the dark asylum.\n";
		ThingList exitList = new ThingList();
		
		//////////////////////////////////////////////////////////////////////////////////////
		// Initialization of Enemies, NPCs, and items
		//////////////////////////////////////////////////////////////////////////////////////
		//ENEMIES:
		//Viktor
		final String vikDesc = "He has electric blue eyes and his gaze looks dizzy and lost. "
				+ "He's 5'11'' and has a toned body but looks somewhat skinny. He has broad shoulders like an Olympic swimmer. "
				+ "His blonde hair looks spikey and frizzy like he got struck by lightning. "
				+ "He loves playing with electricity and watching lightning strike from the clouds on a rainy day. "
				+ "When it is thundering, he is always found near an open window admiring the lightning. "
				+ "He has a hospital patient gown on which has burn marks from all the times he tried to play with electricity. "
				+ "He constantly smells like burnt wood or paper.";
		viktor = new Thing("Viktor", vikDesc, false, false);
		//Brittany
		final String britDesc ="She has been a nurse for as long as she can remember. "
				+ "But ever since she lost her husband, she's been on the edge and is always looking for conflict. "
				+ "She's 5'1'' with shoulder-length dark brown hair. She wears a tight nurse uniform with unknown blood stains and little tears on her skirt. "
				+ "She roams around the hallways with a smile on her face looking to pick on anyone that gets in her way. She looks small but fierce.";
		brittany = new Thing("Brittany", britDesc, false, false);
		//Seb
		final String sebDesc = "He's a daily visitor in the asylum. Always searching for his mama who went crazy. "
				+ "He always roams the hallways calling out his mama's name (Bethany) but doesn't understand that she's not a patient anymore. "
				+ "He's 5'9'' and is skinny for his height. He looks younger than his age and always gets mistaken for a child. He has a small build overall. "
				+ "His brown eyes look empty and has no facial hair. He always wears the same dirty hoodie and shorts which smell like pizza and sweat.";
		seb = new Thing("Seb", sebDesc, false, false);
		//Henry
		final String henDesc = "He was a lumberjack before a terrible accident that made him lose his arm. He's 6' and super buff. "
				+ "His one arm is so buff that his blood vessels are always popping. Even with 1 arm, he is stronger than most men. "
				+ "He has a dirty blonde mullet and a trimmed yet messy beard. Ever since the accident, he always looks angry with his bushy eyebrows furrowed and his footsteps are heavy. "
				+ "He has green eyes with eye bags. He looks like he can pick you up with one arm and toss you.";
		henry = new Thing("Henry",henDesc, false, false);
		//enemyList
		enemyList.add(viktor);
		enemyList.add(brittany);
		enemyList.add(seb);
		enemyList.add(henry);
		
		//NPCs:
		// Dr. Connors
		final String drConDesc = "He's 6'2'' and lanky with dark circles under his eyes."
				+ "Dr. Connors has pale skin, messy black hair, and a sharp face. His face is skinny and his cheeks are hollow. "
				+ "He looks like he hasn't slept in days but still looks sharp. "
				+ "He looks like a depressed highschooler who has barely any food to eat but he has studied hard throughout his whole life to become a doctor. ";
		drConnors = new Thing ("Dr. Connors", drConDesc, false, false);
		//Nurse Tiffany
		final String nurseDesc = "She's average height but wears heels to appear taller. She dresses in a clean nurse uniform with barely any imperfections in sight. "
				+ "She naturally radiates light as she is very pretty and an optimistic person. With long, wavy blonde hair, she always has it in a clean bun so it doesn't interfere with her work. "
				+ "She smells like fresh roses and lemons when she walks by. When patients see her, they can't take their eyes off her. "
				+ "Her gentle blue eyes look calm yet fierce and she walks with confidence like nothing can harm her.";
		nurseTiffany = new Thing ("Nurse Tiffany,", nurseDesc, false, false);
		//Alexander
		final String alexDesc = "He's 6'3'' and buff. Has muscles in all the right places and everyone finds him attractive. He's big build makes him noticeable from across the hallways. "
				+ "With short brown hair that is always styled up, he loves to be by Nurse Mercy's side and protects her. Although he's buff, his face looks soft with soft features and big brown eyes. "
				+ "He has a tattoo sleeve on his right arm with random doodles of things he loves like dogs, gym, quotes, and symbols. He likes to wear oversized t-shirts to cover his muscles and wears baggy jeans.";
		alexander = new Thing ("Alexander", alexDesc, false, false);
		//Pastor Christian
		final String pastorDesc = "Religious guy who always carries around a bible. He will stop and pray for anyone who looks like they are in trouble. He's average height and average build. "
				+ "Nothing about him really stands out. He has black hair and brown eyes. Always wears a well-fitted suit and has a cross necklace on at all times. "
				+ "He looks clean and looks too rich to be an ordinary pastor.";
		pastorChristian = new Thing("Pastor Christian", pastorDesc, false, false);
		//npcList
		npcList.add(drConnors);
		npcList.add(nurseTiffany);
		npcList.add(alexander);
		npcList.add(pastorChristian);
		
		// Items:
		crowbar = new Thing("crowbar", "held by the zombie.Can do some serius damage if used as a weapon, but how do you get him to drop it?");
		patient = new Thing("depraved souless zombie","a zombie saying 'apple...apple...give me an apple and I'll give you a prize");
		apple = new Thing("apple","a fresh apple thats very ripe and ready to be eaten");
		idCard = new Thing("ID card","held by the entity. It Can be used to exit the asylum");
		nurse = new Thing("entity", "long hair covers this pale witch looking entity as it stares at a computer screen.");
		oldKey = new Thing("old key","an old key that says 'cafe'");
		npcList.add(patient);
		enemyList.add(nurse);
		//itemList.add(idCard);
		itemList.add(apple);
		itemList.add(oldKey);
		//////////////////////////////////////////////////////////////////////////////////////
		// Rooms and Room Lists
		//////////////////////////////////////////////////////////////////////////////////////
		// RoomList Initialization first  because we need them to initialize Rooms
		ThingList lobbyRoomList = new ThingList();
		lobbyRoomList.add(oldKey);
		
		ThingList clinicRoomList = new ThingList();
		clinicRoomList.add(apple);
		
		ThingList cafeteriaRoomList = new ThingList();
		//cafeteriaRoomList.add(crowbar);
		crowbar.setTakable(false);
		patient.setTakable(false);
		cafeteriaRoomList.add(patient);
		
		ThingList officeRoomList = new ThingList();
		//officeRoomList.add(idCard);
		idCard.setTakable(false);
		nurse.setTakable(false);
		officeRoomList.add(nurse);
		
		//Room Initialization
		Room lobby = new Room("Lobby","a lobby in an insane asylum",1, 3, 2, 4, lobbyRoomList, roomPrompt, true);
		Room clinic = new Room("Clinic", "A dark clinic with empty beds", -1, 0, -1, -1, clinicRoomList, roomPrompt, true);
		Room cafe = new Room("Cafe", "A caferteria with empty tables and a figure in a dark corner", -1, -1, -1, 0, cafeteriaRoomList, roomPrompt, false);
		Room office = new Room("Office", "A dark office with a single computer and some strange entity", 0, -1, -1, -1, officeRoomList, roomPrompt, true);
		Room exit = new Room("Exit", "You made it out of the insane asylum", -1, -1, -1, -1, exitList, exitPrompt, false);
		
		//////////////////////////////////////////////////////////////////////////////////////
		// Map build. index = room number
		//////////////////////////////////////////////////////////////////////////////////////
		map.add(lobby);
		map.add(clinic);
		map.add(cafe);
		map.add(office);
		map.add(exit);
		
		//////////////////////////////////////////////////////////////////////////////////////
		// Player initialization 
		//////////////////////////////////////////////////////////////////////////////////////
		player = new Actor("John Verrückt", "someone who doesnt know how they got where they are right now", playerlist,map.get(0));
		
	}//end of constructor GameBuild()
	
    //////////////////////////////////////////////////////////////////////////////////////////
    // Player and Map getters
    //////////////////////////////////////////////////////////////////////////////////////////
    public Actor getPlayer() 
    {
        return player;
    }
    
    public ArrayList<Room> getMap() 
	{
        return map;
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    // methods to take objects
    //////////////////////////////////////////////////////////////////////////////////////////
    private void transferObject(Thing t, ThingList fromlist, ThingList tolist) 
    {
        fromlist.remove(t);
        tolist.add(t);
    }
    
    String takeObject(String obname) 
    {
        String retStr = "";
        Thing t = player.getLocation().getThings().thisObject(obname);
        if(t.isTakable())
        {
        	transferObject(t, player.getLocation().getThings(), player.getThings());
            retStr = obname + " taken!";
        }
        return retStr;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    // Methods to move player location
    //////////////////////////////////////////////////////////////////////////////////////////
    private void moveActorTo(Actor p, Room aRoom) 
    {
        p.setLocation(aRoom);
    }

    private int moveTo(Actor anActor, Directions dir) 
    {
        
    	//get room and declare exit
    	Room r = anActor.getLocation();
    	int exit;
    	
    	//////////////////////////////////////////////////////////////////////////////////////
    	// Get room number for each direction and unlocked status.
    	// Try/catch deals with room number = -1
    	// Although there is no room, treat it as unlocked to return NO EXIT to user
    	//////////////////////////////////////////////////////////////////////////////////////
    	//North
    	int roomNorth = r.getNorth();
        boolean northUnlocked;
		try 
		{
			northUnlocked = map.get(roomNorth).isUnlocked();
		} 
		catch (Exception e) 
		{
			northUnlocked = true; 
		}
        
		//South
        int roomSouth = r.getSouth();
        boolean southUnlocked;
		try 
		{
			southUnlocked = map.get(roomSouth).isUnlocked();
		} 
		catch (Exception e) 
		{
			southUnlocked = true; 
		}
        
        //East
		int roomEast = r.getEast ();
        boolean eastUnlocked;
		try 
		{
			eastUnlocked = map.get(roomEast).isUnlocked();
		} 
		catch (Exception e) 
		{
			eastUnlocked = true; 
		}
        
        //West
        int roomWest = r.getWest();
        boolean westUnlocked;
		try 
		{
			westUnlocked = map.get(roomWest).isUnlocked();
		} 
		catch (Exception e) 
		{
			westUnlocked = true;
		}
        
    	//////////////////////////////////////////////////////////////////////////////////////
		// Switch returns constant representing the room number moved to or NOEXIT
        // Try to move player in direction indicated by dir.
        // If room is locked, then stay in same room. Else got to new room.
    	//////////////////////////////////////////////////////////////////////////////////////
        switch (dir) 
        {
            case NORTH:
                if(northUnlocked)
                {
                	exit = roomNorth;
                    break;
                }
                else
                {
                	System.out.println("That room is locked.");
                	exit = Directions.NOEXIT; //stay in same room
                    break;
                }
                
            case SOUTH:
            	if(southUnlocked)
                {
                	exit = roomSouth;
                    break;
                }
                else
                {
                	System.out.println("That room is locked.");
                	exit = Directions.NOEXIT; //stay in same room
                    break;
                }
            	
            case EAST:
            	if(eastUnlocked)
                {
                	exit = roomEast;
                    break;
                }
                else
                {
                	System.out.println("That room is locked.");
                	exit = Directions.NOEXIT; //stay in same room
                    break;
                }
            	
            case WEST:
            	if(westUnlocked)
                {
                	exit = roomWest;
                    break;
                    
                }
                else
                {
                	System.out.println("That room is locked.");
                	exit = Directions.NOEXIT; //stay in same room
                    break;
                }
            	
            default:
                exit = Directions.NOEXIT; //stay in same room
                break;
        }
        // If exit room value != -1, then move player and return room number.
        if (exit != Directions.NOEXIT) 
        {
            moveActorTo(anActor, map.get(exit));
        }
        return exit;
    }

   void movePlayerTo(Directions dir) 
   {
        // if roomNumber = NOEXIT, display a special message, otherwise
        // display text (e.g. name and description of room)                
        if (moveTo(player, dir) == Directions.NOEXIT) 
        {
            showStr("No Exit!");
        } 
        else 
        {            
            //look();
        }
    }

    void goNorth() 
    {
        movePlayerTo(Directions.NORTH);
    }

    void goSouth() 
    {
        movePlayerTo(Directions.SOUTH);
    }

    void goWest() 
    {
        movePlayerTo(Directions.WEST);
    }

    void goEast() 
    {
        movePlayerTo(Directions.EAST);
    }

    void look() 
    {
        showStr("You are in the " + getPlayer().getLocation().describe());
    }

    void showStr(String s) 
    {
        System.out.println(s);
    } // end of methods to move player
    
    //////////////////////////////////////////////////////////////////////////////////////////
    // Misc game methods (self explanatory) 
    //////////////////////////////////////////////////////////////////////////////////////////
    void showInventory() 
    {
        showStr("You have\n" + getPlayer().getThings().describeThings());
    }
    
    public void showPrompt()
    {
    	Room room = getPlayer().getLocation();
		int roomN = room.getNorth();
		int roomS = room.getSouth();
		int roomE = room.getEast();
		int roomW = room.getWest();
		System.out.println(room.getPrompt());
		// north
		if(room.getNorth() != -1)
		{
			System.out.println("w: go north ("+ getMap().get(roomN).getName() + ")");
		}
		else
		{
			System.out.println("w: go north (no exit)");
		}
		//south
		if(room.getSouth() != -1)
		{
			System.out.println("s: go south ("+ getMap().get(roomS).getName() + ")");
		}
		else
		{
			System.out.println("s: go south (no exit)");
		}
		//east
		if(room.getEast() != -1)
		{
			System.out.println("d: go east ("+ getMap().get(roomE).getName() + ")");
		}
		else
		{
			System.out.println("d: go east (no exit)");
		}
		//east
		if(room.getWest() != -1)
		{
			System.out.println("a: go west ("+ getMap().get(roomW).getName() + ")");
		}
		else
		{
			System.out.println("a: go west (no exit)");
		}		
    }

    public void showIntro() 
    {
        String s;
        
        s = "You awaken in a dark insane asylum lobby.\n"
                + "You dont know how you got there.\n"
        		+ "You only know your name: " + player.getName()+ "\n";
        showStr(s);
        look();
    }
    
    // Method for unlocking doors and telling user what door is unlocked (only tells them once)
    boolean oldKeyPrompt = true;
    public void checkKeys(ThingList inventory)
    {
    	
    	if(inventory.contains(oldKey) && oldKeyPrompt)
    	{
    		System.out.println("old key can open Cafe");
    		map.get(2).setUnlocked(true);
    		oldKeyPrompt = false;
    	}
    	if(inventory.contains(idCard))
    	{
    		map.get(4).setUnlocked(true);
    	}
    	//etc
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    // Methods to runs player command
    //////////////////////////////////////////////////////////////////////////////////////////
    
    String itemType(Thing t)
    {
    	if(enemyList.contains(t))
    	{
    		return "enemy";
    	}
    	else if(npcList.contains(t))
    	{
    		return "npc";
    	}
    	else //itemList.contains(t)
    	{
    		return "item";
    	}
    }
    
    void itemInteract(Thing item)
    {
    	takeObject(item.getName());
    	System.out.println("You picked up " +item.getName());
    }
    
    void enemyInteract(Thing enemy)
    {
    	switch(enemy.getName())
    	{
    		case "entity":
    		{
    			if(playerlist.contains(crowbar))
    			{
    				System.out.println("You killed entity.");
    				playerlist.remove(crowbar);
    				//if enemy has item
    				playerlist.add(idCard);
    				System.out.println("You picked up " + idCard.getName()+".");
    				nurse.setDescription("Its laying in a pool of blood...");
    				//officeRoomList.remove(entity);//need to declare obects in class not contructor
    				break;
    			}
    			else
    			{
    				if(!playerlist.contains(idCard))
    				{
	    				System.out.println("Entity captured you.");
	    				player.setIsAlive(false);
	    				break;
    				}
    				else
    				{
    					System.out.println("Why didn't it put up a fight?");
    				}
    			}
    		}
    		
    	}
    }
    
    void npcInteract(Thing npc)
    {
    	switch(npc.getName())
    	{
    		case "depraved souless zombie":
    		{
    			if(playerlist.contains(apple))
    			{
    				playerlist.remove(apple);
    				playerlist.add(crowbar);
    				System.out.println("He gave  you a " + crowbar.getName() + ".");
    				patient.setDescription("He is eating an apple");
    				break;
    			}
    			else
    			{
    				if(playerlist.contains(crowbar))
    				{
    					System.out.println("You would rather not bother him anymore...");
    					break;
    				}
    				else
    				{
    					System.out.println("He wants you to give him an " + apple.getName() + "." );
    					break;
    				}
    			}
    		}
    	}
    }
    
    public void runCommand(String inputString) 
    {
    	
        String lowString = inputString.trim().toLowerCase();
        Room room = player.getLocation();
        ThingList roomList = room.getThings();
        
        if (!lowString.equals("q")) 
        {
            switch(lowString)
            {
	            //cases for directions
	            case "q":
	            	System.exit(0);
	            	break;
	            case "i" :
	            	showInventory();
	            	break;
	            case "w" :
	            	goNorth();
	            	break;
	            case "s" :
	            	goSouth();
	            	break;
	            case "d" :
	            	goEast();
	            	break;
	            case "a" :
	            	goWest();
	            	break;
	            //cases for interactions
	            case "0":
					try 
					{
						Thing thing = roomList.get(0);
						//System.out.println("thing = "+thing.getName());
						String thingType =itemType(thing);
						//System.out.println(thingType);
						switch (thingType)
						{
							case "item":
								itemInteract(thing);
								break;
							case "enemy":
								enemyInteract(thing);
								break;
							case "npc":
								//System.out.println("case: npc");
								npcInteract(thing);
								//System.out.println("interacted");
								break;
						}
						break;
					} 
					catch (Exception e) 
					{
						System.out.println("Invalid Command!");
						break;
					}
					
	            case "1":
	            	try 
					{
						Thing thing = roomList.get(1);
						String thingType =itemType(thing);
						switch (thingType)
						{
							case "item":
								itemInteract(thing);
								break;
							case "enemy":
								enemyInteract(thing);
								break;
							case "npc":
								npcInteract(thing);
								break;
						}
					} 
					catch (Exception e) 
					{
						System.out.println("Invalid Command!");
						break;
					}
	            	break;
	            	
	            default:
	            	System.out.println("invalid command");
	            	break;
            }
        }
        checkKeys(player.getThings()); // check if new doors were unlocked
    }  
}
