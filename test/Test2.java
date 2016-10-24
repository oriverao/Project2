/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import game.framework.Rectangle;
/**
 *
 * @author Rivera-O'Rourke
 */
public class Test2 {
    Rectangle r1 = null;
    Rectangle r2;
    public Test2() {
        r1 = new Rectangle(3,3,2,4);
        r2 = new Rectangle(r1);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestCreation() {
        assertNotNull(r1);
    }
    @Test
    public void TestCopyConstructor() {
        assertEquals(r1, r2);
    }
    @Test
    public void TesttoString() {
        String s1, s2; 
        s1 = "X-Pos: 3, Y-Pos: 3, Width: 2, Height: 4";
        s2 = r1.toString();
    }
}
