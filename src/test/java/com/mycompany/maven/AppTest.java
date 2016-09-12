package com.mycompany.maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testMethod() {
        fail("Testing Method");
    }
}
