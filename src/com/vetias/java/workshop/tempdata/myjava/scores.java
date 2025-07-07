package src.com.vetias.java.workshop.tempdata.myjava;

import java.util.Scanner;

public class scores {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        float score=scan.nextFloat();
        String department=scan.next();
        System.out.println("name:"+name);
        System.out.println("score:"+score/10);
        System.out.println("department:"+department);
    }
    
}
