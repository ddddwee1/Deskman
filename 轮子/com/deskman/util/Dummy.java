package com.deskman.util;

import java.util.*;


import com.deskman.logic.Calculator;

/**
 * Class to store player information during explore.
 * 需要做成父类或者接口，回去再研究。
 */
public abstract class Dummy {
	//***********************************
	// Fields
	//***********************************
	private int id;
	private String name;
	private HashMap<Integer, Integer> set;
	
	private ArrayList<String> status;
	private float health;
	private float maxHealth;
	private float mana;
	private float maxMana;
	private int move; // 这是啥
	private float[] amplifier;
	private float[] resistance;

	//***********************************
	// Constructors
	//***********************************
	private Dummy() {};



	public float[] getAmplifier() {
		return this.amplifier;
	}

	public float[] setAmplifier(int index, float value) {
		this.amplifier[index] = value;
		return this.amplifier;
	}

	public float[] getResistance() {
		return this.resistance;
	}

	public float[] setResistance(int index, float value) {
		this.resistance[index] = value;
		return this.resistance;
	}

	public float getHealth() {
		return this.health;
	}

	public float loseHealth(float dmg) {
		this.health = health - dmg > 0 ? health - dmg : 0;
		return this.health;
	}

	public float gainHealth(float heal) {
		this.health = heal + health < this.maxHealth ? heal + health : this.maxHealth;
		return this.health;
	}

	public float setHealth(float health) {
		if (health >= 0 && health <= this.maxHealth) // 超出范围老子不管
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

		public float getMana() {
		return this.mana;
	}

	public float loseMana(float usage) {
		this.mana = mana - usage > 0 ? mana - usage : 0;
		return this.mana;
	}

	public float gainMana(float restore) {
		this.mana = mana + restore < this.maxMana ? mana + restore : this.maxMana;
		return this.mana;
	}

	public float setMana(float mana) {
		if (mana >= 0 && mana <= this.maxMana) // 超出范围老子不管
			this.mana = mana;
		return this.mana;
	}

	public float getMaxMana() {
		return this.maxMana;
	}

	// Warning: this is set MAX health, think twice before you use it.
	public float setMaxMana(float maxHealth) {
		this.maxMana = maxMana;
		return this.maxMana;
	}

	public int getMove() {
		return this.move;
	}

	public int setMove(int move) {
		if (move >= 0)
			this.move = move;
		return this.move;
	}

	public ArrayList<String> getStatus() {
		return this.status;
	}	

	public ArrayList<String> addStatus(String... status) {
		for (int i=0;i<status.length;i++) {
			this.status.add(status[i]);
		}
		return status;
	}

	public void clearStatus(String... status) {
		this.status.clear();
	}

	public HashMap<Integer, Integer> getSet() {
		return this.set;
	}

	// WARNING: Use with caution.
	public HashMap<Integer, Integer> setSet(HashMap<Integer, Integer> set) {
		this.set = set;
		return this.set;
	}

	public String getName() {
		return this.name;
	}

	// 请玩家不要在战斗中改名，这个方法不应该在任何时候被使用。
	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public int getId() {
		return this.id;
	}
}