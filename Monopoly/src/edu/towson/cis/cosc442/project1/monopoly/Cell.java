package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
//Pushed down and then pulled up members of this class
public abstract class Cell implements IOwnable {
	
	/** The available. */
	private boolean available = true;
	
	/** The name. */
	private String name;
	
	/** The owner. */
	protected Player theOwner;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the the owner.
	 *
	 * @return the the owner
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * Play action.
	 *
	 * @param msg the msg
	 * @return true, if successful
	 */
	public abstract boolean playAction(String msg);

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the the owner.
	 *
	 * @param owner the new the owner
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }

	/**
	 * Player moved.
	 *
	 * @param player the player
	 * @param playerIndex the player index
	 * @param gameMaster the game master
	 */
	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);
}
