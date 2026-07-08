package com.neondungeon.save;

/**
 * Data structure for serializing game state
 */
public class GameData {
    public int level;
    public int playerX;
    public int playerY;
    public int playerHealth;
    public int score;
    public long timestamp;

    public GameData() {
        this.level = 1;
        this.playerX = 400;
        this.playerY = 300;
        this.playerHealth = 100;
        this.score = 0;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "GameData{" +
                "level=" + level +
                ", playerX=" + playerX +
                ", playerY=" + playerY +
                ", playerHealth=" + playerHealth +
                ", score=" + score +
                ", timestamp=" + timestamp +
                '}';
    }
}
