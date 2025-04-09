//Source kata : https://codingdojo.org/kata/Employee-Report/
//Ressources :
// https://www.baeldung.com/java-comparing-objects
// https://www.jmdoudoux.fr/java/dej/chap-techniques_java.htm

package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KataEmployee
{
    public static void main( String[] args )
    {
        List<Employee> EmployeeList = new ArrayList<>();

        EmployeeList.add(new Employee("Max", 17));
        EmployeeList.add(new Employee("Sepp", 18));
        EmployeeList.add(new Employee("Nina", 15));
        EmployeeList.add(new Employee("mike", 51));

        //As shop owner I want to view a list of all employees who are 18 years or older
        //so that I know who is allowed to work on Sundays.

        for (Employee employee: EmployeeList) {
            if (employee.isMajeur()){
                System.out.println( employee + " est majeur" );
            }
            else {
                System.out.println( employee + " est pas majeur");
            }
        }

        //As shop owner I want the list of employees to be sorted by their name,
        //so I can find employees easier.

        SortEmployeeListByName(EmployeeList);

        System.out.println( "Bonjour je suis le trieur par nom");

        for (Employee employee: EmployeeList) {
            if (employee.isMajeur()){
                System.out.println( employee + " est majeur" );
            }
            else {
                System.out.println( employee + " est pas majeur");
            }
        }

        Comparator<Employee> compareByAge = Comparator.comparing(Employee::getAge);
        EmployeeList.sort(compareByAge);

        System.out.println( "Bonjour je suis le trieur par age");

        for (Employee employee: EmployeeList) {
            if (employee.isMajeur()){
                System.out.println( employee + " est majeur" );
            }
            else {
                System.out.println( employee + " est pas majeur");
            }
        }
    }

    public static void SortEmployeeListByName(List<Employee> EmployeeList){

        //Case Sensitive:
        //Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
        //EmployeeList.sort(compareByName);

        //Pas Case sensitive syntaxe 1:
        //Comparator<Employee> compareByName = (Employee c1, Employee c2) -> c1.getName().toUpperCase().compareTo(c2.getName().toUpperCase());
        //EmployeeList.sort(compareByName);

        //Pas Case sensitive syntaxe 2:
        Comparator<Employee> compareByName = Comparator.comparing((Employee c) -> c.getName().toUpperCase());
        EmployeeList.sort(compareByName);
    }
}
