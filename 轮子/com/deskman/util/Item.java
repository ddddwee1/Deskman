package com.deskman.util;

import java.util.HashMap;
import java.util.HashSet;

public class Item {
	private String name;
	private int id = -1;
	private int level = -1;
	private int rarity = -1;
	private String type = "equipment"; // skill, consumable, equipment
	private HashSet<String> category = new HashSet<String>(); //label & tag & item pool
 	private HashMap<String, String> attr = new HashMap<String, String>();
 	private HashMap<String, Object> exAttr = new HashMap<String, Object>();

	public Item() {};

	public Item(String name) {
		this.name = name;
	}

	public Item(String name, int id, int level, int rarity, String type) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.rarity = rarity;
		this.type = type;
	}

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

	public int getLevel() {
		return level;	
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getCate() {
		return this.category.toArray();
	}

	public boolean addCate(String cateKey) {
		return this.category.add(cateKey);
	}

	public boolean delCate(String cateKey) {
		return this.category.remove(cateKey);
	}

	public String[] getAttrKeys() {
		return this.attr.keySet().toArray();
	}

	public String[] getAttrValues() {
		return this.attr.values().toArray();
	}

	public Object getAttrValue(String attrKey) {
		return this.attr.get(attrKey);
	}

	public void setAttr(String attrKey, Object attrValue) {
		this.attr.put(attrKey, attrValue);
	}

	public void addAttr(String attrKey, Object attrValue) {
		if (this.attr.get(attrKey)==null)
			this.attr.put(attrKey, attrValue);
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
}