package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int value = 5;

        SampleFunctionInterface fi = (int x) -> x * x;

        int result = fi.calculate(value);

        System.out.println(result  );


        /////
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        if (s1 == s2)
            System.out.println("s1 == s2");
        if (s1 == s3)
            System.out.println("s1 == s3");
        if (s2 == s3) 
            System.out.println("s2 == s3");
    }
}
