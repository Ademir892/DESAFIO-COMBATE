package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	private String nameB;
	private int lifeB;
	private int attackB;
	private int armorB;
	

	public void ChampionOther(String nameB, int lifeB, int attackB, int armorB) {
		this.nameB = nameB;
		this.lifeB = lifeB;
		this.attackB = attackB;
		this.armorB = armorB;
	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public void takeDamage(int attack, int armor, int attackB, int armorB) {
	    life = life - attackB + armor;
	    lifeB = lifeB - attack + armorB;

	    if (armor > attackB) {
	    	life = life - 1;
	    }
	    else if (armorB > attack) {
	        lifeB = lifeB - 1;
	    }
	}

	
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getLifeB() {
		return lifeB;
	}

	public void setLifeB(int lifeB) {
		this.lifeB = lifeB;
	}

	public int getAttackB() {
		return attackB;
	}

	public void setAttackB(int attackB) {
		this.attackB = attackB;
	}

	public int getArmorB() {
		return armorB;
	}

	public void setArmorB(int armorB) {
		this.armorB = armorB;
	}

	public String status() {	    
		String status = name + ": ";

	    if (life > 0) {
	        status += life + " de vida ";
	    } else {
	        status += life +" de vida (morreu)\n" ;
	        System.out.println();
	        System.out.println("FIM DO COMBATE");
	    }

	    return status;
	}
	
}
