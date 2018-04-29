package com.deskman.idle;

import java.util.ArrayList;


import com.deskman.util.Hero;


//
// 需要知道玩家红蓝，当前牌组。怪物红蓝牌组。
//
public class Battle {
	//***********************************
	// Fields
	//***********************************
	private ArrayList<Hero> heroes = new ArrayList<Hero>();
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();


	//***********************************
	// Constructors
	//***********************************
	public Battle() {};

	public Battle(Hero hero) {
		this.setHero(hero);
	}

	public Battle(ArrayList<Hero> heroes) {
		this.setHero(heroes);
	}

	public Battle(Enemy enemy) {
		this.setEnemy(enemy);
	}

	public Battle(ArrayList<Enemy> enemies) {
		this.setEnemy(enemies);
	}

	public Battle(Hero hero, Enemy enemy) {
		this.setHero(hero);
		this.setEnemy(enemy);
	}

	public Battle(Hero hero, ArrayList<Enemy> enemies) {
		this.setHero(hero);
		this.setEnemy(enemies);
	}

	public Battle(ArrayList<Hero> heroes, Enemy enemy) {
		this.setHero(heroes);
		this.setEnemy(enemy);
	}

	public Battle(ArrayList<Hero> heroes, ArrayList<Enemy> enemies) {
		this.setHero(heroes);
		this.setEnemy(enemies);
	}

	//***********************************
	// Methods
	//***********************************
	public void addHero(Hero hero) {
		this.heroes.add(hero);
	}

	public void addHero(ArrayList<Hero> heroes) {
		this.heroes.addAll(heroes);
	}

	public void addEnemy(Enemy enemy) {
		this.enemies.add(enemy);
	}

	public void addEnemy(ArrayList<Enemy> enemies) {
		this.enemies.addAll(enemies);
	}

	public void setHero(Hero hero) {
		this.heroes = new ArrayList<Hero>();
		this.heroes.add(hero);
	}

	public void setHero(ArrayList<Hero> heroes) {
		this.heroes = new ArrayList<Hero>();
		this.heroes.addAll(heroes);
	}

	public void setEnemy(Enemy enemy) {
		this.enemies = new ArrayList<Enemy>();
		this.enemies.add(enemy);
	}

	public void setEnemy(ArrayList<Enemy> enemies) {
		this.enemies = new ArrayList<Enemy>();
		this.enemies.addAll(enemies);
	}

	private ArrayList<Item> generateCardList() {
		// 当前打算按照己方全部操作结束之后敌方操作写
		for (hero:heroes) {
			int activeSet = hero.getActiveSet();
			HashMap<Integer, Integer> cards = hero.getSet(activeSet);
			this.shuffle(cards);

		}
	}

	private void shuffle(HashMap<Integer, Integer> cards) {
		
	}

	private int[] getHeroHP() {
		int[] HeroHP = new int[heroes.size()];
		for (int i=0;i<heroes.size();i++) {
			int[i] = heroes.get(i).getHP
		}
	}
	// 这边我写不下去了，需要先商量好如何做在线模式。（在线 和 多人）
	// 理论上来讲，应该是单人在本地新建探险，多人选择战役和卡组之后在服务器新建探险。
	// 那么，每一场冒险就应该有一个独立的id，在开始冒险时（所有人准备就绪）生成。随机码生成则不需要考虑这些问题。
	// ok 我们假设此时已经所有人都在同一个session，服务器收到开始战斗的请求后所有人都应该收到服务器传来的相同的随机序列，然后渲染动画。在战斗结束时
	public void start() {
		int[] HeroHP = new int[heroes.size()];
		int[] HeroMP = 
		for (hero:heroes) {

		}
	}



}