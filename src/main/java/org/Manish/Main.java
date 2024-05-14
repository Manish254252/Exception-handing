package org.Manish;

public class Main {
    public static void main(String[] args) {

        int a = 10 ;
        int b =10;
        int c=0;
        String s = "null";
        try{
             c = a/b; //Division by zero
             s= s.toLowerCase();//Null value
            System.out.println(s);
        }catch (ArithmeticException | NullPointerException e ){
            System.err.println("Exception :"+e.getMessage());
        }
        System.out.println(c);
        try
        {
            divide(5,10);
            divide(5,0);
        }catch (ArithmeticException e )
        {
//            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }

    }
    public static void divide(int x , int y ) throws ArithmeticException{
        int q;
        q=x/y;
        System.out.println(q);
    }
}