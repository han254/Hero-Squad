package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroTest {

    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.setUpFirstHero();
        assertEquals("Mahrez",newHero.getName());
    }
    @Test
    public void newHero_getAge_Int() {
        Hero newHero = Hero.setUpFirstHero();
        assertEquals(26,newHero.getAge());
    }
    @Test
    public void newHero_getPower_String() {
        Hero newHero = Hero.setUpFirstHero();
        assertEquals("Running",newHero.getPower());
    }
    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.setUpFirstHero();
        assertEquals("control",newHero.getWeakness());
    }
}