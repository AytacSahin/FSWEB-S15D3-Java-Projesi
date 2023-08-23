package com.workintech.employee.main;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Firstname1", "Surname1"));
        employees.add(new Employee(1, "idfail1", "Surname1"));
        employees.add(new Employee(2, "Firstname2", "Surname2"));
        employees.add(new Employee(2, "idfail2", "Surname2"));
        employees.add(new Employee(3, "Firstname3", "Surname3"));
        employees.add(new Employee(3, "idfail3", "Surname3"));

        // Employee LinkedList'imiz aşağıdaki gibi görüntüleyebiliriz:
        System.out.println("[1] Tutulan İlk Liste: (LinkedList)\n" + employees);

        // employeeMap, benzersiz listeleri tutar: (id ezdik) (HashMap)
        Map<Integer, Employee> employeeMap = new HashMap<>();
        // Tekrar eden ve listeden çıkaracağımız elemanları bu listeye attık: (ArrayList)
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println("[2] Benzersiz Liste: (LinkedList)\n" + employees);
        System.out.println("[3] Benzersiz Liste: (HashMap)\n" + employeeMap);
        System.out.println("[4] Id'si aynı olan silinenler listesi: (ArrayList)\n" + removedEmployees);


    }
}