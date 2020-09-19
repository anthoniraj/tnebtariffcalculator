package com.anignakb.tneb;
/**
 * Demo Program for Creating Java Class Methods
 * @author anthoniraj
 * @version 1.0
 * @since 2020-09-17
 */
public class MethodDemo {
    /**
     * This method is used for adding two numbers
     * @param a first argument
     * @param b second argument
     * @return int this method returns an interger value
     */
    public int add(int a, int b){
        return (a+b);
    }

    /**
     * This static method is used for multiplying two number
     * @param a first argument
     * @param b second argument
     * @return int this method returns an interger value     *
     */
    public static int multiply(int a, int b){
        return (a*b);
    }

    /**
     * This is the main method
     * @param args this is unused argument
     */
    public static void main(String[] args) {
        //This is the Method Demo Object
        MethodDemo demo = new MethodDemo();
        /*
          This is the multiline comment
          Second line
         */
        System.out.println("The addition is "+demo.add(10,20));
        System.out.println("The multiplication is "+multiply(30,50));
    }
}
