package com;

public class Event {
	
	public static Event[] events = {
    	//flow of execution
    	new Event(0x04, 0x4, "Synchronous Timer"),
    	new Event(0x08, 0x4, "Asynchronous Timer"),
    	new Event(0x0C, 0x4, "Set Loop"),
    	new Event(0x10, 0x4, "Execute Loop"),
    	new Event(0x14, 0x8, "GoTo"),
    	new Event(0x18, 0x4, "Return"),
    	new Event(0x1C, 0x8, "Subroutine"),
    	new Event(0x4C, 0x4, "Autocancel"),
    	new Event(0x5C, 0x4, "Allow Interrupt (IASA)"),
    	//The HexString associated with Continuation Control is often absent
    	//in the aerial versions of special moves(See shiek's needle moves)
    	//It's possible that D0 00 00 03 is used to set a flag letting the game
    	//know that the character is on ground.
    	new Event(0xD0, 0x4, "Continuation control?"),
    	new Event(0xE0, 0x8, "Start Smash Charge"),
    	//collisions
    	new Event(0x2C, 0x14, "Hitbox"),
    	new Event(0x40, 0x4, "Terminate Collisions"),
    	new Event(0x68, 0x4, "Body State"),
    	new Event(0x88, 0xC, "Throw"),
    	//other
    	new Event(0xAC, 0x4, "Generate article?"),
    	new Event(0xCC, 0x4, "Self-Damage"),
    	new Event(0x50, 0x4, "Reverse Direction"),
    	new Event(0x28, 0x14, "Graphic Effect"),
    	new Event(0x44, 0xC, "Sound Effect"),
    	new Event(0x48, 0x4, "Random Smash SFX"),
    	
    	//
    	new Event(0x7C, 0x4, "Model mod")
    	
    };

	public int id, length;
	public String name;
	
	public Event(int i, int l, String n){
		id = i;
		length = l;
		name = n;
	}
	
	
	public static Event getEvent(int k){
		for(int i = 0; i < events.length; i++){
			if(k==events[i].id){
				return events[i];
			}
		}
		//System.out.println("SHIIIEEEET SON, THERE BE ERRRS");
		return new Event(k, 4, "Unknown");
	}
	
	

}