package com.codegym;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String [] isClass = new String[] {"C0220H1", "A0220G2", "P0220M3", "M0220G1", "P0220A1"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classes : isClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Classes is " + classes +" is valid: " + isvalid);

        }
    }
}
