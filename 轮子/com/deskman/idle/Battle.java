package com.deskman.idle;

import java.util.ArrayList;


//
// 需要玩家红蓝，当前牌组。怪物红蓝牌组。
//
public class Battle {
	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Monster> monsters = new ArrayList<Monster>();


	//***********************************
	// Constructors
	//***********************************
	public Battle() {};

	public Battle(Player player) {
		this.setPlayer(player);
	}

	public Battle(ArrayList<Player> players) {
		this.setPlayer(players);
	}

	public Battle(Monster monster) {
		this.setMonster(monster);
	}

	public Battle(ArrayList<Monster> monsters) {
		this.setMonster(monsters);
	}

	public Battle(Player player, Monster monster) {
		this.setPlayer(player);
		this.setMonster(monster);
	}

	public Battle(Player player, ArrayList<Monster> monsters) {
		this.setPlayer(player);
		this.setMonster(monsters);
	}

	public Battle(ArrayList<Player> players, Monster monster) {
		this.setPlayer(players);
		this.setMonster(monster);
	}

	public Battle(ArrayList<Player> players, ArrayList<Monster> monsters) {
		this.setPlayer(players);
		this.setMonster(monsters);
	}

	//***********************************
	// Methods
	//***********************************
	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public void addPlayer(ArrayList<Player> players) {
		this.players.addAll(players);
	}

	public void addMonster(Monster monster) {
		this.monsters.add(monster);
	}

	public void addMonster(ArrayList<Monster> monsters) {
		this.monsters.addAll(monsters);
	}

	public void setPlayer(Player player) {
		this.players = new ArrayList<Player>();
		this.players.add(player);
	}

	public void setPlayer(ArrayList<Player> players) {
		this.players = new ArrayList<Player>();
		this.players.addAll(players);
	}

	public void setMonster(Monster monster) {
		this.monsters = new ArrayList<Monster>();
		this.monsters.add(monster);
	}

	public void setMonster(ArrayList<Monster> monsters) {
		this.monsters = new ArrayList<Monster>();
		this.monsters.addAll(monsters);
	}

	private ArrayList<Item> generateCardList() {
		// 当前打算按照己方全部操作结束之后敌方操作写
		for (player:players) {
			int activeSet = player.getActiveSet();
			HashMap<Integer, Integer> cards = player.getSet(activeSet);
		}
	}

	private void shuffle(HashMap<Integer, Integer> cards) {

	}
	// 这边我写不下去了，需要先商量好如何做在线模式。（在线 和 多人）
	public void start() {
		int nPlayer = this.players.size();
		int nMonster = this.monsters.size();
		if (nPlayer < 1 || nMonster < 1) return null;
		if (nPlayer == 1)
			this.startLocal();
		else
			this.startOnline();
	}



}