package com.neondungeon.ai;

import com.neondungeon.entities.Entity;

/**
 * Interface for AI behaviors
 */
public interface AIBehavior {
    /**
     * Update behavior each frame
     * @param owner The entity that owns this behavior
     * @param deltaTime Time since last frame
     */
    void update(Entity owner, float deltaTime);

    /**
     * Check if behavior should transition to another
     */
    boolean shouldTransition();
}
