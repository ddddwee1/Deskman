package com.deskman.util;

public class Hero extends Dummy {
	//***********************************
	// Fields
	//***********************************
	private HashMap<Integer, Integer> equipments;

	//***********************************
	// Constructors
	//***********************************
	public Hero(Player player) {
		this.id = player.getId();
		this.name = player.getName();
		int activeSet = player.getActiveSet();
		this.set = player.getSet(activeSet);
		int activeEquipment = player.getActiveEquipment();
		this.equipments = player.getEquipment(activeEquipment);
		this.status = player.getStatus();
		float iniH	ealth = player.getHealth();
		float iniMana = player.getMana();
		int iniMove = 1; // Actually I have no idea what move is, I need to think that why I add this feature.
		float[] iniAmplifier = new float[]{0,0,0,0,0,0}; //I don't think we really have default amplifiers.
		float[] iniResistance = new flaot[]{0,0,0,0,0,0};
		float[] attributes = new float[]{iniHealth, iniMana, iniMove, 
			iniAmplifier[0], iniAmplifier[1], iniAmplifier[2], iniAmplifier[3], iniAmplifier[4], iniAmplifier[5]},
			iniResistance[0],iniResistance[1],iniResistance[2],iniResistance[3],iniResistance[4],iniResistance[5]; // 先假设有6个amp
		attributes = Calculator.modiAttributes(attributes, equipments, status);
		
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
	public HashMap<Integer, Integer> getEquipment() {
		return this.equipments;
	}

	// WARNING: Use with caution.
	public HashMap<Integer, Integer> setEquipment(HashMap<Integer, Integer> equipments) {
		this.equipments = equipments;
		return this.equipments;
	}
}