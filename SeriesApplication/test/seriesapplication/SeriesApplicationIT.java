/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package seriesapplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author masho
 */
public class SeriesApplicationIT {
    
    public SeriesApplicationIT() {
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
     * Test of main method, of class SeriesApplication.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SeriesApplication.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CaptureSeries method, of class SeriesApplication.
     */
    @Test
    public void testCaptureSeries() {
        System.out.println("CaptureSeries");
        SeriesApplication instance = new SeriesApplication();
        instance.CaptureSeries();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchSeries method, of class SeriesApplication.
     */
    @Test
    public void testSearchSeries() {
        System.out.println("SearchSeries");
        SeriesApplication instance = new SeriesApplication();
        instance.SearchSeries();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateSeries method, of class SeriesApplication.
     */
    @Test
    public void testUpdateSeries() {
        System.out.println("UpdateSeries");
        SeriesApplication instance = new SeriesApplication();
        instance.UpdateSeries();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteSeries method, of class SeriesApplication.
     */
    @Test
    public void testDeleteSeries() {
        System.out.println("DeleteSeries");
        SeriesApplication instance = new SeriesApplication();
        instance.DeleteSeries();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SeriesReport method, of class SeriesApplication.
     */
    @Test
    public void testSeriesReport() {
        System.out.println("SeriesReport");
        SeriesApplication instance = new SeriesApplication();
        instance.SeriesReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExitSeriesApplication method, of class SeriesApplication.
     */
    @Test
    public void testExitSeriesApplication() {
        System.out.println("ExitSeriesApplication");
        SeriesApplication instance = new SeriesApplication();
        instance.ExitSeriesApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
