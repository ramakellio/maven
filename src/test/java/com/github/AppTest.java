package com.github;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest 
{
    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello world", app.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testFalse()
    {
        assertFalse( true );
    }
}
