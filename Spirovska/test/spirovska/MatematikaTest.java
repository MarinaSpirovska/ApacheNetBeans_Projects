/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package spirovska;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class MatematikaTest {
    
    public MatematikaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pPravoagolnik method, of class Matematika.
     */
    @Test
    public void testPPravoagolnik() {
        System.out.println("pPravoagolnik");
        int a = 0;
        int b = 0;
        Matematika instance = new Matematika();
        instance.pPravoagolnik(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pKruznica method, of class Matematika.
     */
    @Test
    public void testPKruznica() {
        System.out.println("pKruznica");
        double r = 0.0;
        Matematika instance = new Matematika();
        instance.pKruznica(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
