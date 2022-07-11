package com.blz.emp_wage;

public class Employee_Wage {
    static final int isPresent = 1;
    static final int isPartime_present = 2;
    static int working_day_per_month = 20;
    static int wage_per_hour = 20;
    static int full_day_hours = 8;
    static int part_time_hours = 4;
    static int wage = 0;
    static int total_wage = 0;

    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        for (int day = 1; day <= working_day_per_month; day++) {
            int checkRandom = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkRandom) {
                case isPresent:
                    System.out.println("Employee is present: " + day);
                    wage = wage_per_hour * full_day_hours;
                    total_wage = total_wage + wage;
                    break;
                case isPartime_present:
                    System.out.println("Employee is part time present: " + day);
                    wage = wage_per_hour * part_time_hours;
                    total_wage = total_wage + wage;
                    break;
                default:
                    System.out.println("Employee is absent: " + day);
                    break;

            }

        }

        System.out.println("Month Employee Wage: " + total_wage);
    }
}


