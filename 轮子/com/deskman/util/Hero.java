package com.deskman.util;

import com.deskman.idle.*;
import java.util.*;

/**
 * Class to store player information during explore.
 *
 */
public class Hero {
	//***********************************
	// Field
	//***********************************
	private HashMap<Integer, Integer> set;
	private HashMap<Integer, Integer> equipments;
	private String[] status;
	private float health;
	private float maxHealth;
	private float mana;
	private float maxMana;
	// private int move;
	private float[] amplifier;

	//***********************************
	// Constructors
	//***********************************
	private hero() {};

	public hero(Player player) {
		int activeSet = player.getActiveSet();
		this.set = player.getSet(activeSet);
		this.equipments = player.getEquipment();
		this.status = player.getStatus();
		float iniHealth = player.getHealth();
		float iniMana = player.getMana();
		int iniMove = player.getMove();
		float iniAmplifier[] = player.getAmplifier(); //I don't do we really have default amplifier.
		float[] attributes = new float[]{iniHealth, iniMana, iniMove, 
			iniAmplifier[0], iniAmplifier[1], iniAmplifier[2], iniAmplifier[3], iniAmplifier[4], iniAmplifier[5]}; // 先假设有6个amp
		attributes = Mechanism.modiAttributes(attributes, equipments, status);
		
		// Set new attributes
		this.health = attributes[0];
		this.maxHealth = attributes[0];
		this.mana = attributes[1];
		this.maxMana = attributes[1];
		this.move = attributes[2];
		this.amplifier = Arrays.copyOfRange(attributes, 3, 8);
	}

	public float[] getAmplifier() {
		return this.amplifier;
	}

	public void setAmplifier(int index, float value) {
		this.amplifier[index] = value;
	}

	public float getHealth() {
		return this.health;
	}

	public float loseHealth(float dmg) {
		this.health -= dmg;
		return this.health;
	}

	public float gainHealth(float heal) {
		this.health += heal;
		return this.health;
	}

	public float setHealth(float health) {
		this.health = health;
		return this.health;
	}

	public float getMaxHealth() {
		return this.maxHealth;
	}

	// Warning: this is set MAX health, think twice before you use it.
	public float setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
		return this.maxHealth;
	}
}