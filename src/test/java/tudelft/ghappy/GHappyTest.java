package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void StringWithoutG(){
        boolean result = new GHappy().gHappy("rrrrrrrrrrrrrrr");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void StringWithOneG(){
        boolean result = new GHappy().gHappy("rrrgrrrrrrrr");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void StringWithAPairOfGs(){
        boolean result = new GHappy().gHappy("rrrrrrggrrrrrr");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void StringWithSingleGAndSomePairsOfGs(){
        boolean result = new GHappy().gHappy("rrrggrrrrggrrrgrr");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void StringOfGs(){
        boolean result = new GHappy().gHappy("ggggggggg");
        Assertions.assertEquals(true, result);
    }



}

