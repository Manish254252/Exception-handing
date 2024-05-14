package org.Manish;

public class Main {
    public static void main(String[] args) {

        int a = 10 ;
        int b =0;
        int c=0;
        try{
             c = a/b;
        }catch (ArithmeticException e ){
            System.err.println("Exception :"+e.getMessage());
        }
        System.out.println(c);

    }
}