package com.deskman.util;

import java.util.*;

public class Player {
	private String name;
	private int id = -1;
	private int exp = 0;
	private long lastOnline = 0;
 	private HashMap<Integer, Integer> item = new HashMap<Integer, Integer>();
 	private HashMap<Integer, Integer> skill = new HashMap<Integer, Integer>();
 	private HashMap<String, Object> exAttr = new HashMap<String, Object>();
 	private ArrayList<String> status = new ArrayList<String>();
 	private ArrayList<HashMap<Integer, Integer>> sets = new ArrayList<HashMap<Integer, Integer>>(6);
 	private int activeSet = 0;
 	private ArrayList<HashMap<Integer, Integer>> equipments = new ArrayList<HashMap<Integer, Integer>>(6);
 	private int activeEquipment = 0;
 	private float hp = 100;
 	private float mp = 100;


	//***********************************
	// Constructors
	//***********************************
	public Player() {};

	public Player(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Player(String name, int id, int exp) {
		this.id = id;
		this.name = name;
		this.exp = exp;
	}

	//***********************************
	// Methods
	//***********************************
	public int getId() {
		return id;
	}

	public int setId(int id) {
		this.id = id;
		return id;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public int getExp() {
		return exp;	
	}

	public int setExp(int exp) {
		this.exp = exp;
		return this.exp;
	}

	public long getLastOnline() {
		return lastOnline;
	}

	public long setLastOnline(long lastOnline) {
		this.lastOnline = lastOnline;
		return this.lastOnline;
	}

	public Integer[] getItemKeys() {
		return this.item.keySet().toArray();
	}

	public Integer[] getItemValues() {
		return this.item.values().toArray();
	}

	public Integer getItemValue(Integer itemKey) {
		return this.item.get(itemKey);
	}

	public Integer setItem(Integer itemKey, Integer itemValue) {
		if (itemValue != null)
			this.item.put(itemKey, itemValue);
		return this.item.get(itemKey);
	}

	public Integer addItem(Integer itemKey, Integer itemValue) {
		if (this.item.get(itemKey)==null && itemValue!=null)
			this.item.put(itemKey, itemValue);
		// 我懒得throw exception
		return this.item.get(itemKey);
	}

	public void delItem(String itemKey) {
		this.item.remove(itemKey);
	}

	public Integer[] getSkillKeys() {
		return this.skill.keySet().toArray();
	}

	public Integer[] getSkillValues() {
		return this.skill.values().toArray();
	}

	public Integer getSkillValue(Integer skillKey) {
		return this.skill.get(skillKey);
	}

	public Integer setSkill(Integer skillKey, Integer skillValue) {
		if (skillValue != null)
			this.skill.put(skillKey, skillValue);
		return this.skill.get(skillKey);
	}

	public Integer addSkill(Integer skillKey, Integer skillValue) {
		if (this.skill.get(skillKey)==null && skillValue != null)
			this.skill.put(skillKey, skillValue);
		// 我懒得throw exception
		return this.skill.get(skillKey);
	}

	public void delSkill(Integer skillKey) {
		this.skill.remove(skillKey);
	}

	public String[] getExAttrKeys() {
		return this.exAttr.keySet().toArray();
	}

	public Object getExAttrValue(String attrKey) {
		return this.exAttr.get(attrKey);
	}

	public Object setExAttr(String attrKey, Object attrValue) {
		this.exAttr.put(attrKey, attrValue);
		return this.exAttr.get(attrKey);
	}

	public Object addExAttr(String attrKey, Object attrValue) {
		if (this.exAttr.get(attrKey)==null)
			this.exAttr.put(attrKey, attrValue);
		return this.exAttr.get(attrKey);
		// 我懒得throw exception
	}

	public void delExAttr(String attrKey) {
		this.exAttr.remove(attrKey);
	}

	public HashMap<Integer, Integer> getSet(int index) {
		return this.sets.get(index);
	}

	public HashMap<Integer, Integer> setSet(int index, HashMap<Integer, Integer> set) {
		this.sets.set(index, set);
		return this.sets.get(index);
	}

	public int getActiveSet() {
		return this.activeSet;
	}

	public int setActiveSet(int index) {
		this.activeSet = index;
		return this.activeSet;
	}

	public HashMap<Integer, Integer> getEquipment(int index) {
		return this.equipments.get(index);
	}

	public HashMap<Integer, Integer> setEquipment(int index, HashMap<Integer, Integer> equipment) {
		this.equipments.set(index, equipment);
		return this.equipments.get(index);
	}

	public int getActiveEquipment() {
		return this.activeEquipment;
	}

	public int setActiveEquipment(int index) {
		this.activeEquipment = index;
		return this.activeEquipment;
	}

	public float getHealth() {
		return this.hp;
	}

	public float getMana() {
		return this.mp;
	}

	// Do NOT use this two function in normal condition
	public float setHealth(float hp) {
		return this.hp;
	}

	// Do NOT use this two function in normal condition
	public float setMana(float mp) {
		return this.mp;
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
}