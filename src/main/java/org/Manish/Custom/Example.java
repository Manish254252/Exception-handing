package org.Manish.Custom;


public class Example {
    public static void main(String[] args) {
        try {

           if(above18(2))
           {
               System.out.println("Right age");

           }else {
               throw new CustomEx("Below the right age",new Throwable("Not right age"));
           }
        } catch (CustomEx e) {
            // Catch and handle the custom exception
            System.out.println("Custom exception caught: " + e.getMessage());
            System.out.println("Custom exception caught: " + e.getCause());

        }
    }

    public static boolean above18(int age)
    {
        return age >= 18;
    }
}