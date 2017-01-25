package Connexion;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITU
 */
public class ConnexionTest
{
    
    public ConnexionTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getConn method, of class Connexion.
     */
    @Test
    public void testGetConn()
    {
        System.out.println("getConn");
        Connection expResult = null;
        Connection result = Connexion.getConn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastsequence method, of class Connexion.
     */
    @Test
    public void testGetLastsequence()
    {
        System.out.println("getLastsequence");
        String nomseq = "";
        int expResult = 0;
        int result = Connexion.getLastsequence(nomseq);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrsequence method, of class Connexion.
     */
    @Test
    public void testGetCurrsequence()
    {
        System.out.println("getCurrsequence");
        String nomseq = "";
        int expResult = 0;
        int result = Connexion.getCurrsequence(nomseq);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentsequence method, of class Connexion.
     */
    @Test
    public void testGetRecentsequence()
    {
        System.out.println("getRecentsequence");
        int expResult = 0;
        int result = Connexion.getRecentsequence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
