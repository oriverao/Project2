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
import game.framework.Vector3;
/**
 *
 * @author Rivera-O'Rourke
 */
public class Test4 {
    public Vector3 v1 = null;
    public Vector3 v2;
    public Test4() {
        v1 = new Vector3();
        v2 = new Vector3(2.2f, 3.0f, 1.5f);
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
      assertNotNull(v1);
    }
    @Test 
    public void TestConstructor(){
        assertNotNull(v2);
        assertNotEquals(v1, v2);
    }
    @Test
    public void TestToString() {
       String s1, s2;
       s1 = "<" + 2.2 + "," + 3.0 + "," + 1.5 + ">";
       s2 = v2.toString();
       assertEquals(s1, s2);
       
    }
}
