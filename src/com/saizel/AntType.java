package com.saizel;

public enum AntType {
    TANK(300, 10, 55, 30.5), FAST(100, 40, 50, 31.3), BALANCED(200, 30, 60, 33.12);
    private int health;
    private int damage;
    private int maxEnergy;
    private double maxWeight;

    private AntType(int health, int damage, int maxEnergy, double maxWeight) {
        this.health = health;
        this.damage = damage;
        this.maxEnergy = maxEnergy;
        this.maxWeight = maxWeight;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}