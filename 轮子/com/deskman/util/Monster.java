package com.deskman.util;

public class Monster {
	//***********************************
	// Fields
	//***********************************
	private int id;
	private String name;
	private int variaty = 0;
	private int rarity = -1;
	private int level = -1;
	private ArrayList<String> status = new ArrayList<String>();
	private HashMap<Integer, Integer> set = new HashMap<Integer, Integer>;
	private HashSet<String> category = new HashSet<String>();
	private HashMap<String, Object> exAttr = new HashMap<String, Object>();
	private float hp = 100;
 	private float mp = 100;

 	//***********************************
	// Constructors
	//***********************************
 	private Monster() {};

 	public Monster(String name, int id) {
 		this.name = name;
 		this.id = id;
 	}

 	public Monster(String name, int id, int variaty, int rarity, int level) {
 		this.name = name;
 		this.id = id;
 		this.variaty = variaty;
 		this.rarity = rarity;
 		this.level = level;
 	}

 	//***********************************
	// Methods
	//***********************************
	public int getId() {
		return this.id;
	}

	public int setId(int id) {
		this.id = id;
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public int getVariaty() {
		return this.variaty;
	} 

	public int setVariaty(int variaty) {
		this.variaty = variaty;
		return this.variaty;
	} 

	public int getLevel() {
		return this.level;
	}

	public int setLevel(int level) {
		this.level = level;
		return this.level;
	}

	public int getRarity() {
		return this.rarity;
	}

	public int setRarity(int rarity) {
		this.rarity = rarity;
		return this.rarity;
	}

	public float getHealth() {
		return this.hp;
	}

	public float setHealth(float hp) {
		this.hp = hp;
		return this.hp;
	}

	public float getMana() {
		return this.mp;
	}

	public float setMana(float mp) {
		this.mp = mp;
		return this.mp;
	}

	public ArrayList<String> getStatus() {
		return this.status;
	}

	public ArrayList<String> setStatus(ArrayList<String> status) {
		this.status = status;
		return this.status;
	}

	public ArrayList<String> addStatus(ArrayList<String> status) {
		this.status.addAll(status);
		return this.status;
	} 

	public ArrayList<String> addStatus(String status) {
		this.status.add(status);
		return this.status;
	}

	public ArrayList<String> clearStatus(String status) {
		this.status.removeAll();
		return this.status;
	}

	public HashMap<Integer, Integer> getSet() {
		return this.set;
	}

	public HashMap<Integer, Integer> setSet(HashMap<Integer, Integer> set) {
		this.set = set;
		return this.set;
	}

	public HashSet<String> getCategory() {
		return this.category;
	}

	public HashSet<String> setCategory(HashSet<String> category) {
		this.category = category;
		return this.category;
	}

	public HashSet<String> addCategory(String category) {
		this.category.add(category);
		return this.category;
	}

	public HashSet<String> delCategory(String category) {
		this.category.remove(category);
		return this.category;
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
}