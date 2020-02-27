package com.saizel;

import java.util.Scanner;

public class Ant {
    private int x, y;
    private String name;
    private int energy;
    private AntType type;
    private double weight;
    private int health;

    private Ant(int x, int y, int energy, String name, AntType type, double weight, int health) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.energy = energy;
        this.type = type;
        this.weight = weight;
        this.health = health;
        System.out.println("Created new Ant, name: " + name);
    }

    public Ant(String name, AntType type) {
        this(0, 0, type.getMaxEnergy(), name, type, type.getMaxWeight(), type.getHealth());
    }

    public Ant() {
        this("BotAnt", AntType.BALANCED);
    }

    //Мураха їсть
    public void eat() {
        if (energy < type.getMaxEnergy()) {
            energy += 1;
            System.out.println("Energy lvl is up;\n Energy - " + energy);
        } else {
            System.out.println("Error, max lvl of energy");
        }
    }

    //Мураха рухається
    public void move(int x, int y) {
        int move = Math.abs(x - this.x) + Math.abs(y - this.y);
        if (weight > type.getMaxWeight() * 0.75) {
            move *= 2;
        }
        if (move < energy) {
            this.x = x;
            this.y = y;
            energy -= move;
            System.out.println("Energy lvl: " + energy);
        } else {
            System.out.println("Cant move there, no energy! ");
        }

    }


    //Піднімає щось для перенесення
    public void takeToPull(int weight) {
        if (weight + this.weight < type.getMaxWeight()) {
            this.weight += weight;
            System.out.println("New weight: " + this.weight);
        } else {
            System.out.println("Cant take it.");
        }
    }

    public void fight(Ant ant) {
        health -= ant.getType().getDamage();
        ant.setHealth(getHealth() - type.getDamage());
        System.out.println("Fight: \n " + name + " HP = " + health);
        System.out.println(ant.getName() + "HP = " + ant.getHealth());
    }

    public void print() {
        System.out.println("Name: " + name + ", health: " +  health + ", energy: " + energy + " ,damage: " + type.getDamage() + ",type:" + type);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public AntType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setType(AntType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
