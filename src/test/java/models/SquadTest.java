package models;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquadTest {
    @Test
    public void newSquad_getName_String() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("x-men",newSquad.getSquadName());
    }
    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals(8,newSquad.getSize());
    }
}