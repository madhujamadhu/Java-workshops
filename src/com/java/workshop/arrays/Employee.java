package src.com.java.workshop.arrays;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        String employees[][]=new String[5][2];
        employees[0][0]="101";
        employees[0][1]="10000";
        employees[1][0]="102";
        employees[1][1]="25000";
        employees[2][0]="103";
        employees[2][1]="14500";
        employees[3][0]="104";
        employees[3][1]="32450";
        employees[4][0]="105";
        employees[4][1]="15400";
        for(String[]employee:employees)
        {
            System.out.println(Arrays.toString(employee));
        }




    }
}


