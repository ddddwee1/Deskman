package com.deskman.util;

import java.util.HashMap;
import java.util.HashSet;
//
// TODO 为用户个性化物品。
//
public class Item {
	private String name;
	private int id = -1;
	private int instance = -1; // -1为白版存在资料库里，用户每得到该物品就新生成一个放在用户资料里
	private int exp = -1;
	private int rarity = -1;
	private String type = "equipment"; // skill, consumable, equipment
	private HashSet<String> category = new HashSet<String>(); //label & tag & item pool
 	private HashMap<String, String> attr = new HashMap<String, String>();
 	private HashMap<String, Object> exAttr = new HashMap<String, Object>();

	public Item() {};

	public Item(String name) {
		this.name = name;
	}

	public Item(String name, int id, int rarity, String type) {
		this.id = id;
		this.name = name;

		this.rarity = rarity;
		this.type = type;
	}

	public Item(String name, int id, int instance, int exp, int rarity, String type) {
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.rarity = rarity;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstance() {
		return instance;
	}

	public void setInstance(int id) {
		this.instance = instance;
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

	public void delExAttr(String attrKey) {
		this.exAttr.remove(attrKey);
	}
}