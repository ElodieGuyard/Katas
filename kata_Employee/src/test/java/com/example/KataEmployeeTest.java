package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class KataEmployeeTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public KataEmployeeTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( KataEmployeeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testWhenGivenMajeurEmployeeThenIsMajeurReturnTrue(){
        Employee testeur1 = new Employee("Patrick", 56);
        Employee testeur2 = new Employee("Kevin", 18);

        assertTrue("Patrick est majeur", testeur1.isMajeur());
        assertTrue("Kevin est majeur", testeur2.isMajeur());
    }

    public void testWhenGivenMineurEmployeeThenIsMajeurReturnFalse()
    {
        Employee testeur1 = new Employee("Patrick", 12);
        Employee testeur2 = new Employee("Kevin", 16);

        assertFalse("Patrick est mineur", testeur1.isMajeur());
        assertFalse("Kevin est mineur", testeur2.isMajeur());
    }

    public void testWhenGivenEmployeeListThenEmployeeListIsSorted()
    {
        List<Employee> EmployeeList = new ArrayList<>();

        EmployeeList.add(new Employee("Max", 17));
        EmployeeList.add(new Employee("Sepp", 18));
        EmployeeList.add(new Employee("Nina", 15));
        EmployeeList.add(new Employee("mike", 51));

        KataEmployee.SortEmployeeListByName(EmployeeList);

        assertEquals("Max", EmployeeList.get(0).getName());
        assertEquals("mike", EmployeeList.get(1).getName());
        assertEquals("Nina", EmployeeList.get(2).getName());
        assertEquals("Sepp", EmployeeList.get(3).getName());
    }
}
