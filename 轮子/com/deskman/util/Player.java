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
 	private ArrayList<HashMap<Integer, Integer>> sets = new ArrayList<HashMap<Integer, Integer>>(6);
 	private int activeSet = 0;

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

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;	
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public long getLastOnline() {
		return lastOnline;
	}

	public void setLastOnline(long lastOnline) {
		this.lastOnline = lastOnline;
	}

	public String[] getItemKeys() {
		return this.Item.keySet().toArray();
	}

	public String[] getItemValues() {
		return this.Item.values().toArray();
	}

	public Object getItemValue(String ItemKey) {
		return this.Item.get(ItemKey);
	}

	public void setItem(String ItemKey, Object ItemValue) {
		this.Item.put(ItemKey, ItemValue);
	}

	public void addItem(String ItemKey, Object ItemValue) {
		if (this.Item.get(ItemKey)==null)
			this.Item.put(ItemKey, ItemValue);
		// 我懒得throw exception
	}

	public String[] getSkillKeys() {
		return this.Skill.keySet().toArray();
	}

	public String[] getSkillValues() {
		return this.Skill.values().toArray();
	}

	public Object getSkillValue(String SkillKey) {
		return this.Skill.get(SkillKey);
	}

	public void setSkill(String SkillKey, Object SkillValue) {
		this.Skill.put(SkillKey, SkillValue);
	}

	public void addSkill(String SkillKey, Object SkillValue) {
		if (this.Skill.get(SkillKey)==null)
			this.Skill.put(SkillKey, SkillValue);
		// 我懒得throw exception
	}

	public String[] getExAttrKeys() {
		return this.exAttr.keySet().toArray();
	}

	public Object getExAttrValue(String attrKey) {
		return this.exAttr.get(attrKey);
	}

	public void setExAttr(String attrKey, Object attrValue) {
		this.exAttr.put(attrKey, attrValue);
	}

	public void addExAttr(String attrKey, Object attrValue) {
		if (this.exAttr.get(attrKey)==null)
			this.exAttr.put(attrKey, attrValue);
		// 我懒得throw exception
	}

	public void delExAttr(String attrKey) {
		this.exAttr.remove(attrKey);
	}

	public HashMap<Integer, Integer> getSet(int index) {
		return this.sets.get(index);
	}

	public void setSet(int index, HashMap<Integer, Integer> set) {
		this.sets.set(index, set);
	}

	public int getActiveSet() {
		return this.activeSet;
	}

	public void setActiveSet(int index) {
		this.activeSet = index;
	}
}