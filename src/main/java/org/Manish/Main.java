package org.Manish;

public class Main {
    public static void main(String[] args) {

        int a = 10 ;
        int b =10;
        int c=0;
        String s = null;
        try{
             c = a/b; //Division by zero
             s= s.toLowerCase();//Null value
        }catch (ArithmeticException e ){
            System.err.println("Exception :"+e.getMessage());
        }catch (NullPointerException e){
            System.err.println("Exception :"+e.getMessage());
        }
        System.out.println(c);

    }
}