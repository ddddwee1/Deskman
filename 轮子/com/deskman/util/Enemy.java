package com.deskman.util;

public class Enemy extends Dummy{
	//***********************************
	// Fields
	//***********************************
	private int variaty;
	private HashSet<String> category;

	//***********************************
	// Constructors
	//***********************************
	public Enemy(Monster monster) {
		this.id = monster.getId();
		this.variaty = monster.getVariaty();
		this.category = monster.getCategory();
		this.name = monster.getName();
		this.set = monster.getSet();
		this.status = monster.getStatus();
		float iniHealth = monster.getHealth();
		float iniMana = monster.getMana();
		int iniMove = 1; // Actually I have no idea what move is, I need to think that why I add this feature.
		float[] iniAmplifier = new float[]{0,0,0,0,0,0}; //I don't think we really have default amplifiers.
		float[] iniResistance = new flaot[]{0,0,0,0,0,0};
		float[] attributes = new float[]{iniHealth, iniMana, iniMove, 
			iniAmplifier[0], iniAmplifier[1], iniAmplifier[2], iniAmplifier[3], iniAmplifier[4], iniAmplifier[5]},
			iniResistance[0],iniResistance[1],iniResistance[2],iniResistance[3],iniResistance[4],iniResistance[5]; // 先假设有6个amp
		attributes = Calculator.modiAttributes(attributes, null, status);
		
		// Set new attributes
		this.health = attributes[0];
		this.maxHealth = attributes[0];
		this.mana = attributes[1];
		this.maxMana = attributes[1];
		this.move = attributes[2];
		this.amplifier = Arrays.copyOfRange(attributes, 3, 8);
		this.resistance = Arrays.copyOfRange(attributes, 9, 14);
	}

	//***********************************
	// Methods
	//***********************************
	public HashSet<String> getCategory() {
		return	this.category;
	}

	// WARNING: Use with caution.
	public HashSet<String> setCategory(HashSet<String> category) {
		this.category = category;
		return this.category;
	}

	public int getVariaty() {
		return this.variaty;
	}

	// WARNING: Use with caution.
	public int setVariaty(int variaty) {
		this.variaty = variaty;
		return this.variaty;
	}
}