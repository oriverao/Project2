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
import game.framework.Quaternion;
import game.framework.Vector3;
/**
 *
 * @author Rivera-O'Rourke
 */
public class Test3 {
    Quaternion q1 = null;
    Quaternion q2;
    Vector3 v1;
    public Test3() {
        v1 = new Vector3(2.2f, 3.0f, 1.5f);
        q1 = new Quaternion(2.0f, 3.0f, 2.5f, 1.5f);
        q2 = new Quaternion(v1, 2.5f);
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
    public void TestConstructor() {
        assertNotNull(q1);
    }
    @Test
    public void TestConstructorWithVector() {
        assertNotNull(q2);
        assertNotEquals(q1, q2);
    }
    @Test
    public void TesttoString() {
        String s1, s2; 
        s1 = "(" + 2.0 + ", " + 3.0 + ", " + 2.5 + ", " + 1.5 + ")";
        s2 = q1.toString();
    }
}
