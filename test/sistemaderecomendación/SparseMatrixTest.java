/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderecomendación;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class SparseMatrixTest {
    
    public SparseMatrixTest() {
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

    @Test
    public void testDefaultValue() {
        SparseMatrix matrix = new SparseMatrix(10, 10000);
        assertEquals(matrix.at(0, 0), 0.0, 1e-10);
    }
    
    @Test
    public void testInsertedValues() {
        SparseMatrix matrix = new SparseMatrix(10, 10000);
        matrix.add(1, 2, 3.5);
        assertEquals(matrix.at(1, 2), 3.5, 1e-10);
    }
    
}
