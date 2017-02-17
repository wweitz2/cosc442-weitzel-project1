package edu.towson.cis.cosc442.project1.monopoly;

//Pushed down and then pulled up members of this class
public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);
}
