/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dod
 */
public class SumTest {
    
    public SumTest() {
    }

    @org.junit.Test
    public void testAdd() {
        Sum test=new Sum();
        assertEquals(test.add(1, 2),3);
    }
}
