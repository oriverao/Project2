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
import game.framework.Vector2;
/**
 *
 * @author Rivera-O'Rourke
 */
public class Test1 {
    public Vector2 v1 = null;
    public Vector2 v2;
    public Test1() {
       v1 = new Vector2(2.0f, 3.0f);
       v2 = new Vector2();
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
    public void TestBaseConstructor() {
      assertNotNull(v2);
    }
    @Test 
    public void TestConstructor(){
        assertNotEquals(v1, v2);
    }
    @Test
    public void TestToString() {
       String s1, s2;
       s1 = "<" + 2.0 + "," + 3.0 + ">";
       s2 = v1.toString();
       assertEquals(s1, s2);
       
    }
}
