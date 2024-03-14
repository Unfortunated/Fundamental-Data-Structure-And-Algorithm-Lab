package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;

	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
	
	public UnitCard(String name, int bloodCost, int power, int health, String flavorText) {
		setName(name);
		setBloodCost(bloodCost);
		setPower(power);
		setHealth(health);
		setFlavorText(flavorText);
	}
	
	public void setName(String name) {
		if (name.isBlank()) {
			this.name = "Creature";
		} else {
			this.name = name;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBloodCost(int bloodCost) {
		if (bloodCost < 0) {
			this.bloodCost = 0;
		} else {
			this.bloodCost = bloodCost;
		}
	}
	
	public int getBloodCost() {
		return this.bloodCost;
	}
	
	public void setPower(int power) {
		if (power < 0) {
			this.power = 0;
		} else {
			this.power = power;
		}
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setHealth(int Health) {
		if (Health < 1) {
			this.health = 1;
		} else {
			this.health = Health;
		}
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}
	
	public String getFlavorText() {
		return this.flavorText;
	}
	
	public boolean equals(UnitCard other) {
		if (this.name.equals(other.name)) {
			return true;
		} else {
			return false;
		}
	}
}
