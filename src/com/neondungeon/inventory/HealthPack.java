package com.neondungeon.inventory;

/**
 * Health pack item for restoring player health
 */
public class HealthPack extends Item {
    private int healAmount;

    public HealthPack(int healAmount) {
        super("Health Pack", "Restores " + healAmount + " HP", 0);
        this.healAmount = healAmount;
    }

    @Override
    public void use() {
        System.out.println("Used " + name + "! Restored " + healAmount + " HP");
    }

    public int getHealAmount() {
        return healAmount;
    }
}
