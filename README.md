# Neon Dungeon 🎮

A top-down dungeon crawler game built in Java with procedurally generated levels, AI-driven enemies, and a complete save system.

## 🎮 Download & Play

**[👉 DOWNLOAD LATEST RELEASE](https://github.com/KS22-bot/Neon-dungeon/releases)**

### Quick Start
```bash
# Make sure Java 11+ is installed
java -jar Neon-Dungeon.jar
```

---

## ✨ Game Features

### 🎮 Gameplay
- ✅ **Procedurally Generated Dungeons** - Unique levels every playthrough
- ✅ **Dynamic AI Enemies** - 3 enemy types with intelligent behaviors
- ✅ **Real-time Combat** - Shoot projectiles and defeat enemies
- ✅ **Score System** - Track kills and progression
- ✅ **Item Collection** - Pickup power-ups throughout the level

### 💪 Power-ups & Items
- 🩹 **Health Packs** - Restore your health
- ⚡ **Damage Boosts** - Increase attack power temporarily
- 🛡️ **Shields** - Reduce incoming damage
- 🎨 **Rarity System** - Common to Legendary items
- 🔄 **Inventory System** - 20-slot inventory management

### 🖥️ User Interface
- 🌌 **Neon-Style Menu** - Beautiful main menu
- 📦 **Inventory Screen** - View and manage items
- 📊 **Stats Screen** - Check your progress
- 💾 **Save/Load System** - Multiple save slots with timestamps
- ⏸️ **Pause Menu** - Pause and resume anytime
- 📈 **Live HUD** - Real-time health, score, and enemy count

---

## 🎮 Controls

| Key | Action |
|-----|--------|
| **↑↓←→** or **WASD** | Move |
| **SPACE** | Attack / Confirm |
| **I** | Inventory |
| **TAB** | Stats |
| **F5** | Save Game |
| **F9** | Load Game |
| **ESC** | Pause / Back |

---

## 🏗️ Project Architecture

```
src/com/neondungeon/
├── Main.java                    # Entry point
├── game/                        # Game engine
│   ├── Game.java
│   ├── GamePanel.java
│   ├── GameState.java
│   └── GameTimer.java
├── entities/                    # Game objects
│   ├── Entity.java
│   ├── Player.java
│   ├── Enemy.java
│   └── Projectile.java
├── ai/                          # AI system
│   ├── AIBehavior.java
│   ├── PatrolBehavior.java
│   ├── ChaseBehavior.java
│   └── AttackBehavior.java
├── world/                       # Level & collision
│   ├── Level.java
│   ├── LevelGenerator.java
│   ├── Collision.java
│   └── Pickup.java
├── input/                       # Input handling
│   └── InputManager.java
├── graphics/                    # Graphics system
│   └── Animation.java
├── inventory/                   # Item system
│   ├── Item.java
│   ├── Inventory.java
│   ├── HealthPack.java
│   ├── DamageBoost.java
│   └── Shield.java
├── save/                        # Persistence
│   ├── SaveManager.java
│   └── GameData.java
└── ui/                          # User Interface
    ├── InventoryScreen.java
    ├── StatsScreen.java
    └── SaveLoadScreen.java
```

---

## 🛠️ Build from Source

### Prerequisites
- **Java Development Kit (JDK)** 11 or higher
- **Maven** 3.6+ (optional)

### Build with Maven
```bash
# Clone repository
git clone https://github.com/KS22-bot/Neon-dungeon.git
cd Neon-dungeon

# Build
mvn clean package

# Run
java -jar target/Neon-Dungeon.jar
```

### Manual Compilation
```bash
# Compile
javac -d bin src/com/neondungeon/**/*.java

# Create JAR
jar cfe Neon-Dungeon.jar com.neondungeon.Main -C bin .

# Run
java -jar Neon-Dungeon.jar
```

---

## 📊 Game Systems

### 1. Procedural Level Generation
- Cellular automata algorithm
- Unique dungeon layouts
- Random enemy spawning

### 2. AI System
- **Patrol**: Enemies patrol between waypoints
- **Chase**: Enemies pursue player when in range
- **Attack**: Enemies attack when close enough

### 3. Save/Load System
- Automatic state serialization
- Multiple save slots
- Timestamp tracking

### 4. Combat System
- Projectile firing
- Collision detection
- Damage calculation

### 5. Animation System
- Frame-based animations
- Smooth movement effects
- Item pickup animations

---

## 🎯 Enemy Types

| Enemy | Health | Speed | Behavior |
|-------|--------|-------|----------|
| **Goblin** | 20 | Fast | Patrol & Chase |
| **Orc** | 50 | Medium | Patrol & Chase |
| **Skeleton** | 30 | Fast | Patrol & Chase |

---

## 💡 Tips for Players

1. **Manage Health** - Use health packs strategically
2. **Explore** - Find power-ups scattered throughout
3. **Save Often** - Press F5 to save progress
4. **Avoid Crowds** - Don't let multiple enemies surround you
5. **Use Boosts** - Damage boosts help in tough situations

---

## 📝 License

MIT License - Open source project

---

## 👨‍💻 Developer

**KS22-bot** - Game Development Learning Project

---

**Enjoy Neon Dungeon! 🎮✨**
