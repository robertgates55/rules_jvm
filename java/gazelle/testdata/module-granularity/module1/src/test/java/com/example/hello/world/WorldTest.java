package com.example.hello.world;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class WorldTest {

    @Test
    public void testWorld() {
        assertEquals("", "World", World.World());
    }
}
